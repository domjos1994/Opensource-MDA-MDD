package BugTracker_PIM.base;

import BugTracker_PIM.base.IdObject;
import BugTracker_PIM.project.Project;
import BugTracker_PIM.project.Project;
import BugTracker_PIM.project.Project;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User extends IdObject implements Serializable  {
	@Column(name="UserName")	private String UserName;
	                        	@Column(name="FirstName")	private String FirstName;
	                        	                         	@Column(name="LastName")	private String LastName;
	                        	                         	                        	@Column(name="Password")	private String Password;
	                        	                         	                        	                        	@OneToOne(cascade=CascadeType.ALL)
	                        	                         	                        	                        	@JoinColumn(name="project", referencedColumnName="ID")	private Project project;
	                        	                         	                        	                        	                                                      

	public void setUserName(String UserName) {
		this.UserName=UserName;
	}
	public String getUserName() {
		return this.UserName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	public String getFirstName() {
		return this.FirstName;
	}
	public void setLastName(String LastName) {
		this.LastName=LastName;
	}
	public String getLastName() {
		return this.LastName;
	}
	public void setPassword(String Password) {
		this.Password=Password;
	}
	public String getPassword() {
		return this.Password;
	}
	public void setProject(Project project) {
		this.project=project;
	}
	public Project getProject() {
		return this.project;
	}




}