package Replits;

import java.util.Scanner;

public class Replit96 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();

        switch(language){
            case "Java":
                System.out.println("Java is a programming language");
                break;
            case"C":
                System.out.println("C is a procedural programming language");
                break;
            case "C++":
                System.out.println("C++ is a middle-level programming language");
               break;
            default:
                System.out.println("Doesn't match any programming language");
        }


    }
}
