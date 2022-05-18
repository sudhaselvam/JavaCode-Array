package dailypractice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LexicalWords {

	public static String lex(String str) {
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		String str1 = Arrays.toString(arr);
		System.out.println(str1);
		return str1;
	}

	@Test
	public void testcase() {
		Assert.assertEquals(lex("hello every one "), "[every, hello, one]");
	}

}
