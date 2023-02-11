package Replits;

public class Replit119 {


    String censorLetter(String a, char b) {
        String c = a.replace(b, '*');
        return c;

    }

}
class Main20{
    public static void main(String[] args) {

        Replit119 r = new Replit119();

        System.out.println(r.censorLetter("computer science ",'e'));
        System.out.println(r.censorLetter("trick or treat ",'t'));

    }
}




