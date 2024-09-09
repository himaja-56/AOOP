package streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeline {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = numbers.stream()
        							  .filter(n->n%2==0)  // Filter even numbers
                                      .map(n->n*2)          // Double the even numbers
                                      .collect(Collectors.toList()); // Collect to a list

        System.out.println(result); 
		// TODO Auto-generated method stub

	}

}
