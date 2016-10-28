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
	Process:
		Starts by creating class objects for the "GivenClass" and "SuperClass"
		Then Calls other various functions to get relevant information about the class
	*/
	public void inspect(Object obj, boolean recursive){	
		Class givenClass = obj.getClass();
		Class superClass = givenClass.getSuperclass();
		
		nameDecClass(obj);
		superClass = nameSuperClass(obj, superClass);
		findInter(givenClass);
		findConstructors(givenClass);
		findFields(givenClass, obj);
		findMethods(givenClass);
}


	/*
	 * Function for Naming the Declaring Class
	 * 
	 * Process:
	 * 	Creates a new class variable and sets it with the name.
	 * 	Then outputs the information to screen.
	 */
	public String nameDecClass(Object obj){
		Class someClass = obj.getClass();
		String name = ""+ someClass;
		System.out.println("Class Name: "+ someClass);
		return name;
}
		
	/*
	 * Function for identifying the superclass
	 * 
	 * Process:
	 * 	Creates a new class variable at the start
	 * 	Then it traverses through the superClass using the other functions to find all necessary information
	 */
	private Class nameSuperClass(Object obj, Class superClass) {
		Class someClass;
		while (superClass != null){
			String cName = superClass.getName();
			System.out.println("Super Class: " + cName);
			
			findConstructors(superClass);
			findFields(superClass, obj);
			findInter(superClass);
			findMethods(superClass);
			
			someClass = superClass;
			superClass = someClass.getSuperclass();
		}
		return superClass;
}
	
	/*
	 * Function for identifying the interfaces
	 * 
	 * Process:
	 * 	Sets a class array to store all interfaces found within that class
	 * 	Outputs the list of interfaces to the screen
	 */
	public void findInter(Class someClass){	
		Class[] arrayClass = someClass.getInterfaces();
		System.out.println("Class Interfaces: " + Arrays.asList(arrayClass));
}
	
	/*
	 * Function for identifying class methods
	 * 
	 * Process:
	 * 	Sets a method array to store all methods and information about the methods together
	 * 	Goes through a loop of all methods in the array and outputs necessary information about them
	 * 	Furthermore we check if the methods contain any exceptions and parameters of their own
	 * 	These exceptions and parameters are also displayed
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
	 * 
	 * Process:
	 * 	Create a constructor array to store all of them in
	 * 	Go through that array and list details about every constructo furthermore pull any information about the parameters used as well
	 */
	public String findConstructors(Class someClass){
		String information = null;
		try {
			Constructor[] constructor = someClass.getConstructors();
			for(int i=0;i< constructor.length;i++){
				Class[] parameters = constructor[i].getParameterTypes();
				System.out.println("Constructor Name: "+ constructor[i]);
				System.out.println("Constuctor Modifiers:" +constructor[i].getModifiers());	
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
	 * 
	 * Process:
	 * 	Create a field array and fill it with all fields contained within the class
	 * 	Then go through all the fields and output all information about them
	 * 	
	 */
	public Field[] findFields(Class someClass, Object obj){
		Field[] fields = someClass.getDeclaredFields();
		for(int i= 0;i<fields.length;i++){
			fields[i].setAccessible(true);
			Class<?> parameters = fields[i].getType();
			System.out.println("Field Name: " + fields[i]);
			System.out.println("Field Modifiers: " + fields[i].getModifiers());			
			System.out.println("Field Types: " + Arrays.asList(parameters));
			try {
				Object value = fields[i].get(obj);
				System.out.println("Field Value: " + value);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return fields;
		}
	
}

