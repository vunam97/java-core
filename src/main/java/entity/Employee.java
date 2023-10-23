package entity;

import java.util.Arrays;

public class Employee <E>{
    private int id;
    private String name;

    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    // question04
    private <E> void print(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public void showInfo() {
        System.out.println("- id: " + id);
        System.out.println("- name: " + name);
        print(salaries);
    }

    public void showLastSalary(){
        System.out.println(salaries[salaries.length - 1]);
    }
}
