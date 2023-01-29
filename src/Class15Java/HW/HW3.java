package Class15Java.HW;

public class HW3 {


    /*// Create a method thast will print whether given String is palindrome or not

    return type=> void
    name=>polindrome
    parameteres=> String word

    example= dad reversed still dad true is a palindrome
    abc reversed cba false not same word
    */

    boolean polindrome (String word){

        String reverseStr = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reverseStr)){
            return true;
        }
        else {
            return false;
        }
    }

}
