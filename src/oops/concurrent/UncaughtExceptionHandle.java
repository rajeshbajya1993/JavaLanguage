package oops.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;

public class UncaughtExceptionHandle implements Runnable{

	public UncaughtExceptionHandle() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Thread.UncaughtExceptionHandler  h= new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Uncaught exception: " + e);
				e.printStackTrace();
				
			}
		};
		
		UncaughtExceptionHandle u = new UncaughtExceptionHandle();
		Thread t1 = new Thread(u,"Rajesh-Th");
		Thread t2 = new Thread(u,"thread-1");
		t1.setUncaughtExceptionHandler(h);
		t2.setUncaughtExceptionHandler(h);
		t1.start();
		t2.start();
		
		
	}

	@Override
	public void run() {
		String str = "run time exception in thread "+Thread.currentThread().getName();
		if(Thread.currentThread().getName().equals("thread-1"))
		throw new NullPointerException(str);
		else{
			UncaughtExceptionHandler pt=Thread.getDefaultUncaughtExceptionHandler();
			
			throw new IndexOutOfBoundsException(str);
		}
		
	}

}
