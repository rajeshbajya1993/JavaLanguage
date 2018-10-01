package oops.concurrent;

public class ThreadTest implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		
		ThreadTest ts1 = new ThreadTest();
		Thread t1 = new Thread(ts1);
		t1.setName("Rajesh thread A");
		Thread t2 = new Thread(ts1);
		t2.setName("Rajesh thread B");
		t1.setDaemon(true);
		t1.start();
		t1.join(10000);
//		t2.start();
//		ThreadLocal<T>
		
		System.out.println("Hello Rajesh");
//		throw new NullPointerException();

	}

	@Override
	public void run() {
		
		doingDBcleanUp();
		
	}

	private void doingDBcleanUp() {
		try {
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"->"+i);
				Thread.sleep(10000);
				if("Rajesh thread B".equals(Thread.currentThread().getName())){
					throw new NullPointerException();
				}
				
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
