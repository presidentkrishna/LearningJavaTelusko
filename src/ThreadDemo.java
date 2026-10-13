
public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(() -> {
            for(int i=1;i<=5;i++){
                System.out.println("Hi" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Hi Thread"
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
        },"Hello Thread"
        );

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();



        thread1.join();
        thread2.join();
        System.out.println(thread1.isAlive());
        System.out.println("Bye");
    }
}
