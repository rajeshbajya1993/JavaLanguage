package oops.concurrent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ProducerConsumerTest {

	public ProducerConsumerTest(){
		list = new ArrayList<>();
	}
	public static void main(String[] args) {
//		ProducerConsumerTest pc  = new ProducerConsumerTest();
//		Producer pr = pc.new Producer();
//		Consumer cn = pc.new Consumer();
//		Thread t1  = new Thread(pr);
//		Thread t2 = new Thread(cn);
//		t2.start();
//		t1.start();
		
		HashSet<String> list = new HashSet<>();
		list.add("Rajesh");
		list.add("bajya");
		list.add("class");
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		itr.next();
		itr.remove();
		System.out.println(list);
	}
	
	List<Integer> list ; 
	private Object lock = new Object(); 
	
	class Producer implements Runnable{

		@Override
		public void run() {
			
				while(true){
					
					if(list.size()<10 && flag){
						synchronized(lock){
						Random rn = new Random();
						int n  = rn.nextInt(50);
						list.add(n);
						flag=!flag;
						System.out.println("Produced: "+n+ " size: "+list.size());
						lock.notify();
						try {
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
	boolean flag=true;
	class Consumer implements Runnable{

		@Override
		public void run() {
			
				while(true){
					
					if(list.size()>0 && !flag){
						synchronized(lock){
//						Random rn = new Random();
//						int n  = rn.nextInt(50);
						int n = list.get(list.size()-1);
						list.remove(list.size()-1);
						System.out.println("Consumed: "+n+" size: "+list.size());
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
			}
			
		}
		
	}
}
