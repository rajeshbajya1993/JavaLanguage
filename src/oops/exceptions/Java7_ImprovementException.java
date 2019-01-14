package oops.exceptions;

public class Java7_ImprovementException {

	public void catchMultipleException(int [] arr){
		try{
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			e.printStackTrace();
		}
		System.out.println("executed");
	}
	
	public static void main(String[] args) {
		Java7_ImprovementException je = new Java7_ImprovementException();
		je.catchMultipleException(new int [2]);
	}
}
