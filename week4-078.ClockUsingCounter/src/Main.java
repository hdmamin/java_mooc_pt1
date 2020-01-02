
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter hour = new BoundedCounter(23);
        BoundedCounter minute = new BoundedCounter(59);
        BoundedCounter second = new BoundedCounter(59);
        
        // Read initial time from user.
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        // Set times.
        hour.setValue(h);
        minute.setValue(m);
        second.setValue(s);
  
        for (int i=0; i<120; i++) {
            System.out.println(hour + ":" + minute + ":" + second);
            second.next();
            if (second.getValue() == 0) {
                minute.next();
                if (minute.getValue() == 0) {
                    hour.next();
                }
            }
        }
        
        // Infinite loop clock.
//        while (true) {
//            System.out.println(hour + ":" + minute + ":" + second);
//            Thread.sleep(1000);
//            second.next();
//            if (second.getValue() == 0) {
//                minute.next();
//                if (minute.getValue() == 0) {
//                    hour.next();
//                }
//            }
//        }
        

    }
}
