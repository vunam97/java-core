import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                }
                if (o1 < o2){
                    return -1;
                }
                return 0;
            }
        };
        numbers.sort(comparator);

        for (Integer number : numbers) {
            System.out.println("- number = " + number);
        }
    }
}
