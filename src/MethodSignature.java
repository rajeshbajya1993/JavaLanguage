

/**
 * Method signature includes method name, [type,number of parameters]
 * return type of method is not included in method signature
 * So we cant have two methods which only differ in return type
 * @author rbajya
 *
 */
public class MethodSignature {

	public static void main(String[] args) {
		
	}
	
	public int method1(int a, int b){
		return a+b;
	}
	
	/**
	 * invalid method, as only return type is changing
	 * @param a
	 * @param b
	 * @return
	 */
//	public double method1(int a, int b){
//		return (double)a+b;
//	}
	
	/**
	 * valid method as parameter types are different
	 * @param a
	 * @param b
	 * @return
	 */
	public int method1(int a, long b){
		return 1;
	}
	
	
}
