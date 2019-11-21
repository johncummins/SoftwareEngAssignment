package nuigalway.app.SoftEng;


public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private int ID;
	private String username;
	private String courses;
	private String modules;
	
	
	public Student(String name, int age, String dOB, int iD, String username, String courses, String modules) {
		super();
		this.name = name;
		this.age = age;
		DOB = dOB;
		ID = iD;
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
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
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
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}

}