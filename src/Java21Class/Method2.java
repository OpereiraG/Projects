package Java21Class;

public class Method2 {
    private int meth(int a, int b) {
        return a + b;
    }

    private int meth(int a, int b, int c) {
        return a + b - c;
    }

    private double meth(int a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println(obj.meth(6, 9, 8));
        System.out.println(obj.meth(6, 9));
        System.out.println(obj.meth(6, 9.5));

    }
}
