package Class16Java;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee s1 = new SyntaxEmployee();
        s1.empID = 123;
        s1.salary = 35000;

        SyntaxEmployee s2 = new SyntaxEmployee();

        s2.empID = 345;
        s2.salary = 78000;

        System.out.println("Employee id: " + s1.empID);
        System.out.println("Employee salary: " + s1.salary);

        System.out.println();
        System.out.println("Employee id: " + s2.empID);
        System.out.println("Employee salary: " + s2.salary);
        System.out.println();

        System.out.println("The CEO is: " + SyntaxEmployee.CEO);


    }

}
