package Class15Java.HwTEacherSolutions;

public class PrimeNumberOrNotHw5 {
    boolean isPrime(int num) {

        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

        } else {
            flag = false;
        }
        return flag;

    }
}

class Main {
    public static void main(String[] args) {

        PrimeNumberOrNotHw5 h = new PrimeNumberOrNotHw5();
        System.out.println(h.isPrime(10));
    }
}
