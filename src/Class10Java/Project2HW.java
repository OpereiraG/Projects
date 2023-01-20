package Class10Java;

import java.util.Scanner;

public class Project2HW {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner(System.in);

        String [] countries = new String[5];
        String [] citites = new String [5];


        for (int i = 0; i < countries.length; i++) {
            countries[i]=scanner.nextLine();
            for (int j = 0; j < citites.length; j++) {
                citites[j]=scanner.nextLine();
            }
            System.out.println(countries);
            System.out.println(citites);



        }


    }
}
