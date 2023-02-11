package Java21Class;

public class Animal {

        String name;
        String color="Black";

    }

    class Cat extends Animal{
        String color="white";
        int age=10;
        double weight;

        void printInfo(){

            String color="Blue";
            System.out.println(super.color);
        }



    }
    class AnimalTester{
        public static void main(String[] args) {

            Cat cat=new Cat();

        }
    }


