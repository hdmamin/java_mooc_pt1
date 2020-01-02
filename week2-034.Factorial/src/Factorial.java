import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int total = 1;
        int i = 1;
        while (i <= n) {
            total *= i;
            i++;
        }
        System.out.println("Factorial is " + total);
    }
}
