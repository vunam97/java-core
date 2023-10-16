public class MethodDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        int sum = dog.sum(10,100);
        System.out.println("sum = " + sum);
        dog.bark();
    }
}
