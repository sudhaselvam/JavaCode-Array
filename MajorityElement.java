package dailypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityElement {

	public static int majority(int[] num) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : num) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> element : map.entrySet()) {
			if (element.getValue() > num.length / 2) {
				System.out.println(element.getKey());
				return element.getKey();
			}

		}
		return -1;
	}

	@Test
	public void test() {
		int[] num = { 8, 5, 1, 9 };

		Assert.assertEquals(majority(num), -1);
	}

	@Test
	public void test1() {
		int[] num = { 2, 3, 9, 2, 2 };

		Assert.assertEquals(majority(num), 2);
	}

}
