import java.util.*;
public class CollectionDemo {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(634);
        values.add(955);
        values.add(287);

        Comparator<Integer> ca = (o1,o2) -> o1%10>o2%10?1:-1;

        Collections.sort(values,ca);

        for(Object o:values){
            System.out.println(o);
        }
    }
}
