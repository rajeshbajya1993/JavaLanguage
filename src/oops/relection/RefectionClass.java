package oops.relection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

//import ds.array.*;
public class RefectionClass {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			Class<?> s = Class.forName("ds.array.GenericArray");
//			System.out.println(s.getName());
//			System.out.println(s.getClassLoader());
			Method [] meth=s.getDeclaredMethods();
			for(Method met:meth){
				System.out.println(met.getName());{
					if(met.getName().equals("getDateRangeUtil")){
					@SuppressWarnings("unchecked")
					List<String> str =	(List<String>)met.invoke(new Date(),"month");
					System.out.println(str);
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
