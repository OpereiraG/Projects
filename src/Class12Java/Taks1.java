package Class12Java;

import java.util.Scanner;

public class Taks1 {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: ");
        String passWord = scanner.nextLine();
        System.out.println("Confirm the password: ");
        String confirmPassword=scanner.nextLine();

        if (userName.isEmpty() || passWord.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        } else if (passWord.length() < 8) {
            System.out.println("Password is too short");
        } else if (passWord.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!confirmPassword.equals(passWord)) {
            System.out.println("Passwords do not match");
        }
        else {
            System.out.println("Your username and password has been created");
        }

    }


}

