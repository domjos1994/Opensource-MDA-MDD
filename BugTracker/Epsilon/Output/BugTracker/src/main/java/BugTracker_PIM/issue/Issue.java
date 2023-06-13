package BugTracker_PIM.issue;

import BugTracker_PIM.base.DescriptionTitleObject;
import BugTracker_PIM.project.Project;
import BugTracker_PIM.issue.Tag;
import BugTracker_PIM.issue.Category;
import BugTracker_PIM.base.User;
import BugTracker_PIM.project.Version;
import BugTracker_PIM.project.Project;
import BugTracker_PIM.project.Project;
import BugTracker_PIM.issue.Tag;
import BugTracker_PIM.issue.Tag;
import BugTracker_PIM.issue.Category;
import BugTracker_PIM.issue.Category;
import BugTracker_PIM.base.User;
import BugTracker_PIM.base.User;
import BugTracker_PIM.project.Version;
import BugTracker_PIM.project.Version;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="Issue")
public class Issue extends DescriptionTitleObject implements Serializable  {
	@Column(name="Summary")	private String Summary;
	                       	@OneToOne(cascade=CascadeType.ALL)
	                       	@JoinColumn(name="project", referencedColumnName="ID")	private Project project;
	                       	                                                      	@OneToOne(cascade=CascadeType.ALL)
	                       	                                                      	@JoinColumn(name="tag", referencedColumnName="ID")	private Tag tag;
	                       	                                                      	                                                  	@OneToOne(cascade=CascadeType.ALL)
	                       	                                                      	                                                  	@JoinColumn(name="category", referencedColumnName="ID")	private Category category;
	                       	                                                      	                                                  	                                                       	@OneToOne(cascade=CascadeType.ALL)
	                       	                                                      	                                                  	                                                       	@JoinColumn(name="user", referencedColumnName="ID")	private User user;
	                       	                                                      	                                                  	                                                       	                                                   	@OneToOne(cascade=CascadeType.ALL)
	                       	                                                      	                                                  	                                                       	                                                   	@JoinColumn(name="version", referencedColumnName="ID")	private Version version;
	                       	                                                      	                                                  	                                                       	                                                   	                                                      

	public void setSummary(String Summary) {
		this.Summary=Summary;
	}
	public String getSummary() {
		return this.Summary;
	}
	public void setProject(Project project) {
		this.project=project;
	}
	public Project getProject() {
		return this.project;
	}
	public void setTag(Tag tag) {
		this.tag=tag;
	}
	public Tag getTag() {
		return this.tag;
	}
	public void setCategory(Category category) {
		this.category=category;
	}
	public Category getCategory() {
		return this.category;
	}
	public void setUser(User user) {
		this.user=user;
	}
	public User getUser() {
		return this.user;
	}
	public void setVersion(Version version) {
		this.version=version;
	}
	public Version getVersion() {
		return this.version;
	}




}