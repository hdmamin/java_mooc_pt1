import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: ");
        int b = Integer.parseInt(reader.nextLine());

        // Implement your program here. Remember to ask the input from user
        System.out.println("Sum of the numbers: " + (a + b));
    }
}
