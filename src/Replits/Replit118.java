package Replits;

public class Replit118 {

    String spaceOut(String word){
        String name=word.replace(""," ");
        return name;
    }
}
class Main12{
    public static void main(String[] args) {
        Replit118 r = new Replit118();

        System.out.println(r.spaceOut("hello"));
        System.out.println(r.spaceOut("technology"));
    }

}
