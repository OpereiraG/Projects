package Class9Java;

import java.util.Scanner;

public class MyTryHW4 {

    public static void main ( String[] args ) {


        boolean paidFull=true;
        boolean buyanother=true;
        int priceItem=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item you want to buy: ");
        String item = scanner.nextLine();
        System.out.println("Price of the item: ");
        priceItem =scanner.nextInt();


        while (paidFull){
            System.out.println("You have to pay $"+priceItem);
            System.out.println("Make payment: ");
            int userPaying = scanner.nextInt();
            if (userPaying<priceItem)

                System.out.println("You have ");
            if (userPaying>=priceItem){
                System.out.println("Item paid in full");
                break;
            }

        }while (buyanother){
            System.out.println("Do you want to buy another item: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Yes")){

            }

        }





    }
}
