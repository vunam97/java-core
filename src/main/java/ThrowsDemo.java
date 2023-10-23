public class ThrowsDemo {
    public static void main(String[] args) throws IllegalAccessException {
        // Throws: Lan truyền ngoại lệ
        checkAge(16);
    }

    private static void checkAge(int age) throws IllegalAccessException{
        if(age < 18){
            throw new IllegalAccessException("Chưa đủ tuổi");
        } else {
            System.out.println("Đã đủ tuổi");
        }
    }
}
