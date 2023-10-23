package backend;

import entity.Employee;
import entity.MyMap;
import entity.Phone;
import entity.Student2;

import java.lang.reflect.Array;

public class Exercise03 {
    public static void question01(){
        Student2<Integer> student = new Student2<>(1, "Dũng");
        Student2<Float> student1 = new Student2<>(2f, "Hùng");
        Student2<Double> student2 = new Student2<>(3.0, "Tuấn");
    }

    public static void question02(){
        Student2<Integer> student = new Student2<>(1, "Dũng");
        print(student);
        print(4);
        print(4.0);
    }

    public static void question05(){
        Employee<Integer> employee = new Employee<>(1, "Duy", new Integer[]{10, 100});
    }

    public static void question06(){
        MyMap<Integer, String> student = new MyMap<>(1, "Long");
        System.out.println("student = " + student);
    }

    public void question07(){
        Phone<String, String> phone = new Phone<>("abc@gmail.com", "0123456");
        Phone<Integer, String> phone1 = new Phone<>(1,"0123456");
    }

    public static <T> void print(T a){
        System.out.println(a);
    }
}
