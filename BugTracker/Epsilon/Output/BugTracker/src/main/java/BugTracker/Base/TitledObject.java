package BugTracker.Base;

import BugTracker.Base.BaseObject;
import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class TitledObject extends BaseObject implements Serializable  {
	@Column(name="title")	private String title;
	                     	@Column(name="description")	private String description;
	                     	                           

	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public String getDescription() {
		return this.description;
	}




}