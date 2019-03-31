package oops.lambda;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		FunctionalInterfaceTest ft = new FunctionalInterfaceTest();
		ft.addition((a,b) -> {return a+b;},10,11);
		ft.addition((a,b) -> {return a-b;}, 20, 12);
	}
	
	int addition(FunctionalInterface f, int a, int b){
		int l= f.coumpute(a, b);
		System.out.println(l);
		return l;
	}
	
	int subtraction(FunctionalInterface f, int a, int b){
		int l= f.coumpute(a, b);
		System.out.println(l);
		return l;
	}
}
