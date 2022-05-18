package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceSpace {
	
	public String replace(String str) {
	
			String str1=str.replaceAll("\\s", "@40");
			return str1;
		
	}
	@Test
	public void testcase() {
		Assert.assertEquals(replace("Coding Ninjas Is A Coding Platform"), "Coding@40Ninjas@40Is@40A@40Coding@40Platform");
	}
	@Test
	public void testcase1() {
		Assert.assertEquals(replace("Hello World"), "Hello@40World");
	}

}
