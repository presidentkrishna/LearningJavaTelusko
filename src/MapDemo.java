import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(56,78);
        map.put(78,56);
        map.put(58,79);
        map.put(58,90);

        Set<Integer> keys = map.keySet();

        for(Integer key:keys) {
            System.out.println(key + " " + map.get(56));
        }
    }
}
