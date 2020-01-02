
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate first = new MyDate(3, 1, 1999);
        MyDate second = new MyDate(4, 12, 1993);
        MyDate third = new MyDate(17, 4, 2005);
        
        System.out.println(first.differenceInYears(second));
        System.out.println(first.differenceInYears(third));
    }
}
