package nuigalway.app.SoftEng;


import java.util.ArrayList;
import org.joda.time.*;

public class CourseProgramme {
	
	private String courseName;
	private ArrayList <Module> modules = new ArrayList<Module>();
	private ArrayList <Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	
	public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> students,
			DateTime startDate, DateTime endDate) {
		super();
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	

}
