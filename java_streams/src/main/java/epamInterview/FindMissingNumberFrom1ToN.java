package epamInterview;

import java.util.Arrays;

public class FindMissingNumberFrom1ToN {

	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int expectedSum = n*(n+1)/2;
        int missingNumber =  expectedSum - Arrays.stream(arr).sum() ;
        System.out.println(missingNumber);

	}

}
