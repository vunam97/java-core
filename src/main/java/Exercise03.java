public class Exercise03 {
    void question01(){
        Integer a = 5000;
        float b = a.floatValue();
        System.out.printf("b = %.2f", b);
    }

    void question02() {
        String a = "1234567";
        int b = Integer.parseInt(a);
        System.out.println("b = " + b);
    }

    void question03(){
        String s = "1234567";
        Integer a = Integer.valueOf(s);
        int n = a;
        System.out.println("n = " + n);
    }
}
