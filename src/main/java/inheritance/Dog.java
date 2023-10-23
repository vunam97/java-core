package inheritance;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating....");
    }


}
