package Class8Java;

public class NestedLoop5 {
    public static void main ( String[] args ) {

        for (int i = 0; i < 4; i++) {


            for (int j = 0; j <2; j++) {  // inner for loop

                if(j==1){
                    System.out.print("        ");

                }

                System.out.print("* ");

            }
            System.out.println();


        }

    }
}
