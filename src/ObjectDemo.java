class calc {
    int n1;
    int n2;
    int r;

    public calc(){
        n1=5;
        n2=5;
        System.out.println("cons");
    }
    public calc(int n){
        n1 = n;
        n2=n;
    }
    public calc(double n){
        n1 = (int)n;
    }
}


public class ObjectDemo {
    public static void main(String[] args) {
        calc obj = new calc(7);

        System.out.println(obj.n1);
    }
}
