package epamInterview;

public class ReverseAnArrayOfCharacters {

	public static void main(String[] args) {
		
        char[] arr = {'j', 'a', 'v', 'a'};
        
        int left =0;
        int right =arr.length-1;
        
        while(left<right) {
        	
        	Character temp = arr[left];
        	arr[left] = arr[right];
        	arr[right] = temp;
        	left++;
        	right--;
        	
        }
        System.out.println(arr);

	}

}
