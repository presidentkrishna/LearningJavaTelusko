class P{
    int i;
    public void show(){

        System.out.println("show");
    }
}
class Q extends P{
    int i;
    @Override
    public void show(){
        System.out.println("showb");
    }
}
class C extends P{
    public void show(){
        System.out.println("showc");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        P obj = new Q();
        obj.show();

        obj = new C();
        obj.show();
    }
}
