interface Abc{
    void show();
}
public class InterfaceDemo {
    public static void main(String[] args){
        Abc obj =  new Abc(){
            public void show() {
                System.out.println("show");
            }
        };
        obj.show();
    }
}
