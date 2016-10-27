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
		Method[] methods = someClass.getDeclaredMethods();
		
		for(int i = 0;i < methods.length;i++){	
			System.out.println("Method: " + methods[i]);
			System.out.println("Return Type: " + methods[i].getReturnType());
			System.out.println("Modifers: " + methods[i].getModifiers());
			Class[] exceptions = methods[i].getExceptionTypes();
			Class[] parameters = methods[i].getParameterTypes();
			
			System.out.println("Exceptions Thrown: " + Arrays.asList(exceptions));
			System.out.println("Parmeter Type: " + Arrays.asList(parameters));
		}
}
	/*
	 * Function for identifying the constructors
	 */
	public String findConstructors(Class someClass){
		String information = null;
		try {
			Constructor[] constructor = someClass.getConstructors();
			for(int i=0;i< constructor.length;i++){
				System.out.println("Constructor Name: "+ constructor[i]);
				System.out.println("Constuctor Modifiers:" +constructor[i].getModifiers());
				Class[] parameters = constructor[i].getParameterTypes();
				System.out.println("Constructor Parameters: " + Arrays.asList(parameters));
				information = "" + constructor[i] + constructor[i].getModifiers();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return information;
	}
	
	/*
	 * Function for identifying the class fields
	 */
	public Field[] findFields(Class someClass, Object obj){
		Field[] aField = someClass.getDeclaredFields();
		return aField;
		}
	
}

