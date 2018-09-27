package oops.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class CollFrameWork {

	public static void main(String[] args) {
//		Hashtable<String, String> hash = new Hashtable<>();
//		hash.put(null,"String");
//		hash.put(null, null);
		
//		Properties p = System.getProperties();
//		System.setProperty("user.country", "IN");
//		Set<Entry<Object, Object>> set = p.entrySet();
//		for(Entry<Object, Object> s:set){
//			System.out.println(s.getKey()+"="+s.getValue());
//		}
//		System.out.println(p);
		
		HashMap<String,Integer> hash = new HashMap<>();
		hash.put("Rajesh", 12);
		hash.put("bajya", 3);
		hash.put("hello", 980);
		Set<Entry<String,Integer>> set = hash.entrySet();
//		hash.
		for(Entry<String,Integer> s:set){
			System.out.println(s.getKey()+"="+s.getValue());
			
		}
		

	}

}
