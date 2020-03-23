//String Builder and String Formatting
public class Application14 {

    public static void main(String[] args) {
        String info ="";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);

        //more efficient
        StringBuilder sb = new StringBuilder(""); // with "" we marked that it's String object
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I'm a lion tamer.");
        System.out.println(sb.toString());

        //chaining method
        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");
        System.out.println(s.toString());

        // \t - it's Tab \n - new line.   ..printf - print format

        //Formatting integers         %d-if wanna format an integer   %10d - value is output in a field that's 10 characters wide
        System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");
        System.out.printf("Total cost %-10d; quantity is %10d.\n",5,120);

        // %s - if I wanna put String
        for (int i =0; i<15; i++) {
            System.out.printf("%-4d: some text here\n",i);
            System.out.printf("%-3d: %s\n",i,"some text here!");
        }
        //Formating floating point          %f - floating point format
        System.out.printf("Total value: %f\n", 1.5);
        System.out.printf("Total value: %6.2f\n", 1.6456);
        System.out.printf("Total value: %-8.2f.\n", 411.6456);
    }

}
