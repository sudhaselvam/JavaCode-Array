package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseEachWord {

	public String reverseEachWord(String str) {

		String[] arr = str.split(" ");

		String reversedString = "";
		

		for (int i = 0; i < arr.length; i++) {

			String word = arr[i];
			String wordRev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				
				wordRev = wordRev + word.charAt(j);
			}
			
				reversedString = reversedString + wordRev +" ";

			}
		return reversedString.trim();
		}
	
	public String reve(String str) {
		String[]words=str.split(" ");
		String result="";
				for(String word:words) {
			String re ="";
			for(int i=word.length()-1;i>=0; i--) {
				re=re+word.charAt(i);
				
			}
			result=result+re+" ";
			
		}
		return result.trim();
	}
	
	public String rev1(String str) {
		String result="";
	String[] words=	str.split(" ");
	for(String w:words) {
		
		StringBuilder sb= new StringBuilder(w);
		sb.reverse();
		sb.toString();
		result=sb.toString();
	}
	return result.trim();
		
	}
		
	
	@Test
	public void testcase() {
		String str = "java is powerful programming  language";
		//String str="my name is khan";
		Assert.assertEquals(reverseEachWord(str), "avaj si lufrewop gnimmargorp  egaugnal");
	}
	
	@Test
	public void testcase1() {
		String str = "java is powerful programming  language";
		//String str="my name is khan";
		Assert.assertEquals(reve(str), "avaj si lufrewop gnimmargorp  egaugnal");
	}
	
	@Test
	public void testcase2() {
		String str = "java is powerful programming  language";
		//String str="my name is khan";
		Assert.assertEquals(rev1(str), "avaj si lufrewop gnimmargorp  egaugnal");
	}

}
