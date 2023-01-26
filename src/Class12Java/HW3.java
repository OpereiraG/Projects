package Class12Java;

import java.util.Scanner;

public class HW3 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mom's first name: ");
        String mom = scanner.nextLine();
        System.out.println("Enter dad first name: ");
        String dad = scanner.nextLine();
        System.out.println("Are you expecting boy or girl: ");
        String babySex=scanner.nextLine();
        String babyName;

        if(babySex.equals("girl")){
            babyName=mom.substring(0,2)+dad.substring(3,6);

            System.out.println("Suggested name for the baby"+babyName);

        }else {
            babyName=dad.substring(0,3)+mom.substring(2,4);
            System.out.println("Suggested name for the baby"+babyName);
        }
    }
}
