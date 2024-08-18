package array;

/**
 * Subarray
 */
public class Subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };
        int sum = 12;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}