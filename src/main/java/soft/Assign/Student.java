package soft.Assign;

import java.util.List;

public class Student {
private String name;
private int age;
private String DOB;
private int id;
private String username;
private String courses;
private List<Module> modules;

public Student(String name, int age, String dOB, int id, String username, String courses, List<Module> modules) {
	super();
	this.name = name;
	this.age = age;
	DOB = dOB;
	this.id = id;
	this.username = username;
	this.courses = courses;
	this.modules = modules;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username=name+":"+age;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}
public List<Module> getModules() {
	return modules;
}
public void setModules(List<Module> modules) {
	this.modules = modules;
}

}
