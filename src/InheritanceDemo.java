class Calculator{
    public int add(int a,int b){
        return a+b;
    }
}
class CalAdv extends Calculator{

    public int sub(int a,int b){
        return a-b;
    }
}
class CalcVeryAdv extends CalAdv{
    public int multi(int a,int b){
        return a*b;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        CalcVeryAdv c = new CalcVeryAdv();
        int result = c.add(1,2);
        int result2 = c.sub(1,2);
        int result3 = c.multi(1,2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
