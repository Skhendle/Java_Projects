import java.io.*;


public class Main {

	public void generate(FileOutputStream file) {
		 
		try {
			DataOutputStream dataFile = new DataOutputStream(file);  ;
			for( int i = 0; i < 50; i++ ) {
		
				dataFile.writeInt((int)(Math.random()*((500-i)+1))+i);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error writing: "+e.toString());			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDirectory = System.getProperty("user.dir");
	    currentDirectory += "/Input.dat";
	    
	     
	    
		//File file = new File(currentDirectory);
		
	    int sum = 0;
	    
		try {
			FileOutputStream file = new FileOutputStream(currentDirectory);
			Main obMain = new Main();
			obMain.generate(file);
			
			
			DataInputStream instr = new DataInputStream(new BufferedInputStream(new FileInputStream( currentDirectory ) ) );
			
			try {

				while( true ) {
					int test = instr.readInt();
					System.out.println(test+"  "+ sum);
			        sum += test; //sum is integer
				}
				
			} catch ( EOFException  eof ) {
				// TODO: handle exception
				System.out.println( "The sum is: " + sum );
				System.out.println("Error reading: "+eof.toString());
			    instr.close();
			}

			
			
	 
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error writing: "+e.toString());
		}
		
	}

}
