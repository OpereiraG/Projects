package Class13Java;

public class HW3 {
    public static void main(String[] args) {


        String dadName= "Daniel";
        String momName= "Mary";
        String expection="Boy";

        if (expection.equalsIgnoreCase("boy")){
            String firstHalf=dadName.substring(0,dadName.length()/2);
            String secondHalf=momName.substring(momName.length()/2);
            System.out.println(firstHalf+secondHalf);
        }
        else {
            String firstHalf=momName.substring(0,momName.length()/2);
            String secondHalf=dadName.substring(dadName.length()/2);
        }


    }
}
