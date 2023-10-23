package abstraction;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " Eating.....");
    }

    @Override
    public String toString() {
        return name + ": " + color;
    }
}
