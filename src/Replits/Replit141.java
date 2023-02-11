package Replits;

public class Replit141 {


    public static int maxValue(int[]x){
        int maxValue = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maxValue) {
                maxValue = x[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr));
    }
}

