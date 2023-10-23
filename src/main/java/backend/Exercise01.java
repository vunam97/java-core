package backend;

import entity.Student;

import java.util.*;

public class Exercise01 {
    public static void question01(){
        List<Student> studentCopies = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Duy"));
        students.add(new Student("Duy"));
        students.add(new Student("Duy"));
        students.add(new Student("Hùng"));

        // a
        System.out.println("Số học sinh: " + students.size());
        // b
        System.out.println("Phần tử thứ 4 của students: " + students.get(3));
        // c
        System.out.println("Phần tử đầu tiên: " + students.get(0));
        System.out.println("Phần tử cuối cùng " + students.get(students.size() - 1));
        // d
        students.add(0, new Student("Long"));
        //e
        students.add(new Student("Đạt"));
        // f
        System.out.println("Đảo ngược danh sách");
        List<Student> reversedStudents = new ArrayList<>();
        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            reversedStudents.add(student);
            System.out.println("student = " + student);
        }
        // g
        System.out.println("Học sinh id = 5: " + findStudentById(students,5));
        // h
        System.out.println("Học sinh tên Đạt: " + findStudentByName(students,"Đạt"));
        // i
        // j
        for (Student student : students) {
            if (student.getId() == 2){
                student.setName(null);
            }
            System.out.println("student = " + student);
        }
        // k
        if (students.removeIf(student -> student.getId() == 5)){
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không xóa được");
        }
        // l
        studentCopies.addAll(students);
        System.out.println("Danh sách của studentCopies: ");
        for (Student studentCopy : studentCopies) {
            System.out.println("studentCopy = " + studentCopy);
        }
    }

    public static void question02() {
        List<String> students = new ArrayList<>();
        students.add("Nguyễn Văn Nam");
        students.add("Nguyễn Văn Huyên");
        students.add("Trần Văn Nam");
        students.add("Nguyễn Văn A");

        question02a(students);
        question02b(students);
    }

    public static void question04(){
        Set<String> students = new LinkedHashSet<>();
        students.add("Duy");
        students.add("Cường");
        students.add("Huy");

        for (String student : students) {
            System.out.println("student = " + student);
        }
    }

    public static void question05(){
        Set<String> students = new TreeSet<>(); // TreeSet hỗ trợ sắp xếp khi in
        students.add("Duy");
        students.add("Cường");
        students.add("An");

        for (String student : students) {
            System.out.println("student = " + student);
        }
    }

    public static void question06_07(){
        Map<Integer, String> students = new LinkedHashMap<>();
        students.put(1, "Cường");
        students.put(2, "Dũng");
        students.put(3, "An");
        students.put(4, "Tuấn");

        for (Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println("key của students: " + entry.getKey());
            System.out.println("value của students: " + entry.getValue());
        }
    }

    public static Student findStudentById(List<Student> students, int id){
        for (Student student : students) {
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public static Student findStudentByName(List<Student> students, String name){
        for (Student student : students) {
            if (student.getName().equals(name) ){
                return student;
            }
        }
        return null;
    }

    private static void question02a(List<String> students){
        Stack<String> stack = new Stack<>();
        for (String student : students) {
            stack.push(student);
        }
        while (!stack.isEmpty()){
            System.out.println("- Student = " + stack.pop());
        }
    }

    private static void question02b(List<String> students){
        Queue<String> queue = new LinkedList<>();
        for (String student : students) {
            queue.offer(student);
        }
        while (!queue.isEmpty()){
            System.out.println("+ Student = " + queue.poll());
        }
    }
}


