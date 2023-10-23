import java.util.Random;

public class Exercise01 {
    void question01() {
        float account1 = 5240.5f;
        float account2 = 10970.055f;

        int int_account1 = (int) account1;
        int int_account2 = (int) account2;

        System.out.println("int_account1 = " + int_account1);
        System.out.println("int_account2 = " + int_account2);
    }

    int question02(){
        Random random = new Random();
        return random.nextInt(100000);
    }

    void question03(){
        int n = question02();
        int m = n % 100;
        System.out.println("m = " + m);
    }

    float question04(int a, int b){
        return (float) a / b;
    }
}
