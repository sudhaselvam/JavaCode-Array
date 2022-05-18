package dailypractice;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonElementInArray {

	public List<Integer> commonEle(int[] a, int[] b) {

		List<Integer> obj = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == (b[j])) {

					System.out.println("commom element is" + (a[i]));
					obj.add(a[i]);
				}
			}
		}
		System.out.println(obj);
		return obj;

	}

	public static void commonElement(int[] array1, int[] array2) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == (array2[j])) {

					System.out.println("Common element is : " + (array1[i]));

				}
			}
		}

	}

	public List<Integer> CommonElementInArray(Integer[] a, Integer[] b) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int element = a[i];

			for (int j = 0; j < b.length; j++) {

				if (element < b[j])
					break;

				if (element == b[j]) {
					list.add(element);

					b[j] = -2;
					break;

				}
			}
		}
		System.out.println(list);
		return list;

	}

	@Test
	public void testcase() {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 19, 23, 23, 4, 5 };
		Assert.assertEquals(commonEle(a, b).size(), 2);
	}
	@Test
	public void testcase2() {
		Integer[] a= {1,2,2,3,4};
		Integer[] b= {2,2,3,3,4};
		Assert.assertEquals(CommonElementInArray(a, b).size(), 4);
	}
	

}
