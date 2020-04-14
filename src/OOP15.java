import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class OOP15 {

	public static void main(String[] args)   {
		try {
		File myObj = new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt");
	      Scanner Number = new Scanner(myObj);
	      int a = Number.nextInt();
	      int b = Number.nextInt();
	      FileWriter myWriter = new FileWriter("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt");
	      if (a>b) {
	    	  myWriter.write(a*a+"\n");
		      myWriter.write(b*b+"");
	    	  }else {
	    		  if (a<b){
	    		myWriter.write(b*b+"\n"); 
	    		myWriter.write(a*a+"");
	    		  }else
	    		  myWriter.write(a*a+"");	    	       
	    	  }      	      
	      myWriter.close();
	      Number.close();
	      }
	      catch ( IOException e) {
	    	  System.out.println(e);
	      }
	}
}