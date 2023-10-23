package enity;

public class Student {
    private int id;
    private String name;
    public static String college;
    public static int moneyGroup;
    public static int count;

    public Student() {
        if(count >= 7) {
            throw new IllegalStateException("Tối đa 7 học sinh");
        }
        count++;
    }

    public Student(String name) {
        this();
        this.id = count;
        this.name = name;
    }

    public Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public final void study(){
        System.out.println("Đang học bài...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
