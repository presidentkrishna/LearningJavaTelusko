public class IterationDemo {


    public static void main(String[] args){
        int i = 1;
        while(i<=5)
        {
            System.out.println("Hello");
            i++;
        }

        do
        {
            System.out.println("Hello");
            i++;
        }while(i<=5);



        for(int j=0;j<=5;j++)
        {
            System.out.println("Hello");
        }
        for(int p=0;p<=5;p++) {
            for (int k = 0; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
