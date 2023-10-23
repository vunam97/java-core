package constructor;

public class Animal {
    String name;
    String color;

    Animal(){
        this.name = "Shiba";
        this.color = "Black";
    }

    Animal(String name) {
        this.name = name;
        this.color = "Black";
    }

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + ": " + color;
    }
}
