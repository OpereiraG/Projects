package Class10Java;

import java.util.Scanner;

public class HW4 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month: ");
        String birthMonth = scanner.nextLine();

        if (birthMonth.equalsIgnoreCase("December") || (birthMonth.equalsIgnoreCase("January") || (birthMonth.equalsIgnoreCase("February")))) {
            System.out.println("You were born in the Winter");

        } else if (birthMonth.equalsIgnoreCase("March") || (birthMonth.equalsIgnoreCase("April") || (birthMonth.equalsIgnoreCase("May")))) {
            System.out.println("You were born in the Spring");

        } else if (birthMonth.equalsIgnoreCase("June") || (birthMonth.equalsIgnoreCase("July") || (birthMonth.equalsIgnoreCase("August")))) {
            System.out.println("You were born in the Summer");

        }else if (birthMonth.equalsIgnoreCase("June") || (birthMonth.equalsIgnoreCase("July") || (birthMonth.equalsIgnoreCase("August")))){
            System.out.println("You were born in the Autumn");
        }
    }
}