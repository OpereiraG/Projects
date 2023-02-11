package Replits;

public class Replit142 {


    String schoolName;
    int batch;
    int year;
    String lasDayOfClass;

    Replit142() {

    }

    Replit142(String schoolName, int batch, int year, String lasDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lasDayOfClass = lasDayOfClass;

    }

    void displayInfo() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lasDayOfClass);
    }

    public static void main(String[] args) {
        Replit142 r1 = new Replit142();
        Replit142 r2 = new Replit142("Syntax", 6, 2020, "07/30/2020");
        r1.displayInfo();
        r2.displayInfo();

    }
}



