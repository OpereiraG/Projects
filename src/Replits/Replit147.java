package Replits;

public class Replit147 {

    String model;
    double price;
    double quantity;

    Replit147(String model,double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;


    }
    void carStockValue(){
        System.out.println(model+" 2019 Stock Value "+price*quantity);
    }

}
class R147{
    public static void main(String[] args) {
        Replit147 r1 = new Replit147("Toyota",25000,100);
        Replit147 r2 = new Replit147("BMW",652980,10);
        r1.carStockValue();
        r2.carStockValue();

    }
}
