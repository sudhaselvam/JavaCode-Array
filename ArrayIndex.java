package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayIndex {
	public boolean firstLast6(int[] nums) {
	    if (nums == null || nums.length == 0) {
	        return false;
	    }

	    return
	    		nums[0] == 6 || nums[nums.length - 1] == 6;
	}
	@Test
	public void testcase() {
		int [] nums= {1,2,6};
		Assert.assertTrue(firstLast6(nums));
		
	}
	@Test
	public void testcase1() {
		int [] nums= {6,1,2,3,};
		Assert.assertTrue(firstLast6(nums));
		
	}
	@Test
	public void testcase2() {
		int [] nums= {13,1,6,2,3,};
		Assert.assertFalse(firstLast6(nums));
		
	}

}
