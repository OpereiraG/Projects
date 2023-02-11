package Replits;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Please enter name: ");


        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextLine();

            System.out.println(array[i].substring(0,3));

        }


    }

}
