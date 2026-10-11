
public class WrapperDemo {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i);
        int j = ii.intValue();
        Integer value = i;
        int k = value;
        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}
