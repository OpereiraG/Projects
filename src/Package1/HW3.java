package Package1;

import java.util.Scanner;

public class HW3 {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quiz score:  ");
        int quiz = scanner.nextInt();
        System.out.println("Enter mid term: ");
        int midTerm = scanner.nextInt();
        System.out.println("Enter final scores: ");
        int finalScore = scanner.nextInt();

        int averageScore=(quiz+midTerm+finalScore)/3;
        System.out.println(averageScore);

        if (averageScore>=90 && averageScore<=100){
            System.out.println("Grade A");
        } else if (averageScore>=70 && averageScore<90) {
            System.out.println("Grade B");

        } else if (averageScore>=50 && averageScore<70) {
            System.out.println("Grade C");

        } else if (averageScore >0 && averageScore<50) {
            System.out.println("Grade F");

        }else {
            System.out.println("Not valid input");
        }


    }


}
