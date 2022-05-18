package dailypractice;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringConstruction {
	
	public static Set<Character> construction(String s) {
		char[]arr=s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(Character c:arr) {
			set.add(c);
		}
		System.out.println(set.size());
		return set;
	}
	

	@Test
	public void testcase() {
		
	Assert.assertEquals(construction("abcd").size(), 4);
}
	@Test
	public void testcase1() {
		
	Assert.assertEquals(construction("abab").size(), 2);
}

}
