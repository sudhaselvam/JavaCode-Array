package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FIndSubStringPallindrome {
	
	public boolean isPalindrome(String input) {
		
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
	  return sb.toString().equals(input);
		
	}
	
	public int count(String str) {
		int count =0;
	
	String[]arr= str.split(" ");
	for(int i =0;i<arr.length;i++) {
		if(isPalindrome(arr[i])) {
			count++;
	}
	}
	return count;

}
	@Test
	public void testcase() {
		Assert.assertEquals(count("this is a racecar"), 2);
	}
	
	@Test
	public void testcase1() {
		Assert.assertEquals(count("this is a racecar mam"), 3);
	}
}
