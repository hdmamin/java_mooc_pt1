import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers");
        int num;
        NumberStatistics nums = new NumberStatistics();
        NumberStatistics evens = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();
        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            nums.addNumber(num);
            if (num % 2 == 0) {
                evens.addNumber(num);
            } else {
                odds.addNumber(num);
            }
        }
        
        System.out.println("sum: " + nums.sum());
        System.out.println("sum of even: " + evens.sum());
        System.out.println("sum of odd: " + odds.sum());
    }
}
