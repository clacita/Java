import java.util.*;

public class GroceryList {
	List groceryList1 = new ArrayList(); //if you have multiple data types
	List<String> groceryList = new ArrayList<String>(); //you want to specify a data type
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list");
		for (int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1)+". "+ groceryList.get(i));
		}
	}
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
	}
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position); // gets you index number, but you don't need it. 
		groceryList.remove(position);
	}
	public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem); // this returns a boolean if that element is in the collection or not.
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}
		return null;
	}
}
