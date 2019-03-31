package oops.reflections;

import java.lang.reflect.Field;

public class LangClassRefec {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class c = Class.forName("java.lang.String");
		String str = "Rajesh";
		String ptr = "Rajesh";
		Field f = c.getDeclaredField("hash");
		f.setAccessible(true);
		System.out.println(f.get(str));
		str.hashCode();
		System.out.println(f.get(str));
		System.out.println(f.get(ptr));

	}

}
