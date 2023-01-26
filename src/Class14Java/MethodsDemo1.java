package Class14Java;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr1 = {10,20,30,45,50};



        int sum=0;


        for (int i = 0; i < arr1.length ; i++) {
            sum+=arr1[i];

        }
        System.out.println(sum);


        int [] arr2 = {10,10,10,20,30};


        int sum2=0;

        for (int numbers:arr2) {
            sum2+=numbers;

        }
        System.out.println(sum2);


        int sum3=0;

        for (int numbers:arr2) {
            sum3+=numbers;

        }
        System.out.println(sum3);


    }
}
