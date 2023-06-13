package BugTracker_PIM.base;

import java.io.Serializable;
import jakarta.persistence.*;

@MappedSuperclass
public class IdObject implements Serializable  {
	@Column(name="id")	@Id
	                  	@GeneratedValue(strategy = GenerationType.AUTO)	private Integer id;
	                  	                                               

	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getId() {
		return this.id;
	}




}