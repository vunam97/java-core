package backend;

import entity.MyMath;
import entity.Salary;

public class Exercise04 {
    public static void question01(){
        Salary<Integer> salary = new Salary<>(10000);
        salary.print();
    }
    // question03
    public static <T extends Number & Comparable<T>> T max(T a, T b){
        return a.compareTo(b) > 0 ? a : b;
    }
}
