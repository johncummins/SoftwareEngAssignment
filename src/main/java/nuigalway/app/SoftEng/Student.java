package nuigalway.app.SoftEng;

import java.awt.List;
import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private String ID;
	private String username;
	private String courses;
	private ArrayList<String> RegisteredModules = new ArrayList();
	
	
	public Student(String name, int age, String dOB, String iD, String username, String courses,
			ArrayList<String> registeredModules) {
		super();
		this.name = name;
		this.age = age;
		this.DOB = dOB;
		this.ID = iD;
		this.username = username;
		this.courses = courses;
		this.RegisteredModules = registeredModules;
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


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getUsername() {
		return username = name+""+age;
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


	public ArrayList<String> getRegisteredModules() {
		return RegisteredModules;
	}


	public void setRegisteredModules(ArrayList<String> registeredModules) {
		RegisteredModules = registeredModules;
	}
	


}