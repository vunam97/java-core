package backend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise01 {
    public static void question01(){
        String s1 = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("vi"))
                .format(LocalDate.now());
        System.out.println("s1 = " + s1);
    }

    public static void question02(){
        String s1 = DateTimeFormatter
                .ofPattern("yyyy - MM - dd - HH - mm - ss")
                .format(LocalDateTime.now());
        System.out.println("s1 = " + s1);
    }

    public static void question03(){
        String s1 = DateTimeFormatter
                .ofPattern("yyyy")
                .format(LocalDate.now());
        System.out.println("s1 = " + s1);
    }
    public static void question04(){
        String s1 = DateTimeFormatter
                .ofPattern("MM - yyyy")
                .format(LocalDate.now());
        System.out.println("s1 = " + s1);
    }

    public static void question05(){
        String s1 = DateTimeFormatter
                .ofPattern("MM - dd")
                .format(LocalDate.now());
        System.out.println("s1 = " + s1);
    }

}
