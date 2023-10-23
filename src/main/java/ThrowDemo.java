public class ThrowDemo {
    public static void main(String[] args) {
        // Throw: Chủ động ném ra ngoại lệ
        try{
            int age = 16;
            if(age < 18) {
                throw new InvalidAgeException("Chưa đủ tuổi");
            } else{
                System.out.println("Chào mừng bạn");
            }
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
