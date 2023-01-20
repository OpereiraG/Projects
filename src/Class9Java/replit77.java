package Class9Java;

import java.util.Scanner;

public class replit77 {
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);

        int[] values= new int[5];
        for(int i=0; i<values.length; i++) {
            values[i] = input.nextInt();
        }
        for (int j = values.length; j > 0; j--) {
            System.out.println(j);
        }



    }
}






