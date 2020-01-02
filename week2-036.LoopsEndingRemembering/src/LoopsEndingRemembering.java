import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int num = 0;
        int total = 0;
        int count = 0;
        int evens = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.nextLine());
            if (num != -1){
                total += num;
                count++;
                if (num % 2 == 0) {
                    evens++;
                }
            }
        }
        double avg = (double)total / count;
        int odds = count - evens;
                
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + total);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
