package oops.collectionFramework;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
	  List_Iterator_Example<Integer> it = new List_Iterator_Example<>();
	  it.addElement(12);
	  it.addElement(20);
	  it.addElement(111);
	  it.addElement(122);
	  it.addElement(9);
	  Iterator<Integer> itr = it.iterator();
	  while(itr.hasNext()){
		  System.out.println(itr.next());
	  }
//	  Collections.
	  
	}
	
}
