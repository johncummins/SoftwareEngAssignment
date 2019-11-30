package nuigalway.app.SoftEng;


import java.util.ArrayList;
import java.util.List;

public class Module {
	private String modName;
	private String modId;
	private List<Student> students = new ArrayList<Student>();
	private List<CourseProgramme>courses = new ArrayList<CourseProgramme>();
	
	
	public Module(String modName, String modId, List<Student> students, List<CourseProgramme> courses) {
		super();
		this.modName = modName;
		this.modId = modId;
	}
	
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getModId() {
		return modId;
	}
	public void setModId(String modId) {
		this.modId = modId;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<CourseProgramme> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseProgramme> courses) {
		this.courses = courses;
	}

	
}
