package Class17Java;

public class Student {
    String id;

    String name;

    int age;

    double weight;


    Student(String studentId,String studentName,int studentAge,double studentWeight){

        id=studentId;
        name=studentName;
        age=studentAge;
        weight=studentWeight;



    }
    void printInfo(){
        System.out.println("Id: "+id+", Name: "+name+", Age: "+age+", Weight: "+weight);
    }

}
