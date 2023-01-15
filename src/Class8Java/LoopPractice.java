package Class8Java;

public class LoopPractice {

    public static void main ( String[] args ) {

        for(int i=0; i<3;i++){
            for (int j =0;j<5;j++){
                if (j==1 || i==0)
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
