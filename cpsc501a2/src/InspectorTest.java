import static org.junit.Assert.*;
import java.lang.reflect.Field;
import org.junit.Test;

public class InspectorTest {

	/*
	 * Ensuring finding the declaring functions work properly Using Class A
	 */
	@Test
	public void testA() {
		String className = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassA");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			className = check.nameDecClass(obj);
			assertEquals("class ClassA", className);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring finding the declaring functions work properly Using Class B
	 */
	@Test
	public void testB() {
		String className = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassB");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			className = check.nameDecClass(obj);
			assertEquals("class ClassB", className);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring Constructors are found properly Using Class A
	 */
	@Test
	public void testConstructorA(){
		String inside = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassA");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			inside = check.findConstructors(someClass);
			assertEquals(inside, "public ClassA(int)1");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring Constructors are found properly Using Class B
	 */
	@Test
	public void testConstructorB(){
		String inside = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassB");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			inside = check.findConstructors(someClass);
			assertEquals(inside, "public ClassB() throws java.lang.Exception1");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring Fields are found properly using Class A
	 */
	@Test
	public void testFindFieldA(){
		Field[] fieldInfo = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassA");
			Object obj = someClass.newInstance();
			Inspector anInspect = new Inspector();
			fieldInfo = anInspect.findFields(someClass, obj);
			assertEquals(""+fieldInfo[1],"private double ClassA.val2");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring Fields are found properly using Class B
	 */
	@Test
	public void testFindFieldB(){
		Field[] fieldInfo = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassB");
			Object obj = someClass.newInstance();
			Inspector anInspect = new Inspector();
			fieldInfo = anInspect.findFields(someClass, obj);
			assertEquals(""+fieldInfo[1],"private double ClassB.val2");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	

}
