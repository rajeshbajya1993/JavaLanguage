package oops.io;

import java.io.*;
import java.util.Arrays;
public class MiscIO {

	public static void main(String[] args) throws Exception {
		MiscIO misc = new MiscIO();
//		misc.fileWriterReader();
		String ruleFile=System.getProperty("java.io.tmpdir");
		System.out.println(ruleFile);
//		Console c=System.console();    
//		System.out.println("Enter password: "); 
//		
//		char[] ch=c.readPassword();    
//		String pass=String.valueOf(ch);//converting char array into string    
//		System.out.println("Password is: "+pass); 
		
		

	}
	public void fileWriterReader() throws Exception {
//		FileWriter fw = new FileWriter("C:\\Users\\rbajya.ORADEV\\Desktop\\Testing.txt");
//		fw.write("Hello Rajesh!"
//				+ "\nHow are you");
		
		
//		fw.close();
		FileReader fr = new FileReader("C:\\Users\\rbajya.ORADEV\\Desktop\\Testing.txt");
//		char [] arr = {};
//		fr.read(arr);
//		System.out.println(Arrays.toString(arr));
		
		int i=0;
		while((i=fr.read())!=-1){
			char ch = (char)i;
			if(ch=='\n'){
				System.out.print(ch);
			}else if(ch=='/'){
				char ch1 = (char)fr.read();
				if(ch1=='/'){
					System.out.print("//");
					int j=0;
					while((j=fr.read())!=-1){
						System.out.print((char)j);
						if((char)j=='\n'){
							break;
						}
					}
				}
				else if(ch1=='*'){
					System.out.print("/*");
					int j=0;
					while((j=fr.read())!=-1){
						System.out.print((char)j);
						if((char)j=='*'){
							int k = fr.read();
							if('/'==(char)k){
								System.out.println("/");
								break;
							}else{
								System.out.println((char)k);
							}
						}
					}
				}
			}else{
				System.out.print(' ');
			}
		}
		
	}
	public void fileOutputInputStreams() throws  Exception {
		FileOutputStream fout = new FileOutputStream("Testing.txt");
		byte [] arr = "Rajesh you are a good boy".getBytes();
		System.out.println(Arrays.toString(arr));
		fout.write(arr);		
		fout.close();
		FileInputStream fm = new FileInputStream("Testing.txt");
		int l=0;
		while((l=fm.read())!=-1){
			System.out.print((char)l);
		}
		fm.close();
	}

}
