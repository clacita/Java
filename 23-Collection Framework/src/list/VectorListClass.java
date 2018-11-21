package list;
import java.util.Vector;

public class VectorListClass {

	public static void main(String[] args) {
		//vector has an initial size of 10. the increase capacity is 100%. It is slow to use - not good to use. 
		
		Vector<Integer> v= new Vector<Integer>();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		
		v.add(2);
		
		
		System.out.println(v.capacity());//what? result is 20.then 40. 

	}

}
