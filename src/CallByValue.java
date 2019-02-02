//import java.util.Arrays;

public class CallByValue {

	public CallByValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		int [] arr = {12,3,11,34};
		Integer p= 20;
		String s="a";
		String b="a";
		System.out.println(s==b);
		float d = 0.001f;
		System.out.println(d);
		Integer q = 20;
		System.out.println(p==q);
		CallByValue cv = new CallByValue();
		cv.Equalitytest(p, q);

		A a = new A();
		System.out.println(a);
		
	}
	
	void testA(A a){
		a = null;
	}
	public static void changeArray(int [] arr,int p){
		arr[2]=678;
		p = 12;
	}
	public void Equalitytest(Integer a, Integer b){
		System.out.println(a==b);
	}
	
	static class A{
		
	}

}
