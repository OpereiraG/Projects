package Class12Java;

public class HW2StringBuilder {
    public static void main ( String[] args ) {

        String str = "Hello";

        StringBuilder word = new StringBuilder();
        //You need StringBuilder to manipulate words

        word.append(str);
        word=word.reverse();
        System.out.println(word);

    }
}
