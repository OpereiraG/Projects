package Class15Java;

public class MethodTester {

    public static void main(String[] args) {



        Method method = new Method();



        MethodPractice2 m = new MethodPractice2();
        System.out.println(m.reverseStr("Hello"));










        System.out.println(method.isEven(8));

        boolean isEven = method.isEven(100);
        System.out.println(isEven);
        boolean isEven2 = method.isEven(12);
        System.out.println(isEven2);
        boolean isEven3 = method.isEven(20);
        System.out.println(isEven3);



        int [] arr = {10,20,30};


        int sum =0;


        for (int i = 0; i <arr.length ; i++) {
            sum+=arr.length;
        }

        System.out.println(sum);



    }
}
