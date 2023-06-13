package BugTracker_PIM.base;

import BugTracker_PIM.base.IdObject;
import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class DescriptionTitleObject extends IdObject implements Serializable  {
	@Column(name="Description")	private String Description;
	                           	@Column(name="Title")	private String Title;
	                           	                     

	public void setDescription(String Description) {
		this.Description=Description;
	}
	public String getDescription() {
		return this.Description;
	}
	public void setTitle(String Title) {
		this.Title=Title;
	}
	public String getTitle() {
		return this.Title;
	}




}