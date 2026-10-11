class Boy{
    public void write(){
        System.out.println("write");
    }
}
public class AnonymousExample {
    public static void main(String[] args){
        Boy boy = new Boy(){
            public void write(){
                System.out.println("write1");
            }
        };
        boy.write();
    }
}
