
//the number of tens, in a two-digit number

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class OOP9 {

	public static void main(String[] args)   {
		try {
		File myObj = new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt");
	      Scanner Number = new Scanner(myObj);
	      int N = Math.abs(Number.nextInt());
	      FileWriter myWriter = new FileWriter("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt");
	      myWriter.write(N/10+"");
	      myWriter.close();
	      Number.close();
	      }
	      catch ( IOException e) {
	    	  System.out.println(e);
	      }
	}
}
