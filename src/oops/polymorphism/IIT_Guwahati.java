package oops.polymorphism;

import java.io.IOException;

public class IIT_Guwahati extends IIT {

	String college;
//	public final String COLLEGE_NAME;
	
	public IIT_Guwahati(String str){
		college = str;
	}
	
	@Override
	public void printName(String str){
		System.out.println("You college in Child : " + str);

	}
	public void checkExcep() throws Exception{
		System.out.println("Hello! Exception method");
	}

	

	public static void setName() {
		System.out.println("Child setName() method");
	}

	public static void main(String[] args) {
		IIT ig = new IIT_Guwahati("Rajesh");
		ig.callPrintName();	

	}

}
