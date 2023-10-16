import java.time.LocalDate;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        // random.nextInt(max);
        // [0, max) <----------> 0 <= n < max
        int n = random.nextInt(100);
        System.out.println("n = " + n);

        // [min, max]
        // min + random.nextInt(max - min + 1);
        int a = 100 + random.nextInt(999 - 100 + 1);
        System.out.println("a = " + a);

        // Lấy ngẫu nhiên 1 ngày trong khoảng [min, max]
        // 0 ---- 1000 ----- 2000 -----> LocalDate
        // 0 ---- 5000 ----- 10000 ----> Day
        // Random Day: 7500
        // Random Date: 1500

        LocalDate minDate = LocalDate.of(2000, 1, 1);
        System.out.println("minDate = " + minDate);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        System.out.println("minDay = " + minDay);
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay +1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);


    }

}
