package Java21Class;

public class Programming {


    void example(){
        System.out.println("I love programming");
    }
    void example(String str){
        System.out.println("I love "+str);
    }
}
class MainP{
    public static void main(String[] args) {
        Programming p = new Programming();
        p.example();
        p.example("Java");

    }
}
