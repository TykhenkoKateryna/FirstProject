import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OOP23 {

	public static void main(String[] args) throws FileNotFoundException{
		//Scanner Number = new Scanner(System.in);
				Scanner Number = new Scanner(new File("input.txt"));
				PrintWriter myprintwriter = new PrintWriter(new File("output.txt"));
				 int H = Number.nextInt();
				 int M = Number.nextInt();
				 int S = Number.nextInt();
if (H==23 && S==59 && M==59) {
	//System.out.println(0+" "+0+" "+0);
	 myprintwriter.print(0+" "+0+" "+0);
}else	if (S==59 && M==59) {
		//System.out.println((H+1)+" "+0+" "+0);
		 myprintwriter.print((H+1)+" "+0+" "+0);
	}else if (S==59){
		//System.out.println(H+" "+(M+1)+" "+0;
		 myprintwriter.print(H+" "+(M+1)+" "+0);
	}else {
		//System.out.println(H+" "+M+" "+(S+1));
		 myprintwriter.print(H+" "+M+" "+(S+1));
	}
	 myprintwriter.close();
	 Number.close();
}				
	}
