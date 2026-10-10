package epamInterview;

import java.util.Arrays;

public class WindowSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4, 6};
        int k = 3;
        
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
            for (int j = i; j > i - k && j >= 0; j--) {
                sum += arr[j];
            }
            
            result[i] = sum;
        }
        System.out.println(Arrays.toString(result));
    }
}
