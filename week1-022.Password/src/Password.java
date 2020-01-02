
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Type the password: ");
            String userPassword = reader.nextLine();   
            if (userPassword.equals(password)) {
                System.out.println("Right! \n\nThe secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

    }
}
