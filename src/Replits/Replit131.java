package Replits;

public class Replit131 {

    String a(String s) {

        String str = "";
        for (int i = 0; i < s.length(); i += 3) {

            str += s.charAt(i);

        }
        return str;

    }
}

class R131 {
    public static void main(String[] args) {

        Replit131 r = new Replit131();
        System.out.println(r.a("Hello there"));
        System.out.println(r.a("technology"));
    }
}

