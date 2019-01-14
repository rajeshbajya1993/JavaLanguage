package oops.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaArrayDeque {

	public JavaArrayDeque() {
		
	}
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();		
		dq.push(12);
		dq.push(20);
		dq.push(45);
		dq.push(65);
		dq.push(2);
		dq.addLast(34);
		System.out.println(dq);
		System.out.println(dq.removeLast());
		dq.add(23);
		System.out.println(dq);
		
	}

}
