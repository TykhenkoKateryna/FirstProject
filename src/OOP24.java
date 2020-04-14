import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class OOP24 {
	public static void main(String[] args) throws FileNotFoundException  {		
			
	      Scanner Number = new Scanner(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt"));
	      double a = Number.nextDouble();
	      double b = Number.nextDouble();
	      double c = Number.nextDouble();	      
	      PrintWriter myprintwriter = new PrintWriter(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt"));	     	      
	      myprintwriter.print((Math.sqrt(((a+b+c)*0.5)*(((a+b+c)*0.5)-a)*(((a+b+c)*0.5)-b)*(((a+b+c)*0.5)-c))));
	       
	     myprintwriter.close();
	      Number.close();      
	   
	}	
}