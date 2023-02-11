package Replits;

public class Replit137 {


    private String name;
    String city;
    protected String nameOfTheSchool;

    public String  batchNumber;

    void Display(String name,String city,String nameOfTheSchool,String batchNumber){
        System.out.println("My name is "+name+" and i live in "+city+". I study at "+nameOfTheSchool+" in "+batchNumber);
    }

    public static void main(String[] args) {
        Replit137 r = new Replit137();
        r.Display("John","Miami","Syntax","batch 9");
    }
}


