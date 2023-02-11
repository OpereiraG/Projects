package Replits;


class Replit146{

String name;
String lastName;
int employeeId;
String startDate;
int salary;


Replit146(){

}

Replit146(String name,String lastName,int employeeId,String startDate,int salary){
    this.name=name;
    this.lastName=lastName;
    this.employeeId=employeeId;
    this.startDate=startDate;
    this.salary=salary;
}

void printInfo(){
    System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
}

}
class R146 {
    public static void main(String[] args) {

        Replit146 r = new Replit146();
        Replit146 r1 = new Replit146("Joe","Smith",12345,"01/01/1970",35000);
        r.printInfo();
        r1.printInfo();

    }


}
