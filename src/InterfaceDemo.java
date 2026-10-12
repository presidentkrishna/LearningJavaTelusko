@FunctionalInterface
interface Abc{
    void show();
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj = () -> System.out.println("show");

        obj.show();
    }
}
