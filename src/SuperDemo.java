class A{
    public A(){
        System.out.println("A");
    }
    public A(int a){
        System.out.println("int A");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("B");
    }
    public B(int a){
        super(a);
        System.out.println("int B");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
