package Package1;

import java.util.Scanner;

public class HW5 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter 3rd number: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is the largest");


        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the largest");


        }else {
            System.out.println("Number 3 is the largest");
        }
    }
}
