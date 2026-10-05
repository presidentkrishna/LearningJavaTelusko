class Casio{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
}


public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Casio obj = new Casio();
        obj.add(1,2);
        obj.add(2,3,4);
        obj.add(3.4,5.1);

    }

}
