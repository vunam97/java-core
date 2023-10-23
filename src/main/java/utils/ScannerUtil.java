package utils;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập vào số nguyên. Nhập lại: ");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Vui lòng nhập vào số nguyên dương. Nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập vào số nguyên. Nhập lại: ");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine().trim().replaceAll("\\s+", " ");
    }

    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")){
                return input;
            } else {
                System.out.println("Email không hợp lệ. Nhập lại: ");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.out.println("Mật khẩu yêu cầu 6 - 12 kí tự. Nhập lại:");
                continue;
            }
            if (!hasAnyUpperCaseCharacter(input)) {
                System.out.println("Mật khẩu yêu cầu ít nhất 1 kí tự viết hoa. Nhập lại:");
                continue;
            }
            return input;
        }
    }

    private static boolean hasAnyUpperCaseCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static String inputFullNam() {
        while (true) {
            String input = inputString();
            if (hasAllAlphabeticCharacter(input)){
                return input;
            } else {
                System.out.println("Fullname không được chứa kí tự đặc biệt. Nhập lại: ");
            }
        }
    }

    private static boolean hasAllAlphabeticCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)){
                continue;
            }
            if (!Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }
}
