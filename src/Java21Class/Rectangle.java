package Java21Class;

public class Rectangle {



    void calculatorArea(int a, int b){
        System.out.println("Rectangle area "+a*b);
    }
    void calculatorArea(int c){
        System.out.println("Square area "+c*c);
    }
}
class Main{

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.calculatorArea(10,15);
        r.calculatorArea(10);
    }
}
