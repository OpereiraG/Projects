package Class17Java;

public class Task3 {

    /*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels.
Method should be available inside the class only
where it was declared and executed by calling it is name.*/

    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Java"));

    }
private static String getOnlyVowels (String word){
    return word.replaceAll("[^AEIOUYaeiouy]","");

}

}
