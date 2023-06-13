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
	@JoinColumn(name="version", referencedColumnName="ID")
	                                                      
	                                                      

	public void setVersion(Version version) {
		this.version=version;
	}













}