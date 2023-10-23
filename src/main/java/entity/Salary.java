package entity;

public class Salary <N extends Number> {
    private N salary;

    public Salary(N salary) {
        this.salary = salary;
    }

    public void print(){
        System.out.println("- salay: " + salary);
    }
}
