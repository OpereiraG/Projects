package Class14Java;

public class Task4ReverseString {
    public static void main(String[] args) {


        /*
        How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

         */

        /*

        StringBuilder sb = new StringBuilder("This is sentence i want to reverse");
        System.out.println(sb.reverse());
        String str=sb.toString();
        str*/

        String str = "This is sentence i want to reverse ";
        String[] arr = str.split(" ");

        /*for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");*/


        /*for (String word : arr) {
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println(" ");
        }*/
        for (String word : arr) {
            System.out.println(((new StringBuilder(word).reverse() + " ")));

        }
    }
}
