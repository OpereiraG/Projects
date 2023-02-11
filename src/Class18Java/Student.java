package Class18Java;

public class Student {

    String name;

    String address;

    Student(String name,String address){
        this.name=name;
        this.address=address;


    }
    void printInfo(){
        System.out.println(name+" "+address);
    }
}
