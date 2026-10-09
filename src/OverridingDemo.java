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
        super.i=8;
        super.show();
        System.out.println("showb");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.show();
    }
}
