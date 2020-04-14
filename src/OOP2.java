import java.util.Scanner;

	class rate1{
	public static void conv () {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount in UAH");
		double UAH = input.nextInt();
		double USD = UAH* 27.3;
		System.out.println ("In USD: "+ USD);
		input.close();
	}
	}
	public class OOP2 {
	public static void main(String[] args) {
		rate1.conv ();
	}

}
