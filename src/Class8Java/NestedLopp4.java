package Class8Java;

public class NestedLopp4 {
    public static void main ( String[] args ) {



        for (int i = 0; i < 3; i++) {


            for (int j = 0; j < 5; j++) {  // inner for loop

                if(j==1||j==5){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
