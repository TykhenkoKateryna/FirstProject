import java.util.Scanner;

public class OOP13 {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
	      int a = Math.abs(Number.nextInt());
	      int b = Math.abs(Number.nextInt());
	      int c= a*b;
	      int d= 2*(a+b);
	System.out.println("The perimeter of the rectangle with sides "+a+" and "+b+" is "+d+".");
	System.out.println("The area of the rectangle with sides "+a+" and "+b+" is "+c+".");
Number.close();
	}

}
