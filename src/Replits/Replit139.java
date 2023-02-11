package Replits;

public class Replit139 {
    static public String alphabetical1(String str){
        String letter=str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>str.charAt(i-1)){
                letter+=str.charAt(i);
            }

        }
        return letter;
    }

    public static void main(String[]args){
        Main ma=new Main();

        /*System.out.println(ma.alphabetical1("hello"));
        System.out.println(ma.alphabetical1("software"));
        System.out.println(ma.alphabetical1("language"));*/
    }


}
