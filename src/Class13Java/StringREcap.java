package Class13Java;

public class StringREcap {
    public static void main(String[] args) {

        String str = "Java is great";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }


        int count =0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" many times");


    }
}