package oops.exceptions;

public class Excep {

	
	
	public void get(String str){
		try {
			str.length();
		}catch(Exception e){
			throw new IndexOutOfBoundsException();
			
		}
	}
	public static void main(String[] args) {
		Excep ex = new Excep();
		ex.get(null);

	}

}
