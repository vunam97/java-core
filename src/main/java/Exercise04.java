import java.util.Scanner;

public class Exercise04 {
    Scanner scanner = new Scanner(System.in);
    void question01(){
        System.out.println("Nhập vào xâu ký tự:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        System.out.println("Số từ là: " + words.length);
    }

    void question02(){
        System.out.println("Nhập xâu thứ nhất");
        String s1 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập xâu thứ hai");
        String s2 = scanner.nextLine();
        System.out.println(s1 + " " + s2);
    }
    void question03(){
        System.out.println("Nhập tên");
        String name = scanner.next();
        String result = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("result = " + result);
    }

    void question04(){
        System.out.println("Nhập tên:");
        String name = scanner.next();
        for (int i = 0; i < name.length(); i++){
            System.out.printf("Ký tự thứ %d là: %C %n", i + 1, name.charAt(i));
        }
    }

    void question05(){
        System.out.println("Nhập họ:");
        String surname = scanner.next();
        System.out.println("Nhập tên:");
        String name = scanner.next();
        System.out.printf("Họ và tên là: %s %s", surname, name);
    }

    void question06(){
        System.out.println("Nhập vào họ và tên:");
        String s = scanner.nextLine();
        int i = s.indexOf(' '); // Chỉ số dấu cách đầu tiên
        int j = s.lastIndexOf(' '); // Chỉ sô dấu cách cuối cùng
        String firsName = s.substring(0, i);
        String lastName = s.substring(j+1);
        String middleName = s.substring(i+1, j);
        System.out.printf("Họ là: %s %n", firsName);
        System.out.printf("Tên đệm là: %s %n", middleName);
        System.out.printf("Tên là: %s %n", lastName);
    }

    void question07(){
        System.out.println("Nhập họ và tên:");
        String fullname = scanner.nextLine().replaceAll("\\s+", " ").trim();
        int i = fullname.indexOf(' ');
        int j = fullname.lastIndexOf(' ');
        String firstName = fullname.substring(0, i);
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        String lastName = fullname.substring(j+1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        String middleName = fullname.substring(i+1,j);
        middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1);
        System.out.printf("Họ và tên là: %s %s %s", firstName, middleName, lastName);
    }

    void question08() {
        String[] groups = {"Java", "Java1", "Java2","Java3", "PHP"};
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].contains("Java")) {
                System.out.println(groups[i]);
            }
        }
    }

    void question09() {
        String[] groups = {"Java", "Java1", "Java2","Java3", "PHP"};
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].equals("Java")) {
                System.out.println(groups[i]);
            }
        }
    }
}
