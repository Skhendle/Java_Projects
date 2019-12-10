import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDirectory = System.getProperty("user.dir");
	    currentDirectory += "/text.txt";
	    
		File file = new File(currentDirectory);
		
		
		try {
			
			PrintWriter pWriter = new PrintWriter(file);
			URL url = new URL("https://www.oracle.com/");
			//URL url = new URL("http://google.com/index.html");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;
	        while ((inputLine = in.readLine()) != null) {
	        	pWriter.println(inputLine);
	        }
	        in.close();		
	        pWriter.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error writing: "+e.toString());
		}
	}

}
