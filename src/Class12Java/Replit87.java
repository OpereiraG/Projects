package Class12Java;


class Car{


   String carColor;
   int carYear;

   String carMake;


}

public class Replit87 {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();



        car.carColor="Black";
        car.carYear=2019;
        car.carMake="BMW";


        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";

        System.out.println("CAr color is "+car.carColor+" and car year is "+car.carYear+" and car model is "+car.carMake);
        System.out.println("CAr color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);


    }
}
