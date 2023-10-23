import java.util.List;
import java.util.Map;

public class GenericDemo {
    public static void main(String[] args) {
        //Generic: Lập trình tổng quát
        // Sử dụng: method, class
        // T: Type
        // E: Element
        // N: Number
        // K: Key
        // V: Value

        Circle<Integer> circleA = new Circle<>(10);
        System.out.println("circleA = " + circleA);
        Circle<Double> circleB = new Circle<>(5.3);
        System.out.println("circleB = " + circleB);

        print(3);
        print("abc");
    }

    public static <T> void print(T a) {
        System.out.println("a = " + a);
    }
}
