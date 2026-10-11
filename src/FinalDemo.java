final class X{
    final int D=0;
    public final void X(){
        System.out.println("X");
    }
}
class Y extends X{

}
public class FinalDemo {
    public static void main(String[] args) {
        Y  obj = new Y();
        obj.X();
    }
}
