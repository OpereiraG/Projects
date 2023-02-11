package Replits;

public class Replit144 {

    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;



    Replit144(String label,double price,String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;

    }Replit144(String label,double price,int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;


    }Replit144(String label,double price){
        this.label=label;
        this.price=price;

    }
    void displayInfo(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}
class R144{
    public static void main(String[] args) {
        Replit144 r1 = new Replit144("Eggs",3.0,"Produce",true,10);
        Replit144 r2 = new Replit144("Paper Towels ",2.0,"misc",false,24);
        Replit144 r3 = new Replit144("Paper Towels",2.0);
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();


    }
}
