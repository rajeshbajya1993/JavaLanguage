package oops.io;

import java.io.*;

public class WriterClass {

	public WriterClass() throws IOException {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static void main(String[] args) throws IOException {
//		Writer w = new FileWriter("C:\\Users\\rbajya.ORADEV\\Desktop\\RajeshWriter.txt");
//		String str = "I love you";
//		w.append(str);
//		w.flush();
//		System.out.println("done");
//		w.close();
//		BufferedWriter bf = new BufferedWriter(w);
		BufferedReader br  = new BufferedReader(new FileReader("C:\\Users\\rbajya.ORADEV\\Desktop\\RajeshWriter.txt"));
		String result = br.readLine();
		while(result!=null){
			System.out.println(result);
			result = br.readLine();
		}
	}

}
