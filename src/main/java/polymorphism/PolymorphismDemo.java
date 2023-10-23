package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // PlymorphismDemo: Tính đa hình
        // Từ khóa instanceof
        // - Kiểm tra đối tượng được tạo từ Class nào

        Animal dog = new Dog("Shiba", "yellow");
        playSound(dog);

        Cat cat = new Cat("Cat", "black");
        playSound(cat);
    }

    public static void playSound(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Tiếng kêu của dog là: ");
        } else if (animal instanceof Cat) {
            System.out.println("Tiếng kêu của dog là: ");
        }
        animal.makeSound();
    }
}
