class calc {
    int n1;
    int n2;
    int r;

    public void perform(){
        r=n1+n2;
    }
}


public class ObjectDemo {
    public static void main(String[] args) {
        calc obj = new calc();
        obj.n1=3;
        obj.n2=5;
        obj.perform();
        System.out.println(obj.r);
    }
}
