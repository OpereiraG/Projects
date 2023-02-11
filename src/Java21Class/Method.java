package Java21Class;

public class Method {
    static int meth(int a, int b) {
        return a + b;
    }

    static int meth(int a, int b, int c) {
        return a + b - c;
    }

    static double meth(int a, double b) {
        return a + b;
    }
}

class TestIt {
    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println(obj.meth(6, 9, 8));
        System.out.println(obj.meth(6, 9));
        System.out.println(obj.meth(6, 9.5));
    }
}

