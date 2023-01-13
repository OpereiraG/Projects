package Package1;

import java.util.Scanner;

public class HW9 {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();


        int result = 0;

        if (operator == '+') {
            result = num1 + num2;


        } else if (operator == '-') {
            result = num1 - num2;


        } else if (operator == '*') {
            result = num1 * num2;


        } else if (operator == '/') {
            result = num1 - num2;


        }if (operator!= '+' || operator !='-' || operator!='/' || operator!='*')
            System.out.println("Not a valid input!");



        System.out.println(result);


    }
}
