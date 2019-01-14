package oops.collectionFramework;

import java.util.*;
//import java.util.Map.Entry;

public class CollectionHierarchy<K,V> {


	public static void main(String[] args) {

		
//		TreeMap<String,Integer> hash = new TreeMap<String,Integer>();
//		hash.put("Rajesh", 2);
//		hash.put("ABC", 10);
//		hash.put("Class", 34);
//		System.out.println(hash);
//		hash.put("ABC", 12);
//		System.out.println(hash);
	HashMap<Student,Integer> hash = new HashMap<>();
	Student s1 = new Student(12,"Rajesh","IITG");
	Student s2 = new Student(23,"Mukesh","PPL");
	hash.put(s1, 12);
	hash.put(s2, 23);
	System.out.println(hash.get(s1));
	System.out.println(s1.hashCode());
	s1.id=13;
	System.out.println(s1.hashCode());
	System.out.println(hash.get(s1));

	}
	
}
