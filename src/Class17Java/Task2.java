package Class17Java;

public class Task2 {
    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {

    }

}
class TEst{
    public static void main(String[] args) {

        System.out.println(Task2.reverseStr("Sunday"));
    }
}
