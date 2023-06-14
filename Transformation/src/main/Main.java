package main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) {
		Document baseModel = readXML("../BugTracker/Epsilon/ETL/output/6_BugTracker.uml");
		Document modelToBeMerged = readXML("../BugTracker/Epsilon/ETL/BugTracker.uml");
		
		NodeList mnl = modelToBeMerged.getElementsByTagName("uml:Model");
		NodeList bnl = baseModel.getElementsByTagName("uml:Model");
		for(int i = 0; i<=mnl.getLength()-1; i++) {
			if(mnl.item(i).hasChildNodes()) {
				for(int j = 0; j<=mnl.item(i).getChildNodes().getLength()-1;j++) {
					Node child = mnl.item(i).getChildNodes().item(j);
					if(child != null) {
						if(child.hasAttributes()) {
							Node type = child.getAttributes().getNamedItem("xmi:type");
							if(type.getNodeValue().equals("uml:StateMachine")) {
								Node name = child.getAttributes().getNamedItem("name");
								((Element)child).setAttribute("specification", findBugTrackerFunction(baseModel, name.getNodeValue()));
								bnl.item(0).appendChild(baseModel.adoptNode(child));
							}
						}
					}
				}
			}
		}
		
		writeXml(baseModel, "../BugTracker/Epsilon/ETL/output/7_BugTracker.uml");
	}

	private static Document readXML(String path) {
		try {
			File file = new File(path);
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			return documentBuilder.parse(file);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	private static String findBugTrackerFunction(Document document, String name) {
		try {
			NodeList bnl = document.getElementsByTagName("uml:Model");
			
			for(int i = 0; i<=bnl.getLength()-1; i++) {
				Node bn = bnl.item(i);
				for(int j = 0; j<=bn.getChildNodes().getLength()-1; j++) {
					Node child = bn.getChildNodes().item(j);
					if(child!=null) {
						if(child.hasAttributes()) {
							for(int k = 0; k<=child.getAttributes().getLength()-1; k++) {
								Node attribute = child.getAttributes().item(k);
								if(attribute != null) {
									if(attribute.getNodeName().equals("xmi:type")) {
										if(attribute.getNodeValue().equals("uml:Class")) {
											for(int l = 0; l<=child.getChildNodes().getLength()-1; l++) {
												Node clsChild = child.getChildNodes().item(l);
												if(clsChild != null) {
													if(clsChild.getNodeName().equals("ownedOperation")) {
														Node item = clsChild.getAttributes().getNamedItem("name");
														if(item.getNodeValue().toLowerCase().equals(name.toLowerCase())) {
															return clsChild.getAttributes().getNamedItem("xmi:id").getNodeValue();
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	// write doc to output stream
    private static void writeXml(Document doc, String path) {
    	FileOutputStream output = null;
    	try {
    		output = new FileOutputStream(path);
    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(output);

            transformer.transform(source, result);
    	} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(output != null) {
				try {
					output.close();
				} catch(Exception ignored) {}
			}
		}
    }
}
