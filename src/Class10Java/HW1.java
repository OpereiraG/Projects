package Class10Java;

import java.util.Scanner;

public class HW1 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in inches: ");
        int height = scanner.nextInt();


        if (height < 60) {
            System.out.println("You are short");
        } else if (height >60 && height <72 ) {
            System.out.println("You are medium stature");
            
        }else {
            System.out.println("You are tall");
        }

    }
}


