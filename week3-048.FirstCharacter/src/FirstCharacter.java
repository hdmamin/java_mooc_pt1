import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        char first = firstCharacter(name);
        System.out.println("First character: " + first);
    }
    
    public static char firstCharacter(String name) {
        return name.charAt(0);
    }
}
