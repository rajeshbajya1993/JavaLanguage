package oops.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public void division(int a, int b, Calculator c){
		int  l = c.operation(11,2);
		System.out.println("hello"+" : "+l);
	}

	public static void main(String[] args) {
//		Calculator addition = (a,b) -> {
//			       System.out.println("we are in addition method");
//			       return (a+b);
//		};
//		Calculator subs = (a,b) -> (a-b);
//		System.out.println(addition.operation(2, 4));
//        Test t = new Test();
//        t.division(11, 2, (a,b) -> (a/b));
        
//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.hashCode());
//        sb.append("rajesh");
//        System.out.println(sb.hashCode());
//        List<String> list = new ArrayList<String>();
//        list.add("rajesh");
//        list.add("bajya");
//        list.add("hello");
//        System.out.println(list);
//        System.out.println(list.get(0).compareTo(list.get(1)));
//        Collections.sort(list, new SpecialSort());
//        System.out.println(list);
//        System.out.println();
        
        int n = findInt(98,56);
        System.out.println(n);
        
	}
	
	 static int findInt(int i, int j) {
		if(j==0){
			return i;
		}return findInt(j,i%j);

	}

	public static class SpecialSort implements Comparator<String>{
		@Override
		public int compare(String obj1, String obj2){
			return (-1)*obj1.compareTo(obj2);
		}
	}

}
