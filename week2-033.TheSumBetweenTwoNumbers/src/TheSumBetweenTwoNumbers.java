
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int last = Integer.parseInt(reader.nextLine());
        
        int curr = first;
        int total = 0;
        while (curr <= last) {
            total += curr;
            curr++;
        }
        System.out.println("The sum is " + total);
    }
}
