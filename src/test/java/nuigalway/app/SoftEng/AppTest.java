package nuigalway.app.SoftEng;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;


public class AppTest 
{
    @Test
    public void StudentUsernameTest()
    {
    		System.out.println("########## This is the StudentUsernameTest  and should be true #########");
     	Student s1 = new Student("John",21,"02/12/1997","16373731", null, "CSIT", null);
    		
     	String testUsername = "John21";
     	System.out.println("User Name is: " + s1.getUsername());
     	
    		assertEquals(s1.getUsername(),testUsername);
    		
    }
    
    @Test
    public void StudentModuleTest()
    {
    		//Should not be equal
    		System.out.println("########## This is the StudentModuleTest and should be false #########");
		ArrayList<String> RegModules = new ArrayList();
		RegModules.add("Modelling");
		RegModules.add("ML");
		RegModules.add("AI");
		RegModules.add("Software Engineering");
		
     	Student s2 = new Student("John",21,"02/12/1997","16373731", null, "CSIT", null);
     	
     	s2.setRegisteredModules(RegModules);
     	System.out.println("These are the registered Modules: " + s2.getRegisteredModules());
     	
     	ArrayList<String> testRegModules = new ArrayList();
     	testRegModules.add("maths");
     	testRegModules.add("science");
     	testRegModules.add("ag science");
     	testRegModules.add("Enginerring");
     	
     	System.out.println("This is the test Array" + testRegModules);
     	
     	assertEquals(s2.getRegisteredModules(),testRegModules);
    	
	
    }
    
    @Test
    public void ModuleTest()
    {
    	System.out.println("########## This is the Module test and should be true #########");
     	Module m1 = new Module("Machine Learning", "ct410", null, null);
    		
     	String testModname = "Machine Learning";
     	System.out.println("Module name is: " + m1.getModName());
     	
    		assertEquals(m1.getModName(),testModname);
    
    }
    
    @Test
    public void CourseProgrammeTest()
    {
    	System.out.println("########## This is the course programme test and should be false #########");
    	CourseProgramme cp1 = new CourseProgramme("CSIT", null, null, null, null);
    		
     	String testCourseName = "Engineering";
     	System.out.println("Course name is: " + cp1.getCourseName());
     	
    		assertEquals(cp1.getCourseName(),testCourseName);
    
    }



}
