package dailypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MostOccuringInArray {
	
	public List<Integer> frequency(int[]arr) {
		int max=0;
		List<Integer> list=new ArrayList<Integer>();
		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
		
		 for (int i = arr.length-1; i>= 0; i--)

		 {

		    if (map.containsKey(arr[i]))

		           {

		       int count = map.get(arr[i]);

		       map.put(arr[i], ++count);

			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		
		Set<Entry<Integer, Integer>> entry  = map.entrySet() ;
		for( Entry<Integer,Integer>re:entry){
			if(re.getValue()>=max) {
				max=re.getValue();
			}
			
			
			
			
		}
	Set<Entry<Integer,Integer>> maxi=	map.entrySet();
	
	for(Entry<Integer,Integer>res:maxi) {
		if(res.getValue()==max) {
			list.add(res.getKey());
		}
	}
	System.out.println(list);
	return list;
	}
	@Test
	public void testcase() {
		int[]arr= {10,20,20,10,30};
		Assert.assertTrue(frequency(arr).contains(10));
	}
	
	

}
