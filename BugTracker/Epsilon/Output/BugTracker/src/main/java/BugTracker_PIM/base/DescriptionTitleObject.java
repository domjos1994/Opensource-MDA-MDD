package BugTracker_PIM.base;

import BugTracker_PIM.base.IdObject;
import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class DescriptionTitleObject extends IdObject implements Serializable  {
	@Column(name="Description")
	                           
	                           

	public void setDescription(String Description) {
		this.Description=Description;
	}













}