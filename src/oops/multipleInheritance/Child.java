package oops.multipleInheritance;

import java.util.ArrayList;
import java.util.List;

public class Child extends AbstractParent  implements Parent {

     int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Child ob  = new Child();
		AbstractParent ob1  = new Child();
		System.out.println(ob.equals(ob1));
		ob.setId(12);
		System.out.println(ob.equals(ob1));
//		ob.printName();
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		Integer in = new Integer(2);
//		Integer in1 = new Integer(2);
//		System.out.println(in.equals(in1));
//		System.out.println(list);
//		list.remove(in);
//		System.out.println(list);
	}
	
	@Override
	public void printName() {
		System.out.println("Print method in child class");

	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o==null){
			return this==o;
		}else{
			if(o instanceof Child){
				Child c = (Child)o;
				return this.id==c.id;
			}
		}
		return false;

	}
	

}
