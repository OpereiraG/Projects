public class Test {



    String name;

    String school;

    Test(String name, String school){
        this.name=name;
        this.school=school;
    }



    Test(){

    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test("Nelson","Syntax");
    }
}


