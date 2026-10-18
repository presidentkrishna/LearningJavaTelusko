import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.add(9);

        for(int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }
        for(Object o:values){
            System.out.println(o);
        }
    }
}
