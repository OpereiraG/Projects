package Class12Java;

public class StringDemo {

    public static void main ( String[] args ) {
        //Creating an object or the String class
        String str = new String("Java");
        //another way of creating an object of a String class a shorter way
        //mostly this is how we create the objects of the String class
        String object="Java";
        System.out.println(object.length());
        String str1 = "Banana ";
        int len=str1.length();
        System.out.println(len);
        String name ="Hamid poya ";
        if (name.length()>10){
            System.out.println("Name can't be more then 10 letters");
        }



    }
}
