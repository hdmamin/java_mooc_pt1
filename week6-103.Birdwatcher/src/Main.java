import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Database db = new Database();
        
        while (true) {
            System.out.print("?");
            String response = reader.nextLine();
            if (response.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                db.addBird(name, latinName);
            } else if (response.equals("Observation")) {
                System.out.print("What was observed:? ");
                String obs = reader.nextLine();
                db.addObservation(obs);
            } else if (response.equals("Statistics")) {
                db.printStats();
            } else if (response.equals("Show")) {
                System.out.print("What? ");
                db.printBird(reader.nextLine());
            } else if (response.equals("Quit")) {
                break;
            }
        }
    }

}
