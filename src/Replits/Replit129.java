package Replits;

public class Replit129 {

    static String country;
    static String continent;

    void printInfo() {
        System.out.println(country + " located on " + continent + " continent");

    }

}

class R129 {
    public static void main(String[] args) {

        Replit129 r = new Replit129();
        Replit129.country = "Morocco";
        Replit129.continent = "Africa";
        r.printInfo();

    }
}
