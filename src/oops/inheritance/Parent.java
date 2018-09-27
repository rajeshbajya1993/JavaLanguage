package oops.inheritance;

public class Parent {

	public String name;
	public int count;
	public Parent(String name){
		this.name=name;
	}
	public void doStuff(){
		System.out.println(getName());
	}

	private String getName() {
		return name;
	}
}
