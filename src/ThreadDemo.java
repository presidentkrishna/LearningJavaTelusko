
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );
        Thread thread2 = new Thread(() -> {
            for(int i=1;i<=5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );
        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
