package entity;

import java.util.Scanner;

public class Account {
    private int age;

    public Account() {
        System.out.println("Mời bạn nhập vào thông tin account: ");
        System.out.println("Nhập vào tuổi");
        this.age = inputAccountAge();
    }

    Scanner scanner = new Scanner(System.in);

    public int inputAge() {
        int age = scanner.nextInt();
        if(age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        return age;
    }

    public int inputAccountAge(){
        while (true){
            try{
                int age = inputAge();
                if(age < 18){
                    System.out.println("Your age must be greater than 18");
                } else {
                    return age;
                }
            } catch (InvalidAgeInputingException e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "age=" + age +
                '}';
    }
}
