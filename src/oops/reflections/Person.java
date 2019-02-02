package oops.reflections;

public class Person {

	public int roll;
	public static String name;
	protected String college;
	
	public Person() {
		
	}
	
	public Person(int roll, String na,String co){
		this.roll=roll;
		name=na;
		college=co;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Person.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	public void check(String college, String name){
		
	}

}
