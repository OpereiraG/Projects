package Class9Java;

public class ArrayDemo6 {
    public static void main ( String[] args ) {

        int sum=0;


            int [] numbers = new int[5]; // an empty array of size 5 will be created
            numbers[0]=45;
            numbers[1]=44;
            numbers[2]=33;
            numbers[3]=20;
            numbers[4]=10;

            for (int i = 0; i < numbers.length ; i++) {
                if(i%2==0){
                    sum+=numbers[i];
                }

            }System.out.println(sum);


    }
}
