abstract class Human{
    public abstract void eat();
    public void walk(){

    }
}
class Man extends Human{
    public void eat(){

    }
}
class Printer{
    public void lulli(Number i){
        System.out.println(i);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();
        obj.eat();
        obj.walk();
        Printer printer = new Printer();
        printer.lulli(5);
    }
}
