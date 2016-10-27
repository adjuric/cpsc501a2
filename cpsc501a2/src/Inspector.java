/*
 * Aleksandar Djuric (10057804)
 * ASG2 
 */

import java.lang.reflect.*;
import java.util.Arrays;
public class Inspector {
	
	/*
	Main inspect class per assignment guidelines
	Outputs:
		Name of Declaring class
		Name of immediate superclass
		Name of interfaces the class implements
		Methods Declared
	*/
	public void inspect(Object obj, boolean recursive){	
		Class givenClass = obj.getClass();
		Class superClass = givenClass.getSuperclass();
		
		nameDecClass(obj);
		superClass = nameSuperClass(obj, superClass);
		findInter(givenClass);
}


	/*
	 * Function for Naming the Declaring Class
	 */
	public String nameDecClass(Object obj){
		Class someClass = obj.getClass();
		String name = ""+ someClass;
		System.out.println("	Class Name: "+ someClass);
		return name;
}
		
	/*
	 * Function for identifying the superclass
	 */
	private Class nameSuperClass(Object obj, Class superClass) {
		Class someClass;	
		return superClass;
}
	
	/*
	 * Function for identifying the interfaces
	 */
	public void findInter(Class someClass){	
		Class[] arrayClass = someClass.getInterfaces();
		System.out.println("	Class Interfaces: " + Arrays.asList(arrayClass));
}
	/*
	 * Function for identifying class methods
	 */
	public void findMethods(Class someClass){
}
	/*
	 * Function for identifying the constructors
	 */
	public String findConstructors(Class someClass){
		String constructorInfo = null;
	return constructorInfo;
	}
	
	/*
	 * Function for identifying the class fields
	 */
	public Field[] findFields(Class someClass, Object obj){
		Field[] aField = someClass.getDeclaredFields();
		return aField;
		}
	
}

