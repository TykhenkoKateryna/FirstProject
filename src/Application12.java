class Machine {
    String name;
    int code;

    public Machine() {
        // "this" need to be at first line of the constructor
        this("Arnie", 0);
        System.out.println("Constructor running!");
        // name = "Arnie";

    }

    public Machine(String name) {
        this(name, 5);
        System.out.println("Second constructor running!");
        // this.name = name;
    }

    public Machine(String name, int code) {
        this.name = name;
        this.code = code;

        System.out.println("Third constructor running!");
        System.out.println(this.name + this.code);

    }
}

public class Application12 {

    public static void main(String[] args) {
        new Machine();
        // invoking the constructor
        // new Machine ();
        new Machine("Bertie");
        new Machine("Chalky", 7);
    }

}
