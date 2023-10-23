package util;

import java.util.Scanner;

public class ScannerUltil {
    private static Scanner scanner = new Scanner(System.in);

    public int inputAge(){
        while (true){
            try{
                String input = scanner.nextLine();
                int age = Integer.parseInt(input);
                if(age < 0){
                    System.out.println("wrong inputing! Please input an age as int, input again.");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
            }
        }
    }

    public static int inputInt(String errorMessage){
        while (true){
            try{
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println(errorMessage);
            }
        }
    }

    public static int inputId(String errorMessage){
        while (true){
            try{
                String input = scanner.nextLine();
                int id = Integer.parseInt(input);
                if(id <= 0) {
                    System.out.println("Mời nhập lại:");
                }else {
                    return id;
                }
            } catch (NumberFormatException e){
                System.out.println("Mời nhập lại");
            }
        }
    }

    public float inputFloat(String errorMessage){
        while (true){
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException a){
                System.out.println(errorMessage);
            }
        }
    }

    public double inputDouble(String errorMessage){
        while (true){
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException a){
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString(String errorMessage){
        return scanner.nextLine();
    }
}
