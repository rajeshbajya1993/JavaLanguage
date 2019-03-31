package oops.concurrent;

public class DeadLock implements Runnable{
	static String resource1 = "Rajesh Bajya";
	static String resource2 = "Hello Suresh!";
	
	@Override
	public void run(){
		
		synchronized(resource1){
			System.out.println(Thread.currentThread().getName()+" has locked resource1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			   
				}
		
		synchronized(resource2){
			System.out.println(Thread.currentThread().getName()+" has locked resource2");
		}
		
		
	}

	public static void main(String[] args) {
		DeadLock dd = new DeadLock();
//		Thread t1 = new Thread() {  
//		      public void run() {  
//		          synchronized (resource1) {  
//		           System.out.println("Thread 1: locked resource 1");  
//		  
//		           try { Thread.sleep(100);} catch (Exception e) {}  
//		  
//		           synchronized (resource2) {  
//		            System.out.println("Thread 1: locked resource 2");  
//		           }  
//		         }  
//		      }  
//		    }; 
//		    
//		    
//		    Thread t2 = new Thread() {  
//		        public void run() {  
//		          synchronized (resource2) {  
//		            System.out.println("Thread 2: locked resource 2");  
//		    
//		            try { Thread.sleep(100);} catch (Exception e) {}  
//		    
//		            synchronized (resource1) {  
//		              System.out.println("Thread 2: locked resource 1");  
//		            }  
//		          }  
//		        }  
//		      };  
//		      
//		      t1.start();  
//		      t2.start();
		
		
		Student s1 = new Student(11, "Rajesh", "Civil");
		Student s2 = new Student(21, "Vivek", "CSE");
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				synchronized(s1){
					s1.setName("Rajesh Bajya");
					System.out.println(Thread.currentThread().getName()+" has updated student name to "+s1.getName());
				
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized(s2){
					s2.setName("Vivek Poddar");
					System.out.println(Thread.currentThread().getName()+" has updated student name to "+s2.getName());
				}
			}
			}
		});
		
		
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				synchronized(s2){
					s2.setName("Vivek Poddar-1");
					System.out.println(Thread.currentThread().getName()+" has updated student name to "+s2.getName());
//					Thread.dumpStack();
				
//				try{
//					Thread.sleep(100);
//				}
//				catch(InterruptedException e){
//					e.printStackTrace();
//				}
				synchronized(s1){
					s1.setName("Rajesh bajya-1");
					System.out.println(Thread.currentThread().getName()+" has updated student name to "+s1.getName());
				}
			}
			}
		});
		

		t1.setName("*********************************");
		t2.setName("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		t1.start();
		t2.start();
		
		
		

	}

}
