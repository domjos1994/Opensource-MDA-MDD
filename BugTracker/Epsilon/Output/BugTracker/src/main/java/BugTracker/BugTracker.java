package BugTracker;

import BugTracker.Project.Project;
import BugTracker.Project.Version;
import BugTracker.Issue.Issue;
import BugTracker.Base.User;
import BugTracker.Project.Project;
import BugTracker.Project.Version;
import BugTracker.Issue.Issue;
import BugTracker.Base.User;
import BugTracker.Issue.Issue;
import BugTracker.Project.Version;
import BugTracker.Project.Project;
import BugTracker.Issue.Issue;
import BugTracker.Base.User;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class BugTracker {
	private Project project;
	private Version version;
	private Issue issue;
	private State state;
	public User user;


	private void setProject(Project project) {
		this.project=project;
	}
	private void setVersion(Version version) {
		this.version=version;
	}
	private void setIssue(Issue issue) {
		this.issue=issue;
	}
	private void setDeveloper(User user) {
		this.user=user;
	}
	private void setState(State state) {
		this.state=state;
	}
	private Boolean issueExists(Issue issue) {
		if((issue.getID()==null)==true) {
	return false;
} else if((issue.getID()==null)==false) {
	return issue.getID()!=0;
}
return false;

	}
	private void save() {
		SessionFactory sessionFactory = new Configuration().
			configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
session.persist(user);
		session.persist(project);
		session.persist(version);
		session.persist(issue);
transaction.commit();

	}
	public void saveIssue(Version version, Project project, Issue issue, User developer) {
		version.project = project;
		this.setProject(project);
this.setVersion(version);
		issue.version = version;
this.setDeveloper(developer);
		issue.user = developer;
		setIssue(issue);
if(issueExists(issue)==true) {
	setState(State.updatedIssue);
} else if(issueExists(issue)==false) {
	setState(State.newIssue);
}
save();

	}


	public enum State {
		newIssue,
		updatedIssue
	}

}