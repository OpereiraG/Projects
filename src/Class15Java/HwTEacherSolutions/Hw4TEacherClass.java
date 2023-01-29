package Class15Java.HwTEacherSolutions;

public class Hw4TEacherClass {



    String sayHello(String countries){

        switch (countries){

            case "Portugal":
                return "Ola";//break is not needed when we use the return keyword

            case "USA":
                return "Hello";

            case "Spain":
                return "Holla";

            default:
                return "Country not supported";

        }

    }
}
