package Replits;

public class Replit134 {
     int countVowels(String  s){
        return (s.replaceAll("[^aeiouAEIOU]","").length());

    }
}

class R134{
    public static void main(String[] args) {

        Replit134 r = new Replit134();
        System.out.println(r.countVowels("obama"));
        System.out.println(r.countVowels("happy friday! i love weekends"));

    }

}
