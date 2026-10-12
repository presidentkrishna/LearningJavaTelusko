@FunctionalInterface
interface Abc{
    int num=8;
    void show();
    static void show2(){
        System.out.println("Abc");
    }
}
class Imp implements Abc{
    @Override
    public void show() {
        System.out.println("Imp");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc.show2();
    }
}
