package map;
import java.util.*;
public class HashMapClass {

	public static void main(String[] args) {
		
		//HashMap -> fast, unsynchronized, works with single thread, allows one null key
		//HashTable -> slow, synchronized, works with multiple threads, does not allow null key 
		//LinkedHashMap -> preserves the insertion order.
		
		
		Map map1 = new HashMap();
		Map<String,String> map = new HashMap<>();
		
		map.put("myName","Mike");
		map.put("myJob","Developer");
		map.put("myAge","25");
		map.put("x","y");
		map.put("m","y");
		System.out.println(map);//insertion order not preserved
		System.out.println(map.get("myName"));
		System.out.println(map.get("myName2"));
		
		Set<String> keys = map.keySet();
		for (String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
