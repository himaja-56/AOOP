package minmax;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {10, 5, 11, 14, 22};
        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(intArray, Comparator.naturalOrder());
        System.out.println("Integer Array - Min: " + intMinMax.min() + ", Max: " + intMinMax.max());

        // String array
        String[] strArray = {"mango", "apple", "banana", "watermelon"};
        ArrayMinMax<String> strMinMax = new ArrayMinMax<>(strArray, Comparator.naturalOrder());
        System.out.println("String Array - Min: " + strMinMax.min() + ", Max: " + strMinMax.max());

        // Character array
        Character[] charArray = {'a', 'y', 'd', 'e', 'f'};
        ArrayMinMax<Character> charMinMax = new ArrayMinMax<>(charArray, Comparator.naturalOrder());
        System.out.println("Character Array - Min: " + charMinMax.min() + ", Max: " + charMinMax.max());

        // Float array
        Float[] floatArray = {3.5f, 2.8f, 1.8f, 10.9f};
        ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>(floatArray, Comparator.naturalOrder());
        System.out.println("Float Array - Min: " + floatMinMax.min() + ", Max: " + floatMinMax.max());
		// TODO Auto-generated method stub

	}

}
