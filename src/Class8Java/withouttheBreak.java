package Class8Java;

public class withouttheBreak {
    public static void main ( String[] args ) {

        for(int i=75;i<=105;i+=5){
            if (i<=100){
                System.out.println("I love summer "+i);

            }else {
                System.out.println("It's very hot "+i);
            }
        }
        System.out.println("********************************************");
        boolean summer =true;
        int temp =75;

        while (summer){
            if (temp<=100){
                System.out.println("I love summer "+temp);
            }else {
                System.out.println("It's very hot"+temp);
            }
            temp+=5;
        }

    }
}
