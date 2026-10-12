public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a[] = null;
            a[6] = 8;
            int ab=1;
            int b=0;
            int c=ab/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.err.println("Exception caught");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Exception caught");
        }
        catch (Exception e){
            System.err.println("Exception caught");
        }
        finally{
            System.out.println("finally caught");
        }

    }
}