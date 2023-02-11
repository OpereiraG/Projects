package Replits;

public class Replit133 {


    static int countA(String s ){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
        if (s.charAt(i)=='a' || s.charAt(i)=='A')
            count++;
        }
        return count;
    }

}
class Main10{
    public static void main(String[] args) {
        System.out.println(Replit133.countA("aaa"));
        System.out.println(Replit133.countA("aaBBdf8k3AAadnklA"));

    }
}
