package Class16Java;

public class StudentTester2 {
    public static void main(String[] args) {


        Students students = new Students();
        students.name="Nelson";
        students.id="a123";
        students.numberOfStudents++;

        Students students2 = new Students();
        students.name="Nezir";
        students.id="a456";
        students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);



    }


}
