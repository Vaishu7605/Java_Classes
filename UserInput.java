
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // java.util.Scanner a = new java.util.Scanner(System.in);
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number : ");

        int num = a.nextInt();
        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

        // float height = a.nextFloat();
        // System.out.println("your height: " + height);
        // double phone = a.nextDouble();
        // System.out.println("your phone no. is : " + phone);
        // int phone = a.nextInt();
        // System.out.println("Your phone no. is : " + phone);
        // byte age = a.nextByte();
        // System.out.println("your age is : " + age);
        // System.out.println("Do you have a laptop ?");
        // boolean laptop = a.nextBoolean();
        // if (laptop) {
        //     System.out.println("I have a laptop.");
        // } else {
        //     System.out.println("you don't have a Laptop.");
        // }
        // System.out.println("Enter your name: ");
        // String name = a.nextLine();
        // System.out.println("Your name is : " + name);
        // System.out.println("enter password : ");
        // String pass = a.nextLine();
        // // System.out.println("password: " + pass);
        // if (name.equals("vaishu") & pass.equals("123")) {
        //     System.out.println("Authorised User");
        // } else {
        //     System.out.println("Unauthorised...");
        // }
        // if (name.equals("Vaishu") || name.equals("")) {
        //     // System.out.println("Authorised User");
        //     if (pass.equals("123")) {
        //         System.out.println("Authorised User");
        //     }
        // } else {
        //     System.out.println("Logging Out...");
        // }
        // if (name = "vaishu ") {
        //     System.out.println("Authorised User");
        // } else {
        //     System.out.println("Logging Out...");
        // }
        // System.out.println("Enter your age: ");
        // int age = a.nextInt();
        // if (age >= 18) {
        //     System.out.println("You can vote...");
        // } else {
        //     System.out.println("You cannot Vote !!!");
        // }
    }
}
