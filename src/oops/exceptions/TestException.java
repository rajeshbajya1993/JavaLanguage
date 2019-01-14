package oops.exceptions;

public class TestException {

	
	public void throwsExample(String str, String ptr) throws CustomException{
		if(str==null && ptr == null){
			throw new CustomException("Both Strings can not be null");
		}
		
	}
	
   public void throwException(String str) {
		if(str==null){
			throw new CustomRuntimeException("String can not be null");
		}
	}
	 public static void main(String[] args) {
		TestException te = new TestException();
		
//		//runtime exceptions
//		try{
//			te.throwException("rajesh");
//			/*
//			 * if you dont handle runtime exception, you program will exit at that line itself
//			 * but if you have handled it properly, program will run smoothly
//			 */
//			
//		}
////		System.out.println("t");
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		finally{
//			System.out.println("Finally will always be executed....");
//		}
//		
//		System.out.println("It was executed......");
		
		
		
		//compile time/handled exceptions
		
		try {
			te.throwsExample(null, null);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("finally was executed as always");
		}
		
		System.out.println("It was executed......");
	}
}
