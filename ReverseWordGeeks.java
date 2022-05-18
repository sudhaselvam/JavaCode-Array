package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordGeeks {
	
	public String rev(String str) {
		String re="";
		for(int i = str.length()-1;i>=0;i--) {
			re=re+ str.charAt(i);
					
		}
		return re;
	}
	
	@Test
	public void reve() {
		Assert.assertEquals(rev("Geeks"), "skeeG");
	}

}
