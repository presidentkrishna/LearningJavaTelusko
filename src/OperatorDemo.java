public class OperatorDemo {

    /*
    this is comment
     */

    public static void main(String[] args) {
        int m=6,n=4;
        int r1 = m+n;
        int r2 = m-n;
        int r3 = m*n;
        double r4 = (double)m/n;
        int r5 = m%n;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        m = 4;
        n = 5;

        n += m;
        n++;
        n--;
        ++n;
        --n;
        System.out.println(n);

        int i = 8;
        int j = 0;

        if(i>6){
            j=1;
        }
        else{
            j=0;
        }
        System.out.println(j);

        j = i>6?1:2;
        System.out.println(j);

        int b = 6;
        switch(b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("No Match");
        }
    }

}
