public class WildcardDemo {
    public static void main(String[] args) {
        // Từ khóa: extends, super, ?
        // T extends Number: T phải là class con của Number
        // T super Number: T phải là class cha của Number
        // ?: Không quan tâm kiểu dữ liệu

        Circle<Integer> circle = new Circle<>(2);
    }
}
