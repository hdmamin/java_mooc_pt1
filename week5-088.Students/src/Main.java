
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        // Fill reader list with student objects.
        while (true) {
            System.out.println("name:");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber:");
            String number = reader.nextLine();
            students.add(new Student(name, number));
        }
        
        // Print info for all students.
        for (Student student:students) {
            System.out.println(student);
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student student:students) {
            if (student.getName().contains(term)) {
                System.out.println(student);
            }
        }
    }
}
