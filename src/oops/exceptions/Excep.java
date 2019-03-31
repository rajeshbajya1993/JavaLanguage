package oops.exceptions;
import java.util.Date;
import java.util.List;

import ds.array.*;

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
		ex.get("Rajesh");
		GenericArray gc = new GenericArray();
		List<String> list =gc.getDateRangeUtil(new Date(), "month");
		System.out.println(list);

	}

}
