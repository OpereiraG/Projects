package Replits;

public class Replit148 {

    String item;
    double price;
    double quantity;

    Replit148(String item,double price,double quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }
    void itemTotalPrice(){
        System.out.println(item+" Total Value "+price*quantity);
    }
}
class R148{
    public static void main(String[] args) {
        Replit148 r1 = new Replit148("Blanket",99.98,1);
        Replit148 r2 = new Replit148("Matress",439.18,1);

        r1.itemTotalPrice();
        r2.itemTotalPrice();

        System.out.println("You purchased "+(r1.price+r2.price)+ " Today");
    }
}
