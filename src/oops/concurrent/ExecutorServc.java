package oops.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServc {

	public ExecutorServc() {
		
	}
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		ExecutorServc sc = new ExecutorServc();
		ExecutorServc.ThreadTest te = sc.new  ThreadTest();
		Future<?> f = null;
		for(int i=0;i<50;i++){
			 f =ex.submit(te);

		}
		

		
	}
	
  public class ThreadTest implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Running thread: "+Thread.currentThread().getName());
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	  
  }
}
  