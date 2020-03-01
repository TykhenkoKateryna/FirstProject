

public class Application2 {
    public static void main (String[] args) {
        int loop = 0;
        while (true) {
            System.out.println("Looping:" + loop);
            if (loop ==5) {
                break;
            }
            loop ++;
            System.out.println("Running") ;
        }
        vanya myobj = new vanya();
        System.out.println(myobj.outp()) ;

        vanya kartofelniyobj = new vanya();
        kartofelniyobj.kartoshka2();
    }
}

interface protovanya_interface {
    public String outp();
    public void kartoshka();
}

abstract class protovanya implements protovanya_interface {
    public String outp() {
        return "Finish";
    }
    public void kartoshka() {

    }
}

class vanya extends protovanya {
    public void kartoshka() {
        System.out.println("kartoshka") ;
    }

    public void kartoshka2() {
        System.out.println("kartoshka2") ;
    }
}
