package oops.concurrent.executors;

import java.util.concurrent.*;

public class SchedulingTasks {

	
	public static void main(String[] args) {
		SchedulingTasks st = new SchedulingTasks();
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future f  =ex.submit(st.new Task1());
		while(!f.isDone()){
			System.out.println("doing it.....");
		}
		
	}
	
	class Task1 implements Runnable{

		@Override
		public void run() {
			System.out.println("task1 started.....");
			for(int i=0;i<10;i++){
				System.out.print(i+" ");
			}
			System.out.println("\n task1 ended.");
			
		}
		
	}
	
	class task2 implements Runnable{

		@Override
		public void run() {
			System.out.println("task2 started.....");
			for(int i=0;i<10;i++){
				System.out.print(i+" ");
			}
			System.out.println("\n task2 ended.");
			
		}
		
	}
}
