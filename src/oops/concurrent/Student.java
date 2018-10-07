package oops.concurrent;

public class Student {

	int roll;
	String name;
	String dept;
	public Student(int roll, String name, String dept){
		this.roll=roll;
		this.name=name;
		this.dept=dept;
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
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
