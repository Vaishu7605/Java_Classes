
import java.io.*;

public class bufferIn {

    public static void main(String[] args)
            // ---IOException : error handling method-----//
            throws IOException {
        // java.io.BufferedReader a = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter your name: ");
        // String name = a.readLine();
        // System.out.println("enter your name: " + name);

        System.out.println("Enter ur age: ");
        // String age = a.readLine();
        // System.out.println("Your age is: " + age);
        // String age = a.readLine();
        int age1 = Integer.parseInt(a.readLine());
        System.out.println(2 * age1);

    }
}
