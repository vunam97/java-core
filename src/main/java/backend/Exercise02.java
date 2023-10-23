package backend;

import enity.MyMath;
import enity.Student;

public class Exercise02 {
    public static void question01(){
        double sum = MyMath.sum(6);
        System.out.println("sum = " + sum);
    }

    public static void question03(){
        Student student = new Student("Duy");
        student.study();

    }
}
