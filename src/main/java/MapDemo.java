import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Map: Quản lý theo key - value
        Map<String, String> map = new LinkedHashMap<>();
        map.put("D", "Duy");
        map.put("C", "Cường");
        map.put("H", "Hùng");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("- key = " + entry.getKey());
            System.out.println("- value = " + entry.getValue());
        }
    }
}
