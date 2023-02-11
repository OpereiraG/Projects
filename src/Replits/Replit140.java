package Replits;

public class Replit140 {

    static String maxLength(String[] array) {
        int maxL = 0;
        String maxLength = null;
        for (String s : array) {
            if (s.length() > maxL) {
                maxL = s.length();
                maxLength = s;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        String longestString = maxLength(arr);
        System.out.format(longestString);
    }

}


