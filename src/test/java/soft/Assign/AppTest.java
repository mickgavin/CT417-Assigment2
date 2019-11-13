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
     Student student = new Student();
     student.setName("Michael");
     student.setAge(9);
     String test  = "Michael"+":"+"9";
     
     assertEquals(student.getUsername(),test);
		
      
    }
}
