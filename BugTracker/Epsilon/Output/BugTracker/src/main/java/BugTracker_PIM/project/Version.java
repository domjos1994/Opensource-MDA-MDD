package BugTracker_PIM.project;

import BugTracker_PIM.base.DescriptionTitleObject;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="Version")
public class Version extends DescriptionTitleObject implements Serializable  {
	@Column(name="released")
	                        
	                        

	public void setReleased(java.util.Date released) {
		this.released=released;
	}













}