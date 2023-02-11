package Class17Java;

public class Dog {

    String name;

     String breed;

     String color;

     int age;

   double weight;


   Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){

       name=dogName;
       breed=dogBreed;
       age=dogAge;
       color=dogColor;
       weight=dogWeight;



   }
   void printInfo(){
       System.out.println("Name "+name+", Breed, "+breed+", age "+age+", Weight "+weight+", Color "+color);
   }


}
