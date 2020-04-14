//Square difference and difference of square
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class OOP11 {

	public static void main(String[] args)   {
		try {
		File myObj = new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt");
	      Scanner Number = new Scanner(myObj);
	      int A = Number.nextInt();
	      int B = Number.nextInt();
	      FileWriter myWriter = new FileWriter("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt");
	      myWriter.write(Integer.valueOf((int) (Math.pow(A, 2)-Math.pow(B, 2)))+"\n");
	      myWriter.write(Integer.valueOf((int) (Math.pow(Math.abs(A-B), 2)))+"\n");
	          
	      myWriter.close();
	      Number.close();
	      }
	      catch ( IOException e) {
	    	  System.out.println(e);
	      }
	}
}
