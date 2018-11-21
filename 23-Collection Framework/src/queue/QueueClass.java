package queue;
import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		//Add elements
		for (int i=0; i<5; i++) {
			q.add(i);
		}
		System.out.println(q);
		int removed = q.remove();//FIFO -> first in, first out
		System.out.println(removed);
		System.out.println(q);
		System.out.println(q.peek());//shows first element
		System.out.println(q.size());

	}

}
