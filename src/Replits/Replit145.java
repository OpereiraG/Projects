package Replits;

public class Replit145 {

    String dogName;
    double dogWeight;
    static String  dogBreed="Mutt";


    Replit145(String dogName,double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
    void printInfo(){
        System.out.println(dogName+" "+Replit145.dogBreed+" "+dogWeight);
    }

}
class R145{
    public static void main(String[] args) {

        Replit145 r1 = new Replit145("Tarzan",50.0);
        Replit145 r2 = new Replit145("Lucy",10.0);
        r1.printInfo();
        r2.printInfo();

    }
}
