import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class OOP20 {

	public static void main(String[] args)throws FileNotFoundException {
		//	Scanner Number = new Scanner(System.in);
		Scanner Number = new Scanner(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\input.txt"));
		PrintWriter myprintwriter = new PrintWriter(new File("C:\\Users\\Kate\\eclipse-workspace\\Tutorial1\\src\\output.txt"));
		int check;
		boolean plus = false;
		boolean minus = false;
		 for (int i=0; i<4;i++){
			 check = Number.nextInt();
			 if (check>0) {
				 plus = true; 
			 }
			 else if (check<0){
				 minus = true;  
			 }
			 }
		 if (plus && minus) {
			//System.out.println("YES");
			 myprintwriter.print("YES");
		 }
		 else {
			// System.out.println("NO");  
			 myprintwriter.print("NO");
		 }	Number.close();
		 myprintwriter.close();
	}
	
}
