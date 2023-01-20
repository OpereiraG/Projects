package Class11Java;

public class Demo1Array {
    public static void main ( String[] args ) {

        int [] num1 = {1,2,3,4,5};

        for (int i = 0; i < num1.length ; i++) {
            System.out.println(num1[i]);
            //print all the elements from this array using a loop
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        //Enchanced /foreach for loop
        for (int a:num1) {
            System.out.println(a);

        }
    }
}
