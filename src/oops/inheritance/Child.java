package oops.inheritance;

public class Child extends Parent{

// public String name = "We shall not.";
	Child(){
		super("Shall We?");
		name="We shall not";
		doStuff();
	}
	public void doStuff(){
		System.out.println(name);
	}
	public static void main(String[] args) {
		Child child = new Child();
		

	}

}
