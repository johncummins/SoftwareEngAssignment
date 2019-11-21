package nuigalway.app.SoftEng;


import java.util.ArrayList;
import java.util.List;

public class Module {
	private String modName;
	private String modId;
	ArrayList <String> students = new ArrayList <String>();
	ArrayList <String> courses = new ArrayList <String>();
	
	
	public Module(String modName, String modId, ArrayList<String> students, ArrayList<String> courses) {
		this.modName = modName;
		this.modId = modId;
		this.students = students;
		this.courses = courses;
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
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(ArrayList <String> students) {
		this.students = students;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList <String> courses) {
		this.courses = courses;
	}
	
	
}
