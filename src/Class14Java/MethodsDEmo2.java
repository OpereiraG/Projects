package Class14Java;

import java.util.Scanner;

public class MethodsDEmo2 {


      //Definied method
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    void printHelloManyTimes(int times){

        for (int i = 0; i <times ; i++) {
            System.out.println("Hello World");
        }


    }
    void printManyTimes(int time,String word){

        for (int i = 0; i <time ; i++) {
            System.out.println(word);

        }
    }

}

