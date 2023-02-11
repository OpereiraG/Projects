package Class23Java;

public class Student {

    public void study(){
        System.out.println("Study time");
    }
    public void GoingToSchool(){
        System.out.println("Going to school");
    }


}
 class SyntaxStudent extends Student{

    public void study(){
        System.out.println("SyntaxStudent go to school");
    }
    public void GoingToSchool(){
        System.out.println("SyntaxStudent goes to school");
    }

}
class CollegeStudent extends Student{
    public void study(){
        System.out.println("CollegeStudent go to school");
    }
    public void GoingToSchool(){
        System.out.println("CollegeStudent goes to school");
    }

}
class SchoolStudent extends Student{

    public void study(){
        System.out.println("CollegeStudent go to school");
    }
    public void GoingToSchool(){
        System.out.println("CollegeStudent goes to school");
    }

}
