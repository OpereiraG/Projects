package Replits;

public class Replit117 {

    int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i <=x; i++) {
            if (i % 2 == 0) {
                sum += i;


            }
        }
        return sum;

    }

}

class Main11 {
    public static void main(String[] args) {

        Replit117 r = new Replit117();
        System.out.println(r.sumEvenToX(5));
    }
}
