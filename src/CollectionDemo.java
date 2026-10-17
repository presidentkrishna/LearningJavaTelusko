import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args){
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
