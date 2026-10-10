package arthmaticOperation;

import java.util.Arrays;
import java.util.List;

public class ArthmaticOperation {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//sum
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		System.out.println("The sum of all list elments ="+sum);
		
		
		int addition = list.stream().mapToInt(e-> e).sum();
		System.out.println("The sum of all list elments ="+addition);
		
		
		//multiply
		int multiply = list.stream().reduce(1, (a,b) -> a*b);
		System.out.println("The multiplication  of all list elments ="+multiply);				
	}

}
