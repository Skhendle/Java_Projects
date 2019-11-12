import java.util.*;
import java.io.*;

public class NumberOne {

	public NumberOne() {
		super();
		// TODO Auto-generated constructor stub
		this.MainProgram();
	}
	
	
	private void MainProgram() {
		int sum = 0, counter = 0, pos  = 0, neg = 0;
		int inputNumber;
		Scanner input = new Scanner(System.in);
		
		inputNumber = input.nextInt();
		while( inputNumber != 0) {
			sum += inputNumber;
			counter++;
			if(inputNumber > 0) {
				pos++;
			}else {
				neg++;
			}
			inputNumber = input.nextInt();
		}
		input.close();
		
		PrintFunction(pos, neg, sum/counter);
		
		//return sum/counter;
	}
	
	
	private void PrintFunction(int pos, int neg, float ave) {
		System.out.println(" There are "+pos+" positve numbers.");
		System.out.println(" There are "+neg+" negative numbers.");
		System.out.printf(" The average is %.2f \n",ave);
	}

}
