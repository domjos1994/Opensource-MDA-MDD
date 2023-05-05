package BugTracker.Project;

import BugTracker.Base.TitledObject;
import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name="Project")
public class Project extends TitledObject implements Serializable  {
	@Column(name="state")
	private String state;

	@Column(name="released")
	private java.util.Date released;

	@Column(name="updated")
	private java.util.Date updated;



	public Project() {
		
		this.state = null;
		this.released = null;
		this.updated = null;
	}

	public Project(String state, java.util.Date released, java.util.Date updated) {
		if(released != null && updated != null && state != null){
			return;
		}
		this.state = state;
		this.released= released;
		this.updated = updated;
	}

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

	public void setUpdated(java.util.Date updated) {
		this.updated=updated;
	}

	public java.util.Date getUpdated() {
		return this.updated;
	}





}