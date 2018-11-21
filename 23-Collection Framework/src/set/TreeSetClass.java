package set;

import java.util.*;

public class TreeSetClass { //duplicates are not preserved, order is sorted ascending

	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<Integer>();
		values.add(15);
		values.add(19);
		values.add(6);
		values.add(6);
		values.add(8);
		values.add(88);
		for(int i: values) {
			System.out.println(i);
		}
	}

}
