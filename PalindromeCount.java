package dailypractice;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeCount {
	
	public static int count(String str) {
		String re="";
		int count=0;
	String []	arr=str.split(" ");
	for(int i =0;i<arr.length;i++) {
		StringBuilder sb = new StringBuilder(arr[i]);
		sb.reverse();
		re=sb.toString();
		if(re.equals(arr[i])) {
			count++;
		}
		
	}
	System.out.println(count);
	return count;
	}
	
	public int findAllPalindromesUsingBruteForceApproach(String input) {
	    int count =0;
	    String temp="";
	    for (int i = 0; i < input.length(); i++) {
	        for (int j = i + 1; j <= input.length(); j++) {
	        	temp=input.substring(i, j);
	            if (isPalindrome(temp)) {
	               count++;
	            }
	        }
	    }
	    return count;
	}
	private boolean isPalindrome(String input) {
	    StringBuilder plain = new StringBuilder(input);
	    StringBuilder reverse = plain.reverse();
	    return (reverse.toString()).equals(input);
	}

	@Test
	public void test() {
		Assert.assertEquals(count("this is a racecar"),2);
		
	}
	@Test
	public void test1() {
		Assert.assertEquals(findAllPalindromesUsingBruteForceApproach("aaa"),6);
		
	}

}
