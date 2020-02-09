import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        //Output the prompt
        System.out.println("Enter a line of text:");
        //wait for the user enter a line of text
        String line = input.nextLine();
        //Tell them what they entered
        System.out.println("You entered: "+ line);
//test
        Scanner input1 = new Scanner(System.in);
        //Output the prompt
        System.out.println("Enter an integer:");
        //wait for the user enter a line of text
        int value = input1.nextInt();
        //Tell them what they entered
        System.out.println("You entered: "+ value);

        Scanner input2 = new Scanner(System.in);
        //Output the prompt
        System.out.println("Enter a floating value:");
        //wait for the user enter a line of text
        double value2 = input2.nextDouble();
        //Tell them what they entered
        System.out.println("You entered: "+ value2);
    }
}
