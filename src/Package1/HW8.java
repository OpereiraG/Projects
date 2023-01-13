package Package1;

import java.util.Scanner;

public class HW8 {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter enter grade: ");

        char grade = scanner.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("You got a excellent grade.");
                break;
            case 'B':
                System.out.println("You got a good grade.");
                break;
            case 'C':
                System.out.println("You got a average grade.");
                break;
            case 'D':
                System.out.println("You got a bad grade.");
                break;
            default:
                System.out.println("Not acceptable!!");
                break;
        }

        //if (grade!='A' || grade!='B' || grade!='C' || grade!='D'){
            //System.out.println("Invalid input");
        //}

        System.out.println("User grade is a "+grade+" based on his performance on the test.");

    }
}
