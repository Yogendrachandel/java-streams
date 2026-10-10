package complex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListOfDuplicateKeyAsMap {

	public static void main(String[] args) {
     // Output - > rahul =2 , ajay=1 , summit =2
		
     List<String>list = Arrays.asList("rahul","ajay","rahul","summit","kunal","rahul");
     
     
     //way =1
    Map<String,Integer>map = list.stream().collect(Collectors.toMap(Function.identity()//key mapper
    		         , name -> 1, //value mapper
    		         (oldValue, newValue)-> oldValue+newValue)); //function mapper -This is called only when a duplicate key is found. 
    System.out.println(map);
                 
     

	}

}
