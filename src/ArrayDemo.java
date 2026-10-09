
public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,2,3,4};

        int d[][] = {
                {1,1,1,1,1},
                {1,1,1,1},
                {1,1,1,1,1,1,1,1}
        };

        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

    }
}
