
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int num = Integer.parseInt(reader.nextLine());
        int curr = 1;
        int total = 0;
        while (curr <= num) {
            total += curr;
            curr++;
        }
        System.out.println("Sum is " + total);
    }
}
