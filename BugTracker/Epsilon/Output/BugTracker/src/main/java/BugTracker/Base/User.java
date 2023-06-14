package BugTracker.Base;

import BugTracker.Base.BaseObject;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User extends BaseObject implements Serializable  {
	@Column(name="name")	private String name;	@Column(name="password")	private String password;	@Column(name="userName")	private String userName;

	public void setName(String name) {
		this.name=name;
	}	public String getName() {
	 		return this.name;
	 	}	public void setUserName(String userName) {
	 	 		this.userName=userName;
	 	 	}	public String getUserName() {
	 	 	 		return this.userName;
	 	 	 	}	public void setPassword(String password) {
	 	 	 	 		this.password=password;
	 	 	 	 	}	public String getPassword() {
	 	 	 	 	 		return this.password;
	 	 	 	 	 	}



}