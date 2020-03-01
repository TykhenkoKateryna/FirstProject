
class Person {
    //instance variable (data or state)
    String name;
    int age;
    //add a method "speak"
    void speak () {
        for (int i=0;i<2;i++) {
            System.out.println("My name is "+ name + " and I am " + age + " years old ");
        }
    }
    void sayHello () {
        System.out.println("Hello there!");
    }
}


public class Application8 {

    public static void main(String[] args) {
        //Create a Person object using  the Person class
        Person person1 = new Person();
        person1.name= "Joe Boggs";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        //Create a second Person object
        Person person2 = new Person ();
        person2.name = "Sarah Li";
        person2.age = 20;
        person2.speak();


        System.out.println(person1.name);
    }

}
