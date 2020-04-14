import java.util.Scanner;

public class OOP5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount in USD");
		double USD = input.nextInt();
		double UAH = USD* 0.037;
		System.out.println ("In UAH: "+ UAH);
		input.close();
	}

}