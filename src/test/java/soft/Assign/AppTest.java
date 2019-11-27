package soft.Assign;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void studentNameTest() {
     Student student = new Student(null, 0, null, 0, null, null, null);
     student.setName("Sean");
     student.setAge(9);
     String test  = "Sean"+":"+"9";
     
     assertEquals(student.getUsername(),test);
		
      
    }
	
	@Test
	public void moduleNameTest() {
		Module module = new Module(null, null, null);
		module.setModuleName("programming");
		String test = "programming";
		assertEquals(module.getModuleName(),test);
		
		
	}
	
	@Test
	public void courseTestName() {
		Course course = new Course(null, null, null, null, null);
		course.setCourseName("Computer Science");
		String test = "Computer Science";
		assertEquals(course.getCourseName(),test);
		
	}
}
