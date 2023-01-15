package Class8Java;

import java.util.Scanner;

public class HW4NP {
    public static void main ( String[] args ) {



        Scanner scanner = new Scanner(System.in);
        double itemPrice;
        double amountPaid;


        boolean done=false;

        while (!done){
            System.out.println("Enter item you want to buy: ");
            String item = scanner.nextLine();
            System.out.println("Enter how much it cost: ");
            itemPrice=scanner.nextDouble();
            System.out.println("Enter how much you are paying: ");
            amountPaid=scanner.nextDouble();
            while (amountPaid<itemPrice){
                System.out.println("Enter how much you are paying:");
                double payment=scanner.nextDouble();
                amountPaid+=payment;
                double remaining =itemPrice-amountPaid;
                if(remaining>0){
                    System.out.println("The amount remaining is"+remaining);

                }else {
                    double change= remaining;
                    System.out.println("Change"+change);
                }
            }
            System.out.println("Do you want to buy anything else: Yes / No");
            String answer =scanner.nextLine();
            if (answer.equalsIgnoreCase("No")){
                done=true;
            }
            amountPaid=0;
        }

        System.out.println("Thank you for shopping!");
        scanner.close();
    }
}
