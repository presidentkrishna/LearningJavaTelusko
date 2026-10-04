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
    }

}
