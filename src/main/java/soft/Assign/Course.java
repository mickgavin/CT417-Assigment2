package soft.Assign;

import java.util.List;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	private List<Student>students;
	private List<Module>module;
	private DateTime start;
	private DateTime end;
	
	public Course(String courseName, List<Student> students, List<Module> module, DateTime start, DateTime end) {
		super();
		this.courseName = courseName;
		this.students = students;
		this.module = module;
		this.start = start;
		this.end = end;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public DateTime getStart() {
		return start;
	}
	public void setStart(DateTime start) {
		this.start = start;
	}
	public DateTime getEnd() {
		return end;
		
		
	}
	public void setEnd(DateTime end) {
		this.end = end;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	
	

}
