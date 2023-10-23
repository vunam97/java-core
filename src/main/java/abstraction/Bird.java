package abstraction;

public class Bird extends Animal implements Flyable{
    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying....");
    }
}
