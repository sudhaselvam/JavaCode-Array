package dailypractice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LexicalOrder {

	public static String lexical(String str) {
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		String str1 = Arrays.toString(arr);
		System.out.println(str1);
		return str1;

	}
	
	public String lexicalWords(String str) {
		char[]arr=str.toCharArray();
		Arrays.sort(arr);
		
		String str1 =Arrays.toString(arr);
		
		
		return str1;
		
	}

	@Test
	public void testcase() {
		Assert.assertEquals(lexical("java"), "[a, a, j, v]");
	}
	
	@Test
	public void testcase1() {
		Assert.assertEquals(lexicalWords("selenium"), "[e, e, i, l, m, n, s, u]");
	}


}
