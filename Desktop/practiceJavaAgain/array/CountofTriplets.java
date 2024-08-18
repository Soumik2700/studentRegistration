package array;

import java.util.Scanner;

public class CountofTriplets {
    public static int countTriplet(int arr[], int n) {
        // code here
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countTriplet(null, 0));
    }
}