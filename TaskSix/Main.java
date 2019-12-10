import java.util.Scanner;

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
	
	public void arrayGenerate(int a) {
		
		int[] array = new int[50];
		for(int i = 0; i < 50; i++) {
			array[i]= (int)(Math.random()*((500-i)+1))+i;
		}
		
		System.out.println( "The value at index="+a+" is "+array[a]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is the solution to TaskSix question one
		double numOne = 10.0, numTwo = 15.0;
		Main obj = new Main();
		obj.division(numOne, numTwo);
//		obj.division(numOne, 0.0);
		
		// This is the solution to TaskSix question two
		try {
			obj.arrayGenerate(10);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ArrayIndexOutOfBoundsException("Out of bounds");
		}

	}

}
