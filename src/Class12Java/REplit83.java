package Class12Java;

public class REplit83 {
    public static void main(String[] args) {

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };


        int sum=0;

        for(int i=0; i<a.length;i++){
            sum=0;// Gives the rows individually
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }

            System.out.println(sum);


        }





    }
}
