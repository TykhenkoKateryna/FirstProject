import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        float a = 23.45f;
        if (a >= 0 && a <= 50)
            System.out.println(a + 22 + "\n");
        if (a > 3 || a < 10)
            System.out.println("" + a + 22);
        int b = 1;
        Scanner num = new Scanner(System.in);
        while (b != 20) {

            int c = 50;

            System.out.println("Enter int");
            b = num.nextInt();
            c = b == 45 ? 10 : 12;
            System.out.println(c);
        }
        num.close();
        System.out.println("Game over");
        boolean k= true;
        int t=5;
        k= t ==51;
        System.out.println(k);
    }
}
