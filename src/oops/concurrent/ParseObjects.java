package oops.concurrent;

public class ParseObjects implements Runnable {

	public ParseObjects() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("XYZ"));		
				
	}

	public static void main(String[] args) {
		ParseObjects po = new ParseObjects();
		Thread t1 = new Thread(po);
		t1.start();
		System.out.println("came hee");

	}

}
