
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky sky = new NightSky(.25, 40, 12);
        sky.print();
        System.out.println(sky.starsInLastPrint());
    }
}
