package oops.concurrent;

public class ThreadLocalVaribales implements Runnable{
	String str1 = "Rajesh";
	String str2 = "Bajya";

	public static void main(String[] args) {
//		ThreadLocalVaribales object = new ThreadLocalVaribales();
//		Thread t1 = new Thread(object,"Thread-A");
//		Thread t2 = new Thread(object,"Thread-B");
//		t1.start();
//		t2.start();

		Thread t3 = new Thread(() -> {System.out.println("Hello rajesh");});
		t3.start();
	}

	@Override
	public void run() {
		int hello=12;
		System.out.println(Thread.currentThread().getName()+" got "+str1+" "+ hello);
		hello=32;
		str1="Suresh";
		System.out.println(Thread.currentThread().getName()+" updated to "+str1+" "+hello);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
