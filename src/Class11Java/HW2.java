package Class11Java;

public class HW2 {
    public static void main ( String[] args ) {


        String [][] cars = {{"Ford","Dodge"},
                            {"BMW","Mercedes"},
                            {"Kia","Hyundai"},
                            {"Toyota","Honda"}};


        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.println(cars[i][j]);
            }
        }

    }
}
