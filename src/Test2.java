
public class Test2 {

    public static void main(String[] args) {

        boolean IsTrue = true;
        int i=0;
        while (IsTrue) {
            System.out.println(i);
            i+=2;
            if (i>10)
                IsTrue = false; //instead of this line you can use the operator break;
        }
        int j=0;
        while (j<20) {
            j+=1;
            if (j%2==0)
                continue;
            System.out.println(j);
        }
    }

}
