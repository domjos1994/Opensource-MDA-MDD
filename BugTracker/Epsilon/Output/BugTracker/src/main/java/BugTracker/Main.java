package BugTracker;

import BugTracker.Base.User;
import BugTracker.Issue.Issue;
import BugTracker.Project.Project;
import BugTracker.Project.Version;

public class Main {
	public static void main(String[] args) {
		Project project = new Project();
		project.setTitle("Test-Project");
		project.setDescription("This is a Test-Project!");

		Version version = new Version();
		version.setTitle("1.0");
		version.setState("Development");

		User user = new User();
		user.setName("Dominic Joas");
		user.setUserName("domjos1994");

		Issue issue = new Issue();
		issue.setTitle("This is a Test-Issue");

		BugTracker bugTracker = new BugTracker();
		bugTracker.saveIssue(version, project, issue, user);
	}
}