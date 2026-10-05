class Emp{
    int eid;
    int sal;
    static String ceo;
    static{
        ceo="larry";
    }

    public Emp(){
        eid=1;
        sal=1;
    }

    public void show(){
        System.out.println(eid + ":" + sal+":"+ceo);
    }

}
public class StaticDemo {
    public static void main(String[] args) {
        Emp navin =  new Emp();
        navin.eid=8;
        navin.sal=1000;
        navin.ceo="Mahesh";

        Emp rahul =  new Emp();
        rahul.eid=9;
        rahul.sal=2000;
        rahul.ceo="Mahesh";

        Emp.ceo="Nikita";

        navin.show();
        rahul.show();
    }
}
