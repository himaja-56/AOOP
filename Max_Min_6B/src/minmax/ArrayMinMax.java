package minmax;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMinMax<T> implements MinMax<T> {
	private T[] array;
	private Comparator<? super T> comparator;
	public ArrayMinMax(T[] array,Comparator<? super T> comparator) {
		this.array=array;
		this.comparator=comparator;
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		return Arrays.stream(array).min(comparator).orElse(null);
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		return Arrays.stream(array).max(comparator).orElse(null);
	}

}
