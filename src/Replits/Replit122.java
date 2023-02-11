package Replits;

public class Replit122 {

    String countryName;

    String capitalName;

    int populationSize;


}

class Main16{
    public static void main(String[] args) {

        Replit122 r = new Replit122();

        r.countryName="Ukraine";
        r.capitalName="Kiev";
        r.populationSize=45000000;

        Replit122 r2 = new Replit122();

        r2.countryName="India";
        r2.capitalName="Mumbai";
        r2.populationSize=1400000000;

        System.out.println("The capital of "+r.countryName+" is "+ r.capitalName+" and population is "+ r.populationSize);

        System.out.println("The capital of "+r2.countryName+" is "+ r2.capitalName+" and population is "+ r2.populationSize);


    }
}