import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        String s1 = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("vi"))
                .format(LocalDate.now());
        System.out.println("s1 = " + s1);

        String s2 = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("ko"))
                .format(LocalDate.now());
        System.out.println("s2 = " + s2);

        String s3 = DateTimeFormatter
                .ofPattern("dd-MM-yyyy", new Locale("ja"))
                .format(LocalDate.now());
        System.out.println("s3 = " + s3);
    }
}
