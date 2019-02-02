package oops.lambda;

 interface Diamond1 {

	
	default void Check(){
		System.out.println("In diamond1");
	}
	 static void check1(){
		System.out.println("I am in check1 in diamond1");
	}
//	private int p=0;;
}
