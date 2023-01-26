package ReviewJan19;

public class REview2ClassJan19 {


    public static void main ( String[] args ) {


        for (int i = 2; i < 10; i++) {
            if(i==12) {
                System.out.println(i);
                break;
            }
        }
        // break - breaks our block of code

        for (int i = 2; i < 20; i+=5) {
            if(i%3==0) {
                System.out.println(i);
                continue;
            }
            System.out.println("Bingo");

    }

    }
}
