package Class12Java;

public class Replit81 {
    public static void main ( String[] args ) {

        int [][] numbers = {{5},{4},{8}};

        int max=0;
        for(int i =0; i<numbers.length;i++){
            for(int j =0; j<numbers[i].length;j++){
                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println(max);

    }

}
