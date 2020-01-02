import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> scores = loadRawScores(reader);
        Grades grades = new Grades(scores);
        grades.calcDistribution();
        System.out.println("Grade distribution:");
        grades.printDistribution();
        System.out.println("Acceptance percentage: " + grades.acceptPercent());
    }
    
    public static ArrayList<Integer> loadRawScores(Scanner reader) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            
            // Ignore scores entered outside of viable range.
            if (num >= 0 && num <=60) {
                scores.add(num);
            }
        }
        return scores;
    }
}
