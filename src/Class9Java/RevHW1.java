package Class9Java;

public class RevHW1 {
    public static void main ( String[] args ) {

        for (int i = 1; i <=50 ; i++) {
           if (i%3!=0){
               System.out.println(i);

            }
            System.out.println("**************************************");
            for (int j = 1; j <=50 ; j++) {
                if (j%3==0){
                    continue;
                }
                    System.out.println(j);

                }


        }

    }
}
