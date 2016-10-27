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
		Class aClass;	
		return superClass;
}
	
	/*
	 * Function for identifying the interfaces
	 */
	public void findInter(Class aClass){	
}
	/*
	 * Function for identifying class methods
	 */
	public void findMethods(Class aClass){
}
	/*
	 * Function for identifying the constructors
	 */
	public String findConstructors(Class aClass){
		String constructorInfo = null;
	return constructorInfo;
	}
	
	/*
	 * Function for identifying the class fields
	 */
	public Field[] findFields(Class aClass, Object obj){
		Field[] aField = aClass.getDeclaredFields();
		return aField;
		}
	
}

