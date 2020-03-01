class Persona {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int yearsToRetirement() {
        int yearsLeft = 65 - age;
        // System.out.println(yearsLeft);
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}

public class Application9 {

    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.name = "Karin";
        person1.age = 27;
        person1.speak();
        // person1.yearsToRetirement();
        int print = person1.yearsToRetirement();
        System.out.println("Years to retirement is " + print);
        int age = person1.getAge();
        String name = person1.getName();
        System.out.println("Name is " + name);
        System.out.println(age);
    }

}
