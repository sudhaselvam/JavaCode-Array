package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfSquare {
	public int squareFun(int n) {

		int p = (int) Math.pow(n, 2);
		int c = (int) Math.pow(n, 3);
		int sum = p + c;
		return sum;

	}

	@Test
	public void testcase() {
		Assert.assertEquals(squareFun(3), 36);

	}
}
