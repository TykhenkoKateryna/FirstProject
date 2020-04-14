import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class OOP18 {

	public static void main(String[] args) throws FileNotFoundException  {
		
			
	      Scanner Number = new Scanner(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt"));
	      double a = Number.nextDouble();
	      double b = Number.nextDouble();
	      double c = Number.nextDouble();
	      
	      PrintWriter myprintwriter = new PrintWriter(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt"));
	  
	      double x1 = (-b-(Math.sqrt((b*b)-((4*a)*c))))/(2*a);
	      double x2 =(-b+(Math.sqrt((b*b)-((4*a)*c))))/(2*a);	
	     
	     myprintwriter.printf("%.3f"+" "+"%.3f", x1, x2);	   
	     
	     //Second way:
	   // DecimalFormat df = new DecimalFormat("#0.000");
		//	String res_a = df.format(x1).replace(",",".");
		//	String res_b = df.format(x2).replace(",",".");			
		//myprintwriter.write (res_a+" "+res_b);
	     
	     myprintwriter.close();
	      Number.close();
	      
	   
	}	
}