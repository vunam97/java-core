package backend;

import enity.*;

public class Exercise01 {
    public static void question01(){
        Student studentA = new Student(1, "Nguyễn Văn A");
        Student studentB = new Student(2, "Nguyễn Văn B");
        Student studentC = new Student(3, "Nguyễn Văn C");

        Student.college = "Đại học bách khoa";

        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);
        System.out.println("studentC = " + studentC);

        Student.college = "Đại học công nghệ";

        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);
        System.out.println("studentC = " + studentC);
    }

    public static void question02() {
        Student studentA = new Student(1, "Nguyễn Văn A");
        Student studentB = new Student(2, "Nguyễn Văn B");
        Student studentC = new Student(3, "Nguyễn Văn C");

        Student.moneyGroup += 300;
        System.out.println(Student.moneyGroup);
        studentA.moneyGroup -= 50;
        System.out.println(Student.moneyGroup);
        studentB.moneyGroup -= 20;
        System.out.println(Student.moneyGroup);
        studentC.moneyGroup -= 150;
        System.out.println(Student.moneyGroup);
        Student.moneyGroup += 150;
        System.out.println(Student.moneyGroup);
    }

    public static void question03() {
        System.out.println("min: " + MyMath.min(5,7));
        System.out.println("sum: " + MyMath.sum(5,7));
    }

    public static void question04(){
        Student.setCollege("Đại học quốc gia");
        System.out.println("Student.getCollege() = " + Student.getCollege());
    }

    public static void question05() {
        Student studentA = new Student("Nguyễn Văn A");
        Student studentB = new Student( "Nguyễn Văn B");
        Student studentC = new Student("Nguyễn Văn C");

        System.out.println("Số lượng học sinh là " + Student.count);
    }

    public static void question06() {
        Student student1 = new PrimaryStudent("Student1");
        Student student2 = new PrimaryStudent("Student2");
        Student student3 = new SecondaryStudent("Student3");
        Student student4 = new SecondaryStudent("Student4");
        Student student5 = new SecondaryStudent("Student5");
        Student student6 = new SecondaryStudent("Student6");
        Student student7 = new SecondaryStudent("Student7");
        Student student8 = new SecondaryStudent("Student8");

        System.out.println("Số lượng Student = " + Student.count);
        System.out.println("Số lượng PrimaryStudent = " + PrimaryStudent.count);
        System.out.println("Số lượng SecondaryStudent = " + SecondaryStudent.count);
    }

    public static void question08(){
        HinhHoc hinhHoc1 = new HinhChuNhat(2,3);
        HinhHoc hinhHoc2 = new HinhChuNhat(3,4);
        HinhHoc hinhHoc3 = new HinhChuNhat(4,4);
        HinhHoc hinhHoc4 = new HinhTron(4.4);
        HinhHoc hinhHoc5 = new HinhTron(5);
        HinhHoc hinhHoc6 = new HinhTron(7);

        System.out.println("Số hình học là: " + HinhHoc.count);
    }
}
