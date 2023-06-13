package BugTracker.Base;

import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class BaseObject implements Serializable  {
	@Column(name="ID")	@Id
	                  	@GeneratedValue(strategy = GenerationType.AUTO)	private Integer ID;
	                  	                                               

	public void setID(Integer ID) {
		this.ID=ID;
	}
	public Integer getID() {
		return this.ID;
	}
	public BaseObject() {
		

	}
	public BaseObject(Integer ID) {
		

	}




}