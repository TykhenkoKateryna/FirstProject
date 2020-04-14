import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OOP22 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner Number = new Scanner(System.in);
		Scanner Number = new Scanner(new File("input.txt"));
		PrintWriter myprintwriter = new PrintWriter(new File("output.txt"));
		 int N = Number.nextInt();
		if (N%2==0) {
			//System.out.println(N*N);
			 myprintwriter.print(N*N);
		}else if (N%2!=0) {
			//System.out.println(N-1);
			 myprintwriter.print(N-1);
		}else {
			//System.out.println(0);
			 myprintwriter.print(0);
		}
		Number.close();
		 myprintwriter.close();
	}

}
