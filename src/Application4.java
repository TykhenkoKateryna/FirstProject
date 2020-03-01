import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a command");
        String text = input.nextLine();
        text = text.replace('S', 's');
        switch (text.replace('S', 's')) {
            case "start":
                System.out.println("Mashine starting.");

                break;
            case "stop":
                System.out.println("Mashine stopped");

                break;
            default:
                System.out.println("Command not recognized");
                break;


        }
        //text.toUpperCase();
        switch (text.toLowerCase()) {
            case "start":
                System.out.println("Mashine starting.");

                break;
            case "stop":
                System.out.println("Mashine stopped");

                break;
            default:
                System.out.println("Command not recognized");
                break;

        }


    }
}