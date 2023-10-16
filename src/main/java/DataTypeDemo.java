import java.time.LocalDateTime;

public class DataTypeDemo {
    // DATA TYPE: Kiểu dữ liệu
    public static void main(String[] args) {
        // Cú pháp khai báo biến
        // <Kiểu dữ liệu> <Tên biến> [= <Giá trị khởi tạo>];

        // PRIMITIVE: Kiểu nguyên thủy
            //INTEGER: KIểu số nguyên
                //byte (1), short (2), int (4), long (8)
                // Giá trị mặc định: 0
                int age = 18;
                System.out.println("age = " + age);

            // FLOAT POINT: Kiểu số thực
                // float (4), double (8)
                // Giá trị mặc định: 0.0
                double score = 9.5;
                System.out.println("score = " + score);

            // BOOLEAN: Kiểu logic
                // boolean (1 bit)
                // Giá trị mặc định: false
                boolean hasMoney = true;
                System.out.println("hasMoney = " + hasMoney);

        // CHARACTER: Kểu ký tự
                // char (2)
                // Giá trị mặc định: \u0000
                char c = 'A';
                System.out.println("c = " + c);


            // STRING: Kiểu xâu ký tự
                // Giá trị mặc định: null
                String fullName = "Vũ Thế Nam";
                System.out.println("fullName = " + fullName);

        // OBJECT: Kiểu đối tượng
        // Giá trị mặc định: null

            // DATE TIME: Kiểu thời gian
                // LocalDate, LocalTime. LocalDateTime
                LocalDateTime now = LocalDateTime.now();
                System.out.println("now = " + now);

            // Kiểu enum: tập hợp hữu hạn giá trị
                Gender gender = Gender.MALE;
                System.out.println("gender = " + gender);

            // ARRAY: Kiểu mảng
            // Chỉ số bắt đầu từ 0
            String[] fruits = {"Táo", "Cam", "Dưa hấu"};
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("fruits = " + fruits[0]);
            System.out.println("numbers = " + numbers[1]);
    }
}