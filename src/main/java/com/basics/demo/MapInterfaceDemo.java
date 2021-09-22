package com.basics.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo {
	
 public static void main(String[] args) {
	 Map<String, Integer> map = new HashMap<String, Integer>();//HashMap(introduced in 1.2V, fast, insertion order is not maintained, not thread safe, not synchronized, one NUll key is allowed, works with single thread), LinkedHashMap(insertion order is maintained, {HashTable() insertion order is not maintained, older versions of java used it, works with multi thread, its synchronized, thread safe, slow,No NUll key},)
	 map.put("monisha", 67298);
	 map.put("hello", 2344);
	 map.put("test", 1234);
	 
	 // first way to retrieve values
	 Set<String> key = map.keySet();
			 
	 for(String k : key)
	 System.out.println(map.get(k));//keyset
	 
	 
	 //important way retrieve key and values
	 Set<Map.Entry<String, Integer>> data = map.entrySet();
	 
	 for(Map.Entry<String, Integer> d:data) {
		 System.out.println(d.getKey()+" " + d.getValue());
	 }
	 
	 
 }
	
}
