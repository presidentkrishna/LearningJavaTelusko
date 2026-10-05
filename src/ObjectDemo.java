class calc {
    int n1;
    int n2;
    int r;

    public calc(int n1, int n2) {
        this.n1=n1;
        this.n2=n2;
    }
}


public class ObjectDemo {
    public static void main(String[] args) {
        calc obj = new calc(4,5);

        System.out.println(obj.n1);
        System.out.println(obj.n2);
    }
}
