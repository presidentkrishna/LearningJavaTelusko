import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> Values = new TreeSet<>();
        Values.add(56);
        Values.add(78);
        Values.add(94);
        Values.add(80);
        Values.add(73);

        for(int value:Values){
            System.out.println(value);
        }
    }
}
