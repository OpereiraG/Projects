package Class9Java;

import java.util.Scanner;

public class RevHW2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);



        for (int i = 0; i <10 ; i++) {
            System.out.println("Do you want a credit card ? ");
            String userREponse= scanner.next();
            if (userREponse.equalsIgnoreCase("Yes")){
                break;
            }

        }



    }
}
