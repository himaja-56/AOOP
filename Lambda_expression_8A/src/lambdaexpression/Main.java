package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "watermelon", "mango");

        // Sorting in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println(strings);
		
		// TODO Auto-generated method stub

	}

}
