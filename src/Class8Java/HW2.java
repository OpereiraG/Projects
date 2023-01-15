package Class8Java;

import java.util.Scanner;

public class HW2 {
    public static void main ( String[] args ) {

        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to apply for a credit card?");
        String answer =input.nextLine();

        for(int a = 0; a <= 10; a++) {
            System.out.println(a+" Please try again");
            answer=input.nextLine();
            if(answer.equalsIgnoreCase("Yes")) {
                System.out.println("Congradulations your application is approved for a credit card!");
                break;
            }

        }

    }


}




