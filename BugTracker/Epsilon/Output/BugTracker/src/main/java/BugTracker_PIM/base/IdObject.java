package BugTracker_PIM.base;

import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class IdObject implements Serializable  {
	@Column(name="id")
	                  
	                  

	public void setId(Integer id) {
		this.id=id;
	}







}