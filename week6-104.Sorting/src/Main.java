
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num:arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] arr) {
        int min = smallest(arr);
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == min) {
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] arr, int start) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i=start; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        
        return idx;
    }
    
    public static void swap(int[] arr, int idx1, int idx2) {
        int val1 = arr[idx1];
        int val2 = arr[idx2];
        arr[idx2] = val1;
        arr[idx1] = val2;
    }
    
    public static void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int idx = indexOfTheSmallestStartingFrom(arr, i);
            swap(arr, i, idx);
        }
    }
}
