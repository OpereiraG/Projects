package Package2;

import java.util.Scanner;

public class FavFoodCountry {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country: ");
        String country = scanner.nextLine();


        switch (country){

            case "USA":
                System.out.println("You live in the USA and you speak english!!");
                break;
            case "Portugal":
                System.out.println("You live in the Portugal and you speak Portuguese!!");
                break;
            case "Morocco":
                System.out.println("You live in the Morocco and you speak Moroccan!!");
                break;
            default:
                System.out.println("Not a valid input!!!");
        }

    }






}
