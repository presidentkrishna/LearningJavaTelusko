
public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};

        for(int k:a){
            System.out.println(k);
        }

        int d[][] = {
                {1,1,1,1,1},
                {1,1,1,1},
                {1,1,1,1,1,1,1,1}
        };

        for(int k[] : d){
            for(int l :k){
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
