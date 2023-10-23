package exercise01;

public class Department {
    private int id;
    private String name;

    public Department(){}

    public Department(String name){
        this.id = 0;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
