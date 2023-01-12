package Class7Java;

import java.util.Scanner;

public class WhileLoopGuess {
    public static void main ( String[] args ) {

        boolean condition = true;

        Scanner scanner = new Scanner(System.in);

        int number =15;
        while (condition){
            System.out.println("Enter a number from 10 to 20: ");
            int userInput = scanner.nextInt();

            if (userInput>15){
                System.out.println("Your guess is higher then the special number!!");
            } else if (number<15) {
                System.out.println("Your guess is less then the special number!!");

            }else {
                System.out.println("You won!!!");
                condition=false;
            }


        }




    }
}
