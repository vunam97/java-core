package entity;

public class Student {
    private int id;
    private  String name;
    private static int count;

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdV2(){
        return "MSV: " + id;
    }
}
