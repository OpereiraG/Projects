package ReviewClass6;

import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.name = "Hibiscus";
        flower.color = "red";
        flower.price = 5;

        flower.bloom();

        flower.smell();

    }

}
