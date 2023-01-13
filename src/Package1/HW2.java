package Package1;

import java.util.Scanner;

public class HW2 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = scanner.nextInt();


        if(day>0 && day <=5){
            System.out.println("It's a weekday");
        } else if (day==6 && day==7) {
            System.out.println("It's the weekend");

        }else {
            System.out.println("Invalid input");
        }


    }
}
