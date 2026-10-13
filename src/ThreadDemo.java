
class Hi implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Runnable hi = new Hi();
        Runnable hello = new Hello();
        Thread thread1 = new Thread(hi);
        Thread thread2 = new Thread(hello);
        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
