public class Main {

	public void division(double a, double b) throws IllegalArgumentException{
		if (b != 0) {
			double div = a/b;
			System.out.println(" a = "+a+", b = "+b+", a/b = "+div);
		}else{
			System.out.println();
			throw new IllegalArgumentException("Cannot divide "+a+" by zero.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numOne = 10.0, numTwo = 15.0;
		Main obj = new Main();
		obj.division(numOne, numTwo);
		obj.division(numOne, 0.0);
		
		

	}

}
