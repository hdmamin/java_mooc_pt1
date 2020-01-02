import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> nums;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.nums = new ArrayList();
    }
    
    public void addNumber(int newNum) {
        this.nums.add(newNum);
        this.amountOfNumbers++;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        int total = 0;
        for (int num:this.nums) {
            total += num;
        }
        return total;
    }
    
    public double average() {
        int count = amountOfNumbers();
        if (count > 0){
            return (double)sum() / amountOfNumbers();
        } else {
            return 0.0;
        }
    }
}
