@FunctionalInterface
interface Abc{
    void show();
    default void show2(){
        System.out.println("Abc");
    }
}
interface Abc2{
    default void show2(){
        System.out.println("Abc2");
    }
}
class Abcimp implements Abc, Abc2{
    @Override
    public void show() {
        System.out.println("Abc");
    }

    @Override
    public void show2() {
        Abc2.super.show2();
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj = new Abcimp();
        obj.show2();
        obj.show();
    }
}
