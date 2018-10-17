package oops.regex;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class RegularExpression {

	public static void main(String[] args) throws IOException {
//		Pattern pt = Pattern.compile("7896{1}[0-9]{6}");
//		String scan = "7896368653";
//		Matcher mat = pt.matcher(scan);
//		System.out.println(mat.matches());
//		while(mat.find()){
//			System.out.println(mat.start()+" "+mat.end()+scan.substring(mat.start(), mat.end()));
//		}
//		String raj = "Hello rajesh! How are you \n I am fine";
//		
//		FileInputStream in = new FileInputStream("C:\\Users\\rbajya.ORADEV\\Desktop\\new.txt");
//		Scanner scanner = new Scanner(in).useDelimiter("\n");
//		
//		while(scanner.hasNext()){
//			System.out.print(scanner.next());
//		}
//		scanner.close();
//		System.out.println(rajesh);
		
//		Pattern pt = Pattern.compile("7896{1}[0-9]{6}");
//		String scan = "7896368653";
//		Matcher mat = pt.matcher(scan);
		
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("rajesh");
//		pq.add("bajya");
//		pq.of
//		pq.add(54);
//		pq.add(87);
//		pq.add(10);
//		pq.add(34);
//		pq.add(33);
//		pq.add("hello");
//		
//		System.out.println(pq);
//		pq.poll();
//		System.out.println(pq);
//		
//		System.out.println("rajesh".compareTo("bajya"));
		
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>(new comparing());
//		pq.add(54);
//		pq.add(87);
//		pq.add(10);
//		pq.add(34);
//		pq.add(33);
//		System.out.println(pq);
		
//		HashMap<Integer,Integer> hash = new HashMap<>();
//		hash.put(11, 32);
		
		Integer inte = 15&5461;
		String str = Integer.toBinaryString(inte);
		Integer il = Integer.parseInt("1010101010101", 2);
		System.out.println(il);
		System.out.println("Ca".hashCode());
		System.out.println("DB".hashCode());

	}
	static class comparing implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1+o2;
		}
		
	}

}
