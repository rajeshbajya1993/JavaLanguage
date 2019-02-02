package oops.lambda;

public class DiamondProblem implements Diamond1, Diamond2 {

	public DiamondProblem() {
		
	}

	public static void main(String[] args) {
		DiamondProblem ds = new DiamondProblem();
		ds.Check();

	}

	@Override
	public void Check() {
		
		Diamond2.super.Check();
	}


	

}
