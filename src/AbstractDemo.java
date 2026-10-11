interface Writer{
    void write();
}
class Pen implements Writer{
    public void write(){
        System.out.println("write");
    }
}
class Pencil implements Writer{
    public void write(){
        System.out.println("write2");
    }
}
class Kit{
    public void doSo(Writer p){
        p.write();
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        Kit k = new Kit();
        Writer p = new Pen();

        Writer pc = new Pencil();

        k.doSo(pc);
    }
}
