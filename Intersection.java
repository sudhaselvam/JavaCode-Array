package dailypractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
	
	public static int sort(int[]a,int[]b) {
		int c = 0 ;
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					c=a[i];
					
				}
				
			}
		}
		return c;
		
	}
	
	public static void inter(Integer[]array1,Integer[]array2) {
		HashSet<Integer> set = new HashSet<>(); 
		 set.addAll(Arrays.asList(array1));
	     
	    set.retainAll(Arrays.asList(array2));
	     
	    System.out.println(set);
	     
	    //convert to array
	    Integer[] intersection = {};
	    intersection = set.toArray(intersection);
	     
	    System.out.println(Arrays.toString(intersection));
	}
 
	public static void main(String[] args) {
	 Integer []a= {1,2,2,3,4};
		Integer[]b= {1,2,2,4};
		//sort(a,b);
		inter(a,b);
		
	}

}
