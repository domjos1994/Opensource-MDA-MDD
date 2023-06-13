package BugTracker_PIM.project;

import BugTracker_PIM.base.DescriptionTitleObject;
import BugTracker_PIM.project.Version;
import BugTracker_PIM.project.Version;
import BugTracker_PIM.project.Version;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="Project")
public class Project extends DescriptionTitleObject implements Serializable  {
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="version", referencedColumnName="ID")	private Version version;
	                                                      	@Column(name="state")	private String state;
	                                                      	                     

	public void setVersion(Version version) {
		this.version=version;
	}
	public Version getVersion() {
		return this.version;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return this.state;
	}




}