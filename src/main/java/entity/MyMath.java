package entity;

public class MyMath<T> {

    public static <T extends Number> double sum2Number(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number> double sum3Number(T a, T b, T c) {
        return a.doubleValue() + b.doubleValue() + c.doubleValue();
    }
    public static <T extends Number> double sum4Number(T a, T b, T c, T d) {
        return a.doubleValue() + b.doubleValue() + c.doubleValue() + d.doubleValue();
    }
    public static <T extends Number> double minus(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number> double pow(T a, T b) {
        return Math.pow( a.doubleValue(), b.doubleValue());
    }
}
