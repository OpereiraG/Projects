package Class10Java;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int [] num = new int[5];
        //num[0]=40;
        //num[0]=50;
        //num[0]=60;
        //num[0]=70;
        //num[0]=80;
//bellow code uses normal for loop to ask user for the numbers and store them in the array
        for (int i = 0; i < num.length ; i++) {
            num[i]=scanner.nextInt();

        }


        System.out.println(Arrays.toString(num));

    }





}
