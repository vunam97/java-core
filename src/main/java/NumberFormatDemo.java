import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        String s1 = NumberFormat.getInstance(new Locale("vi")).format(1234567.89);
        System.out.println("s1 = " + s1);

        String s2= NumberFormat.getInstance(new Locale("ja")).format(1234567.89);
        System.out.println("s2 = " + s2);
    }
}
