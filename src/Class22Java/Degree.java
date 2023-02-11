package Class22Java;

import org.w3c.dom.ls.LSOutput;

public class Degree {



    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{


}
class Masters extends Degree{

    void getPrerequisite(){
        //super.getPrerequisite();
        System.out.println("To get a master degree you need a bachelor degree");
    }

}
class Main{
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getPrerequisite();
        Bachelors b = new Bachelors();
        b.getPrerequisite();
        Masters m = new Masters();
        m.getPrerequisite();


    }
}
