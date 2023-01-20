package Class10Java;

public class HW11Project {
    public static void main ( String[] args ) {


        String[] animals = {"Cat", "Bird", "Cat", "Dog", "Cat", "Bird"};

        int sum = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == "Cat") {
                sum++;
                System.out.println(animals[i] + " ");
            }
        }

        }
    }

