public class ExceptionDemo {
    public static void main(String[] args) {
       int i,j;
       i=8;
       j=9;
       try {
           int k = i/j;
           System.out.println(k);
           if(k==0)
               throw new PException("   are you kidding me");
       }
       catch(PException e) {
           System.out.println("error" + e.getMessage());
       }
    }
}