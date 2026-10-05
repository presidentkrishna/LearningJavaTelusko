public class practiceiteration {

    public static void main(String[] args){
        for(int i=1;i<=6;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=65;i<=67;i++) {
            for (char j = 65; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                if(i==0||i==10-1||j==0||j==10-1) {
                    System.out.print("$ ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

