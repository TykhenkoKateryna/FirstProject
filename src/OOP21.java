import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OOP21 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner Number = new Scanner(System.in);
		Scanner Number = new Scanner(new File("input.txt"));
		PrintWriter myprintwriter = new PrintWriter(new File("output.txt"));
		 int K = Number.nextInt();
		 int N = Number.nextInt();
		 int a= (K/N);				 
		// System.out.println(a);
		 myprintwriter.print(a);
		 Number.close();
		 myprintwriter.close();
	}

}
