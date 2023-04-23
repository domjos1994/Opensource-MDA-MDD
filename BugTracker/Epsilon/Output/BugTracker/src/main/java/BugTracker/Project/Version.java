package BugTracker.Project;

import BugTracker.Base.TitledObject;
import BugTracker.Project.Project;
import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name="Version")
public class Version extends TitledObject implements Serializable  {
	@Column(name="state")
	private String state;

	@Column(name="released")
	private java.util.Date released;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="project", referencedColumnName="ID")
	public Project project;



	public void setState(String state) {
		this.state=state;
	}

	public String getState() {
		return this.state;
	}

	public void setReleased(java.util.Date released) {
		this.released=released;
	}

	public java.util.Date getReleased() {
		return this.released;
	}





}