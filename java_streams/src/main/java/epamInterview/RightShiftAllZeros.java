package epamInterview;

import java.util.Arrays;

public class RightShiftAllZeros {

	    public static void main(String[] args) {
	     
	            int[] arr = {1, 0, 2, 0, 3};
	            int insertPos = 0;
	            for (int num : arr) {
	                if (num != 0)
	                	arr[insertPos++] = num;
	            }
	            while (insertPos < arr.length)
	            	arr[insertPos++] = 0;
	            System.out.println(Arrays.toString(arr));
	        }

	    
	

}
