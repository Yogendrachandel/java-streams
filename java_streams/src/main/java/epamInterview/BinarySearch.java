package epamInterview;



public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
        	
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) return mid;
            
            if (arr[mid] < target) low = mid + 1;
            
            else high = mid - 1;
        }
        return -1;
    }
    
    public static void main(String args[]) {
    	
    	 // Binary search requires a SORTED array
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetValue = 23;

        int resultIndex = search(numbers, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element " + targetValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
