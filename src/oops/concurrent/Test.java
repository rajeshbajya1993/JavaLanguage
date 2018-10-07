package oops.concurrent;

import java.util.Timer; 
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 

import java.io.*;


class Helper extends TimerTask 
{ 
	
	public void run() 
	{ 
				
				

         File file = new File("C:\\Users\\rbajya.ORADEV\\Desktop"); 
          
            if(file.isDirectory()) {                   
                File [] files =file.listFiles();
                for(File f: files){
                	
                		Pattern pt =Pattern.compile(".*top.*");
                		Matcher m = pt.matcher(f.getName());
//                		System.out.println(f.getName());
                		if(m.matches()){
                			System.out.println(f.getName());
                		}
                	
                	
                }
            } 
         else{                 
                System.out.println("Failed to delete the file"); 
           } 
		
		
	} 
	
} 


public class Test 
{ 
	
	public static void main(String[] args) throws InterruptedException 
	{ 
		
//		Calendar today = Calendar.getInstance();
//		today.set(Calendar.HOUR_OF_DAY, 2);
//		today.set(Calendar.MINUTE, 0);
//		today.set(Calendar.SECOND, 0);
//
//		// every night at 2am you run your task
//		Timer timer = new Timer();
//		timer.schedule(new YourTask(), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); // period: 1 day
		
		Timer timer = new Timer(); 
		
		TimerTask task = new Helper(); 

		
		
		Date date = new Date(); 

		timer.scheduleAtFixedRate(task, date, 50000); 
		
		System.out.println("Timer running"); 
		
			
			
		
	} 
} 

