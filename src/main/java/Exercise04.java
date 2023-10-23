import java.time.LocalDate;
import java.util.Random;

public class Exercise04 {
    Random random = new Random();

    void question01() {
        int n = random.nextInt();
        System.out.println("n = " + n);
    }

    void question02() {
        float n = random.nextFloat();
        System.out.println("n = " + n);
    }

    void question03() {
        String[] names = {"Hùng", "Duy", "Trang"};
        int index = random.nextInt(names.length);
        String name = names[index];
        System.out.println("name = " + name);
    }

    void question04(){
        LocalDate minDate = LocalDate.of(1995, 7, 24);
        LocalDate maxDate = LocalDate.of(1995, 12, 20);

        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995 = " + randomDate);
    }

    void question05() {
        LocalDate maxDate = LocalDate.now();
        LocalDate minDate = maxDate.minusYears(1);

        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây = " + randomDate);
    }

    void question06() {
        LocalDate maxDate = LocalDate.now().minusDays(1);
        int minDay = 0;
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("1 ngày trong quá khứ = " + randomDate);
    }

    void question07() {
        Random random = new Random();
        int c = 100 + random.nextInt(999 - 100 + 1);
        System.out.println("c = " + c);
    }
}
