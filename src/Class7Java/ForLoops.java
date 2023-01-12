package Class7Java;

public class ForLoops {
    public static void main ( String[] args ) {



        //When you know how many times you want to loop through a block of code, use for loop
        //When you don't know how many times you need to repeat the code use a while loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("*******************************");

        for (int j = 1; j <= 20; j += 2) {
            System.out.println(j);
        }

        System.out.println("***************************");

        for (int h = 0; h < 20; h++) {
            if (h % 2 == 1) {
                System.out.println(h);
            }
        }


    }
}
