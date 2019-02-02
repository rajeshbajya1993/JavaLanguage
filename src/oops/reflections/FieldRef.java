package oops.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * https://www.guru99.com/java-reflection-api.html#6
 * @author rbajya
 *
 */
public class FieldRef {

	public FieldRef() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Class person = Class.forName("oops.reflections.Person"); 
		
		
		
		/**
		 * How to get Metadata of Variable
		 */
		
/*		Field [] fileds = person.getDeclaredFields();
		for(Field fi: fileds){
			System.out.println("\n{");
			System.out.println("Fields name: "+fi.getName());
			System.out.println("Field type: "+fi.getType().getName());
//			System.out.println("Field value: "+fi.get(fi));
			int Mod = fi.getModifiers();
			System.out.println(Mod);
			System.out.println("Modifiers: "+Modifier.toString(Mod));
			System.out.println("}\n");
		}
	*/	
		Person p = new Person(12, "Rajesh", "G");
		
		/**
		 * How to get Metadata of Method
		 */
		Method [] methods  = person.getDeclaredMethods();
		System.out.println("**************************************************");
		for(Method method : methods){
			System.out.println("\n"+"Method Name: "+method.getName());
			
			if(method.getName().equals("getName")){
				System.out.println(method.invoke(p, null));
//				method.
			}
			System.out.println("Method return type: "+method.getReturnType().getName());
			int mode = method.getModifiers();
			System.out.println("Modifier: "+Modifier.toString(mode));
			Class [] param = method.getParameterTypes();
			System.out.print("Parameter list: ");
			for(Class c: param){
				System.out.print(c.getName()+"\t");
			}
			System.out.println();
		}
		System.out.println("****************************************************");

	}


}
