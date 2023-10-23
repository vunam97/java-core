package backend;

import entity.Student;

import java.util.Calendar;
import java.util.Date;

public class Exercise02 {
    public static void question01() {
        @SuppressWarnings("deprecation")
        Date date = new Date(2020, Calendar.MAY, 10);
    }

    public static void question02(){
        Student student = new Student("Nam");
        System.out.println("id học sinh: " + student.getId());
        System.out.println("id học sinh mới: " + student.getIdV2());
    }
}
