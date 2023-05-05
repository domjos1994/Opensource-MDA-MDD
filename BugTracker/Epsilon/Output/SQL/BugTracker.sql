CREATE TABLE Category(title VARCHAR(255), description VARCHAR(255), ID Integer);
CREATE TABLE Tag(title VARCHAR(255), description VARCHAR(255), ID Integer);
CREATE TABLE User(ID Integer, name VARCHAR(255), password VARCHAR(255), userName VARCHAR(255));
CREATE TABLE Project(title VARCHAR(255), description VARCHAR(255), ID Integer, state VARCHAR(255), released EDate, updated EDate);
CREATE TABLE Version(title VARCHAR(255), description VARCHAR(255), ID Integer, state VARCHAR(255), released EDate, project Project);
CREATE TABLE Issue(title VARCHAR(255), description VARCHAR(255), ID Integer, summary VARCHAR(255), stepsToReproduce VARCHAR(255), OS VARCHAR(255), tag Tag, category Category, user User, version Version);

ALTER TABLE tag ADD COLUMN issue_id INTEGER;
ALTER TABLE tag ADD FOREIGN KEY(issue_id) REFERENCES issue(id);

ALTER TABLE category ADD COLUMN issue_id INTEGER;
ALTER TABLE category ADD FOREIGN KEY(issue_id) REFERENCES issue(id);

ALTER TABLE user ADD COLUMN issue_id INTEGER;
ALTER TABLE user ADD FOREIGN KEY(issue_id) REFERENCES issue(id);

ALTER TABLE version ADD COLUMN issue_id INTEGER;
ALTER TABLE version ADD FOREIGN KEY(issue_id) REFERENCES issue(id);

ALTER TABLE project ADD COLUMN version_id INTEGER;
ALTER TABLE project ADD FOREIGN KEY(version_id) REFERENCES version(id);

