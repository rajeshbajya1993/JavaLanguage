package oops.concurrent;

public class ObjectMethod {

	int count;
	private Object lock = new Object();
	boolean flag=true;
	public static void main(String[] args) {
		ObjectMethod obj = new ObjectMethod();
		Ping ping = obj.new Ping();
		Pong pong = obj.new Pong();
		Thread t1 = new Thread(ping);
		Thread t2 = new Thread(pong);
		t1.start();
		t2.start();

	}
	
	class Ping implements Runnable{
		public void run(){
			
			while(count<6){
				
			
				synchronized(lock){
					if(flag){
					System.out.println("Ping");
					flag=!flag;
					count++;
					lock.notify();
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}}
	}
	
	class Pong implements Runnable{
		public void run(){
			
			while(count<6){
				synchronized(lock){
					if(!flag){
					System.out.println("Pong");
					flag=!flag;
					lock.notify();
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		} }
	}

}
