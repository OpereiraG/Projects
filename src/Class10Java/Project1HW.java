package Class10Java;

import java.util.Scanner;

public class Project1HW {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int [] num = new int[5];

        int sum=0;

        for (int i = 0; i < num.length ; i++) {
            num[i] = scanner.nextInt();
            sum=sum+num[i];


        }System.out.println(sum);




    }
}
