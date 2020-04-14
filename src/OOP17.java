import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class OOP17 {

	public static void main(String[] args)   {
		
		try {
			Scanner Number = new Scanner(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt"));
		      double a = Number.nextDouble();
		      PrintWriter myprintwriter = new PrintWriter(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt"));
		      myprintwriter.printf("%.3f",a);	      			      	     
	      
	      Number.close();
	      myprintwriter.close();	      
	      }
	      catch ( IOException e) {
	    	  System.out.println(e);
	      }
	}	
}