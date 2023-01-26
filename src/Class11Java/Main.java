package Class11Java;

public class Main {
    public static void main ( String[] args ) {


        Human human = new Human(20,6.2,"Hiral");

        //Human human2 = new Human(25,"Caroline",5.6);


        //Human human3 = new Human(35,"Asli",5.7);

        //Human human4 = new Human(30,"Natalia",5.7);

        //System.out.println(human.name);
        //System.out.println(human.height);
        //System.out.println(human.age);

        //System.out.println(human3.name);
        //System.out.println(human4.name);

        //human3.eat();
        System.out.println(human.age);
        System.out.println(human.height);
        System.out.println(human.name);
        human.eat();
    }
}
