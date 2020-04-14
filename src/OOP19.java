import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OOP19 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner Number = new Scanner(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt"));
		PrintWriter myprintwriter = new PrintWriter(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt"));
	      int a = Number.nextInt();
	      int i=0;
	      int k=0;
	      while (i<a) {
	    	  k++;
	    	     	 if ( (k%3)==1) {
	    		 i++;
	    		 myprintwriter.print(k+" ");	      			      	     
	    	     	 }
	   	      	   
	    	
	      }Number.close();
   	      myprintwriter.close();
	}

}
