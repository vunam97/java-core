package polymorphism;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}
