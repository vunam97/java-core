package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Abstraction: Tính trừu tượng
        // 1. Abstraction class
        // - abstract class: Không cho phép tạo đối tượng
        // VD: Animal animal = new Animal();

        // - abstract method: Không có thân phương thức
        // * abstract class có thể không có abstract method nào
        // * nếu có ít nhất 1 abstract medthod thì class đó phải là abstract
        // => Trừu tượng không hoàn toàn (<= 100%)
        Dog dog = new Dog("Shiba", "Black");
        dog.makeSound();

        // 2. Interface
        // - Từ khóa: implements
        // - method: public abstract
        // - property: public static final
        // => Trừu tượng hoàn toàn (100%)
        Bird bird = new Bird("Bird", "Red");
        bird.fly();

    }
}
