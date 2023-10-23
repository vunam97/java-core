package accessmodifier;

public class Animal {
    String name;
    String color;

    public Animal(){};

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " Eating.....");
    }

    @Override
    public String toString() {
        return name + ": " + color;
    }
}
