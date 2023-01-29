package Class15Java.HwTEacherSolutions;

public class HW3TEacherSolution {


    void isPalindrome(String str) {

        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }

}




