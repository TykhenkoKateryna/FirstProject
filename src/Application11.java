class Frog {
    private String name;
    private int age;
    // it's a setter, because now instead of saying frog1.name="Bertie"; I can called a method: frog1.setName("Bertie");

    // public void setName (String newName) {
    // name= newName;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //it's "get" method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Application11 {

    public static void main(String[] args) {
        // create Frog object
        Frog frog1 = new Frog();
        // frog1.name = "Bertie"; //this is equal frog1.setName("Bertie");
        frog1.setName("Bertie");
        frog1.setAge(1);
        // frog1.age = 1; I can't assign "age" directly outside the class Frog,because I
        // made "age" of private type
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }

}
