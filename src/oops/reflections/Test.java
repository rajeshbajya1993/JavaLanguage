package oops.reflections;

import java.lang.reflect.*;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
	 Class  p =  Class.forName("oops.reflections.Person");
	 Field f = p.getDeclaredField("name");
	 System.out.println(f.get(null));
	 int m = f.getModifiers();
	 System.out.println(Modifier.toString(m));
	 Method mm = p.getDeclaredMethod("getName1");
	 mm.setAccessible(true);
	 System.out.println(mm.getName());
	 System.out.println(Modifier.toString(mm.getModifiers()));
	 System.out.println(mm.invoke(null));
//	 p.get
	 
	 Properties p1 =System.getProperties();
	 for(Entry<Object, Object> entry: p1.entrySet()){
		 System.out.println(entry.getKey()+"= "+entry.getValue());
	 }
	}

}
