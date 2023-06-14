package BugTracker.Issue;

import BugTracker.Base.TitledObject;
import BugTracker.Base.Tag;
import BugTracker.Base.Category;
import BugTracker.Base.User;
import BugTracker.Project.Version;
import java.util.List;
import java.util.LinkedList;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="Issue")
public class Issue extends TitledObject implements Serializable  {
	@Column(name="summary")	private String summary;	@Column(name="stepsToReproduce")	private String stepsToReproduce;	@Column(name="OS")	private String OS;	@OneToMany(cascade=CascadeType.ALL)
	                       	                       	                                	                                	                  	                  	@JoinColumn(name="tag", referencedColumnName="ID")	public List<Tag> tag = new LinkedList<>();	@OneToOne(cascade=CascadeType.ALL)
	                       	                       	                                	                                	                  	                  	                                                  	                                          	@JoinColumn(name="category", referencedColumnName="ID")	public Category category;	@OneToOne(cascade=CascadeType.ALL)
	                       	                       	                                	                                	                  	                  	                                                  	                                          	                                                       	                         	@JoinColumn(name="user", referencedColumnName="ID")	public User user;	@OneToOne(cascade=CascadeType.ALL)
	                       	                       	                                	                                	                  	                  	                                                  	                                          	                                                       	                         	                                                   	                 	@JoinColumn(name="version", referencedColumnName="ID")	public Version version;

	public void setSummary(String summary) {
		this.summary=summary;
	}	public String getSummary() {
	 		return this.summary;
	 	}	public void setStepsToReproduce(String stepsToReproduce) {
	 	 		this.stepsToReproduce=stepsToReproduce;
	 	 	}	public String getStepsToReproduce() {
	 	 	 		return this.stepsToReproduce;
	 	 	 	}	public void setOS(String OS) {
	 	 	 	 		this.OS=OS;
	 	 	 	 	}	public String getOS() {
	 	 	 	 	 		return this.OS;
	 	 	 	 	 	}



}