package Replits;

public class Replit143 {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;


    Replit143(String make,String model,int numberOfDoors, int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Replit143(String make,String model, int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Replit143(int numberOfDoors, int topSpeed,double price){
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Replit143(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
    }


    void displayInfo(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Replit143 r1 = new Replit143("Toyota","Prius",4,120,30000.0);
        Replit143 r2 = new Replit143("Toyota","Toyota",4,120,30000.0);
        Replit143 r3 = new Replit143("unknown","unknown",4,120,30000.0);
        Replit143 r4 = new Replit143("Toyota","Prius",4,90,0.0);

        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
        r4.displayInfo();
    }

}
