package Class11Java;

import java.util.Arrays;

public class enchancedLoop2dArray {
    public static void main ( String[] args ) {


        int [][] matrix = {{10,20,30},
                {40,50,60},
                {1,2,3,4,5}};


        for (int[] hello:matrix) {
            for (int arr:hello) {
                System.out.println(arr+" ");

            }
            System.out.println();
            }

        }

    }

