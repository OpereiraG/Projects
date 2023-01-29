package Class15Java;

public class MethodPractice2 {

    String reverseStr (String word) {

        String newStr="";

        for (int i = word.length()-1; i>=0 ; i--) {
            newStr+=word.charAt(i);
        }
        return  newStr;


    }

    String reverseStr2 (String input){

        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr3(String input2){
        StringBuilder s = new StringBuilder();
        s.reverse();

        return input2;
    }

}

