package Class11Java;

public class Example2dArray {
    public static void main ( String[] args ) {

        int [][] matrix = {{10,20,30},
                {40,50,60},
                {1,2,3,4,5}};

        //write a loop to print all the elements from this 2D array
        //matrix.length tells us how many 1D arrays are present in this 2D array

        for (int i = 0; i < matrix.length ; i++) {
            //matrix[i].length the size  of each 1D array
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");
                }

            } System.out.println();


        }

    }
}
