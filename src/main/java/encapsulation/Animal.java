package encapsulation;

public class Animal {
    private String name;
    private String color;

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

    public String getName() {
        return this.name;
    }

    public void setColor(String color) {
        if(color.equals("Red")){
            System.out.println("Không được màu Red");
        } else {
            this.color = color;
        }
    }

    @Override
    public String toString() {
        return name + ": " + color;
    }
}
