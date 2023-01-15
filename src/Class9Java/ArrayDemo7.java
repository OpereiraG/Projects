package Class9Java;

public class ArrayDemo7 {
    public static void main ( String[] args ) {

        int sum=0;


        int [] numbers = new int[8]; // an empty array of size 8 will be created
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=80;

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }

        }System.out.println(sum);


    }
        }
