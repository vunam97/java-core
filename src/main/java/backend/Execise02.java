package backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Execise02 {
    public void question01(){
        try {
            int result = 7 / 0;
            System.out.println("result = " + result);
        } catch (ArithmeticException a){
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("divide completed!");
        }
    }

    public void question03(){
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
        }
    }

    public void question04(){
        try{
            String department = getIndex(100);
            System.out.println("department = " + department);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Cannot find department.");
        }
    }

    private String getIndex(int i){
        String[] departments = {"Giám đốc", "Bảo vệ", "Sale"};
        return departments[i];
    }


}
