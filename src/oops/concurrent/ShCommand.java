package oops.concurrent;


import java.io.*;
public class ShCommand{

public static void main(String [] args) throws Exception{
  
   String cmd = "ade lsviews";
   Runtime run = Runtime.getRuntime();
   System.out.println(run);
   Process pr = run.exec(cmd);
   
   pr.waitFor();
   BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
   String line = "";
   int j=0;
    while ((line=buf.readLine())!=null && j==0) {
       StringBuilder bf = new StringBuilder();
       int i=0;
       System.out.println(line.length());
       while(line.charAt(i)!=' '){
    	   bf.append(line.charAt(i));
       }
       
       Process pr1=  run.exec("ade useview"+bf.toString().trim());
       pr1.waitFor();
       BufferedReader buff = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
      
       String lin="";
       while( (lin=buff.readLine())!=null){
    	   System.out.println(lin);
       }
       
     j++;
       
//       run.exec("exit").waitFor();
       
    }
	
//	File file  = new File("C:\\Users\\rbajya.ORADEV\\Desktop\\Testing");
//	File [] files = file.listFiles();
//	for(File f:files){
//		//one more to get available views
//		//use pattern/matcher to filter zombie/saved views
//		System.out.println(f.getName());
//	}

}

}
