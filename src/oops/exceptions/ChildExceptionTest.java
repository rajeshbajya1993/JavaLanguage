package oops.exceptions;

import java.io.FileNotFoundException;

public class ChildExceptionTest extends ParentExceptionTest {

	public ChildExceptionTest() {
		
	}
	
	
	@Override
	public void test () throws FileNotFoundException{
		System.out.println("in child method");
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException   {
		ChildExceptionTest p = new ChildExceptionTest();
		p.clone();
//		p.test();
		
	}

}
