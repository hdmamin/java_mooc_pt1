import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] nums = {3, 44, 1, 99, 16, 0};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(copy(nums)));
        System.out.println(Arrays.toString(reverseCopy(nums)));
    }
    
    public static int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    
    public static int[] reverseCopy(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];
        for (int i=0; i<length; i++) {
            reversed[i] = arr[length-1-i];
        }
        return reversed;
    }
    
}
