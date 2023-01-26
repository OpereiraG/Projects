package Class12Java;

public class StringDEmo7 {
    public static void main ( String[] args ) {

        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));


        //Method chaining is when multiple methods are called on the same line
        //this chain methods can only be used with Strings
        System.out.println(str.toLowerCase().startsWith("i"));
    }
}
