    import java.util.*;
        public class FirstClass
        {
            private static int get_new_computer_number() {
                int Number1 = (int) (Math.random () * 9);
                //System.out.println ("New computer number is "+Number1 );
                return Number1;
            }

            public static void main (String[]args)
            {
                Scanner sc = new Scanner (System.in);
                int computerNumber = get_new_computer_number();
                int userNumber = 11;
                int non_int_error;

                while (userNumber != computerNumber)
                {
                    non_int_error = 0;
                    System.out.print ("Input number from 0 to 9 --> ");
                    try
                    {
                        userNumber = sc.nextInt ();
                    }
                    catch (InputMismatchException ex)
                    {
                        sc.nextLine();
                        System.out.println ("You inputed non int number");
                        non_int_error = 1;
                    }
                    if ((userNumber < 0 || userNumber >= 10) && non_int_error == 0)
                    {
                        System.out.println ("Your number is out of border");
                        computerNumber = get_new_computer_number();
                    }
                    else
                    {
                        if (userNumber != computerNumber && non_int_error == 0)
                        {
                            System.out.println ("You are wrong");
                            computerNumber = get_new_computer_number();
                        }
                        else if (userNumber != computerNumber && non_int_error == 1) {
                            computerNumber = get_new_computer_number();
                        }

                        else
                        {
                            System.out.println ("Well done!");
                        }
                    }
                }
            }
        }

