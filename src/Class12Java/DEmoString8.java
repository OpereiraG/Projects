package Class12Java;

public class DEmoString8 {
    public static void main ( String[] args ) {

        String str="Java is love";
        char c = str.charAt(2);
        //System.out.println(c);


        int counter=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();



        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));

        }


    }
}
