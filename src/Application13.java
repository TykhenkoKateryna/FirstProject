
public class Application13 {

    public static void main(String[] args) {

        Thing.description = "I am a thing";
        // System.out.println(Thing.description);
        Thing.showInfo();

        System.out.println("Before creating object, count is: " + Thing.count);
        // objects here, with this I turn to the constructor twice, so my "count" after
        // =2
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating object, count is: " + Thing.count);
        thing1.name = "Bob";
        thing2.name = "Sue";

        // System.out.println(thing1.name);
        // System.out.println(thing2.name);
        thing1.showName();
        thing2.showName();
        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }

}

class Thing {
    // constant
    public final static int LUCKY_NUMBER = 7;
    // class variables
    public String name;
    public static String description;
    public static int count = 0;
    public int id; // id to be unique for each object

    // constructor
    public Thing() {
        id = count;
        count++; // or Thing.count++;
    }

    // class methods
    public static void showInfo() {
        System.out.println(description);
    }

    public void showName() {
        System.out.println("Object ID is: " + id + ", " +description + ": " + name);

    }

}
