import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    private int numNumbers;
    private int minVal;
    private int maxVal;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.numNumbers = 7;
        this.minVal = 1;
        this.maxVal = 39;
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int newNum;
        // Draw until we have specified number of unique numbers.
        while (this.numbers.size() < this.numNumbers) {
            newNum = this.minVal + this.random.nextInt(this.maxVal);
            if (!containsNumber(newNum)) {
                this.numbers.add(newNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
