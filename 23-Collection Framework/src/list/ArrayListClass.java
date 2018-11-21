package list;

import java.util.*;

public class ArrayListClass {//duplicates are allowed, insertion order is preserved
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(10);
		values.add(1, 9);
		values.add(2);
		System.out.println(values);
		
		Collections.sort(values);
		System.out.println(values);
		for (int i : values) {
			System.out.println(i);
		}
	}
}
