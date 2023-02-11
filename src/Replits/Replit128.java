package Replits;

public class Replit128 {

    static String mixString(String s1,String s2)
    {
        String s = "";
        for (int i = 0;i<s1.length();i++)
            s += s1.substring(i,i+1)+s2.substring(i,i+1);
        return s;
    }
}
class R128{
    public static void main(String[] args) {

        Replit128 r = new Replit128();
        System.out.println(r.mixString("12345","abcde"));
        Replit128 r2 = new Replit128();
        System.out.println(r.mixString("howdy","hello"));




    }
}