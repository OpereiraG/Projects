package Class9Java;

public class ArryaDemo8 {
    public static void main ( String[] args ) {

        double[] numbers = {10.5, 12.0, 45, 10.5, 23, 10.5};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10.5) {
                count++;
            }


        }
        System.out.println(count);
    }
}
