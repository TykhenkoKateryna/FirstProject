import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
		/*System.out.println("Enter a number: ");
		int value = scaner.nextInt();
		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scaner.nextInt(); */
        int value;
        do {
            System.out.println("Enter a number: ");
            value = scaner.nextInt();
        }
        while (value != 5);
        System.out.println("Got 5!");
    }
}
