package Class14Java;

import java.util.Scanner;

public class ReturnDemoTester {
    public static void main(String[] args) {
        ReturnDemo returnDemo = new ReturnDemo();

        String str = returnDemo.method1();
        System.out.println(str);


        int result = returnDemo.method2();
        System.out.println(result);

    }
}
