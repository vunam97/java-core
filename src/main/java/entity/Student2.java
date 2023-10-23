package entity;

public class Student2 <T>{
    private T id;
    private String name;

    public Student2(T id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
