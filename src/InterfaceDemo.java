@FunctionalInterface
interface Abc{
    void show();
    default void show2(){
        System.out.println("Abc");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj = () -> System.out.println("show");

        obj.show2();
        obj.show();
    }
}
