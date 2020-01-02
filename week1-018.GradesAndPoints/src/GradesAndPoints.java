
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int numericGrade = Integer.parseInt(reader.nextLine());
        
        String grade = null;
        if (numericGrade >= 0 && numericGrade <= 29) {
            grade = "failed";
        } else if (numericGrade > 29 && numericGrade <= 34) {
            grade = "1";
        } else if (numericGrade > 34 && numericGrade <= 39) {
            grade = "2";
        } else if (numericGrade > 39 && numericGrade <= 44) {
            grade = "3";
        } else if (numericGrade > 44 && numericGrade <= 49) {
            grade = "4";
        } else if (numericGrade <= 60) {
            grade = "5";
        }
        
        System.out.println("Grade: " + grade);
        
    }
}
