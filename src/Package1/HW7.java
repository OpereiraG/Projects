package Package1;

import java.util.Scanner;

public class HW7 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from? ");
        String country = scanner.nextLine();

        if(country.equalsIgnoreCase("India")){
            System.out.println("You speak Hindi!");
        } else if (country.equalsIgnoreCase("Portugal")) {
            System.out.println("You speak Portuguese");
            
        } else if (country.equalsIgnoreCase("Turkey")) {

            System.out.println("You speak Turkish ");

        } else if (country.equalsIgnoreCase("Morocco")) {
            System.out.println("You speak Moroccan");
        }else {
            System.out.println("That's not a valid language!!!!");
        }


    }
}
