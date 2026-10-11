interface Abc{
    void show();
}
class Implementer implements Abc{
    public void show() {
        System.out.println("show");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj =  new Implementer();
        obj.show();
    }
}
