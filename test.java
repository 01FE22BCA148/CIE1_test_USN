import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to the Java Greeting Program.");

        scanner.close();
    }
}
