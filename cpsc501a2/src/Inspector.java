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
		Class aClass = obj.getClass();
		Class superClass = aClass.getSuperclass();
		superClass = nameSuperClass(obj, superClass);
}
	
	/*
	 * Function for identifying the superclass
	 */
	private Class nameSuperClass(Object obj, Class superClass) {
		Class aClass;	
		return superClass;
}

	/*
	 * Function for Naming the Declaring Class
	 */
	public String nameDecClass(Object obj){
		Class aClass = obj.getClass();
		String classString = ""+ aClass;
		System.out.println("	Class Name: "+ aClass);
		return classString;
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

