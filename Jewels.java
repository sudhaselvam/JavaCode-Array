package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Jewels {
	
	public int countJewels(String s,String j) {
		int count =0;
		
		for(int i =0;i<s.length();i++) {
			for(int k=0;k<j.length();k++) {
				if(s.charAt(i)==j.charAt(k)) {
					
					count++;
				}
			}
		}
		return count;
	}
	@Test
	public void testcase() {
		String s1 = "aA";
		String s2 = "aAAAbbb";
		Assert.assertEquals(countJewels(s1, s2), 4);
	}

	@Test
	public void test2() {
		String s1 = "aA";
		String s2 = "cdgbbb";
		Assert.assertEquals(countJewels(s1, s2), 0);
	}
		
	}


