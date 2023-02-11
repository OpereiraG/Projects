package Class23Java;

public class Class23Java {


    double balance;

    double intrest;

    public Class23Java(double balance, double intrest) {
        this.balance = balance;
        this.intrest = intrest;
    }

    public void calculateInterest(){
        System.out.println("Interest "+(balance*intrest)/100);
    }

}
