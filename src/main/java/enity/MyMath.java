package enity;

public class MyMath {
    public static final double PI = 3.14;
    public static int min(int a, int b){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a){
//        PI = 3.15;
        return a + PI;
    }
}
