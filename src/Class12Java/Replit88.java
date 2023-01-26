package Class12Java;

public class Replit88 {



        String breed;

        String name;

        String color;



        void bark(){
            System.out.println("can bark");
        }
        void run(){
            System.out.println("can run");
        }
        void play(){
            System.out.println("can play");
        }

    }




    class Main {
        public static void main(String[] args) {


            Replit88 dog1 = new Replit88();
            Replit88 dog2 = new Replit88();
            Replit88 dog3 = new Replit88();


            dog1.color="Grey";
            dog1.name="Fluffy";
            dog1.breed="Huskey";

            dog2.color="Blue";
            dog2.name="Rocky";
            dog2.breed="Bulldog";

            dog3.color="Yellow";
            dog3.name="Titan";
            dog3.breed="Labrador";


            System.out.print(dog1.breed+" ");
            dog1.bark();

            System.out.print(dog1.breed+" ");
            dog1.run();

            System.out.print(dog1.breed+" ");
            dog1.play();

            System.out.print(dog2.breed+" ");
            dog2.bark();

            System.out.print(dog2.breed+" ");
            dog2.run();

            System.out.print(dog2.breed+" ");
            dog2.play();

            System.out.print(dog3.breed+" ");
            dog3.bark();

            System.out.print(dog3.breed+" ");
            dog3.run();

            System.out.print(dog3.breed+" ");
            dog3.play();



        }
    }