import java.util.Scanner;

public class OOP3 {

	public static void main(String[] args) {
		Scanner Temperature = new Scanner (System.in);
		System.out.println("What temperature do we have?");
		int temper = Temperature.nextInt();
		if (temper < 0 )
        {
            System.out.println ("We have ice");
                    }
        else
        {
            if (temper > 100)
            {
                System.out.println ("We have steam");
                
            } else
            	  System.out.println ("We have water");
        }
                     

}
}