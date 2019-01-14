package oops.exceptions;

import java.io.IOException;

public class TryWithResourceExceptionJava8 implements AutoCloseable{

	@Override
	public void close() throws IOException {		
		System.out.println("your resource was closed...");
	}
	public void print(String str){
		System.out.println("your name is: "+str);
//		throw new CustomRuntimeException("hell yes!!!");
	}

}
