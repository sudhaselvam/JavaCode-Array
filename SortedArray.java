package dailypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortedArray {
	
	public List<Integer> sortedArray(int[]arr){
       List<Integer> list = new ArrayList<Integer>();
	
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	
	for(int i=0;i<arr.length;i++) {
		map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
	}
	TreeMap<Integer, Integer> sorted = new TreeMap<>(map); 
	
	Set<Entry<Integer, Integer>> mappings = sorted.entrySet();
	
	for(Entry<Integer, Integer> mapping : mappings){ System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

	
	
	
	
	return list;
	
	
	}
}
