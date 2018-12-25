package org.nestedClasses;

public class MemberInnerClass{
	int data;
	public void printName(){
		System.out.println("Data in printName method: "+data);		
	}
	
	class Inner{
		public void printNameInner(){
			System.out.println("Data in inner printName method: "+data);
			printName();
		}		
	}
	
	public  void getName(){
		System.out.println("Hello");
	}	

	public static void main(String[] args) {		
		MemberInnerClass mc1 = new MemberInnerClass();
//		mc1.getName();
		System.err.println(MemberInnerClass.name);
	}
	static Integer name;

}
