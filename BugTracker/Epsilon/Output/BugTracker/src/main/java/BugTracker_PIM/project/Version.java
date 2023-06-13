package BugTracker_PIM.project;

import BugTracker_PIM.base.DescriptionTitleObject;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="Version")
public class Version extends DescriptionTitleObject implements Serializable  {
	@Column(name="released")	private java.util.Date released;
	                        	@Column(name="updated")	private java.util.Date updated;
	                        	                       

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