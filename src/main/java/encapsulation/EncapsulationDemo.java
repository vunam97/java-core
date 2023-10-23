package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Encapsulation: Tính đóng gói
        // 1. Phạm vi truy cập: private
        // 2. Cung cấp getter / setter

        Animal dog = new Animal();
        System.out.println("dog = " + dog);
        dog.setColor("Yellow");
        System.out.println("dog = " + dog);
        dog.setColor("Red");
        System.out.println("dog = " + dog);
    }
}
