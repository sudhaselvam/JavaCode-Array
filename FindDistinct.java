package dailypractice;

import java.util.HashSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDistinct {
	
	public int distinctSubString(String str) {
		int count =0;
		HashSet<String>set = new HashSet<String>();
		for(int i =0; i<=str.length();i++) {
			for(int j =i+1;j<=str.length();j++) {
				set.add(str.substring(i,j));
				set.add(" ");
				count=set.size();
				
			}
		}
		
		
		
		return count;
		
	}
	@Test
	public void testcase() {
		Assert.assertEquals(distinctSubString("abc"), 7);
		
	}
	@Test
	public void testcase1() {
		Assert.assertEquals(distinctSubString("sds"), 6);
		
	}

}
