public class AnnotationDemo {

    public static void main(String[] args) {
        // Annotation: Chú thích
        // @override: Chú thích ghi đè
        Dog dog = new Dog();
        dog.eat();

        // @Deprecated: Chú thích lỗi thời
        int max = dog.maxV2(10, 100);
        System.out.println("max = " + max);

        // @SuppressWarnings: Chú thích chặn cảnh báo
        @SuppressWarnings("deprecation")
        int m = dog.max(10, 100);
    }
}
