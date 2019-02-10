package oops.concurrent;

public class PingPong{

	boolean flag=true;
	Object lock = new Object();
	
	public static void main(String[] args) {
		PingPong pp = new PingPong();
		
		PingPong.Ping ping = pp.new Ping();
		PingPong.Pong pong = pp.new Pong();
		Thread t1 = new Thread(ping);
		Thread t2 = new Thread(pong);
		t1.start();
		t2.start();
		
	}
	
	class Ping implements Runnable{

		@Override
		public void run() {
			while(true){
				
					if(flag){
						synchronized(lock){	
						System.out.println("Ping ");
						flag=!flag;
						
						try {
							lock.notifyAll();
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
				
			}
			
			
		}
		
	}
	class Pong implements Runnable{

		@Override
		public void run() {
			while(true){
				
				
					if(!flag){
						synchronized(lock){
						
						System.out.println("Pong ");
						flag=!flag;
						
						try {
							lock.notifyAll();
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
			}
			
		}
		
	}

}
