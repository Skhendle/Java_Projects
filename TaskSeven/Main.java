import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a simple text file and writing data into it.
		String currentDirectory = System.getProperty("user.dir");
	    currentDirectory += "/text.txt ";
	    
	    
	    
		File file = new File(currentDirectory);
		
		try {
		PrintWriter pWriter = new PrintWriter(file);
		
		pWriter.println("Hello java File and PrintWriter classes.");
		pWriter.println("Using you feels nice for now.");
		pWriter.println("I think I will try more of your features.");
		
		pWriter.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error writing: "+e.toString());
		}
		
		
		try {
			Scanner output = new Scanner(file);
			int i = 0;
			while(output.hasNext()) {
				System.out.println(i+". "+output.nextLine());
				i++;
			}
			output.close();
		}catch(Exception b){
			System.out.println("Error reading: "+b.toString());
		}
		
		

	}

}
