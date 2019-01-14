package oops.exceptions;

import java.io.IOException;

public class TestTryWIthResource {

	public static void main(String[] args) throws IOException {
		TryWithResourceExceptionJava8 t = null;
		try{
			t = new TryWithResourceExceptionJava8();
			t.print("rajesh");
			System.out.println("Inside try....");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			t.close();
		}
	}
}
