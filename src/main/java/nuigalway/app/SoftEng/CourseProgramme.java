package nuigalway.app.SoftEng;


import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
	
	private String courseName;
	ArrayList <String> modules = new ArrayList<String>();
	ArrayList <String> students = new ArrayList<String>();
	DateTime startDate = DateTime.now();
	DateTime endDate = DateTime.now();
	
	public CourseProgramme(String courseName, ArrayList<String> modules, ArrayList<String> students, DateTime startDate,
			DateTime endDate) {
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
	public ArrayList<String> getModules() {
		return modules;
	}
	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
	public ArrayList<String> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<String> students) {
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
