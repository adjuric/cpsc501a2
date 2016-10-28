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
	 * Ensuring finding the declaring functions work properly Using Class C
	 */
	@Test
	public void testc() {
		String className = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassC");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			className = check.nameDecClass(obj);
			assertEquals("class ClassC", className);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Ensuring finding the declaring functions work properly Using Class D
	 */
	@Test
	public void testD() {
		String className = null;
		Class someClass;
		try {
			someClass = Class.forName("ClassD");
			Object obj = someClass.newInstance();
			Inspector check = new Inspector();
			className = check.nameDecClass(obj);
			assertEquals("class ClassD", className);
			
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
		
	}
	
	/*
	 * Ensuring Constructors are found properly Using Class B
	 */
	@Test
	public void testConstructorB(){
	
	}
	
	/*
	 * Ensuring Fields are found properly using Class A
	 */
	@Test
	public void testFindFieldA(){
	}
	
	/*
	 * Ensuring Fields are found properly using Class B
	 */
	@Test
	public void testFindFieldB(){
		
	}
	

}
