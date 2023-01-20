package Class11Java;

import java.util.Arrays;

public class HW1 {
    public static void main ( String[] args ) {

        String [] animals ={"Asli","Slava","","Dog","Cat"};

        int sum=0;

        for (int i = 0; i < animals.length ; i++) {
            if (animals[i]=="Cat"){
                sum++;
                System.out.println(animals[i]);


            }


        }

    }
}
