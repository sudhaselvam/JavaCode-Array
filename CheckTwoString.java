package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTwoString {

	private static boolean isSubstring1(String p, String s) {
		return p.contains(s);
	}

	private String isSubstring(String p, String s) {
		String status = "NO";
		if (p.contains(s)) {
			return status = "YES";
		}
		return status;

	}

	@Test
	public void testcase() {
		String s = "xxy";
		String p = "yxxyxxy";
		Assert.assertEquals(isSubstring(p, s), "YES");
	}
	@Test
	public void testcase1() {
		String s = "cgfgfc";
		String p = "cfg";
		Assert.assertEquals(isSubstring(p, s), "NO");
	}
	@Test
	public void testcase2() {
		String s = "car";
		String p = "caribbean";
		Assert.assertEquals(isSubstring(p, s), "YES");
	}
}
