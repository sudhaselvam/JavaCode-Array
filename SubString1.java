package dailypractice;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubString1 {
	
	public static int findSubString(String str) {
		int count =0;;
		 String str1="";
		List<String> result = new ArrayList<String>();
		for(int i =0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				//System.out.println(str.substring(i,j));
				
				result.add(str.substring(i,j));
				//
				System.out.println(result);
				
				
				
			}
		}
		

        for (int i = 0; i < result.size(); i++)
        {
            if (result.get(i).contains("a") || result.get(i).contains("e") || result.get(i).contains("i") ||result.get(i).contains("o") || result.get(i).contains("u"))
            {
                count++;
            }
        }
//		str1 = result.toString();
//		  System.out.println(str1);
//		String[] arr= str.split(" ");
//		
//		
//			 for(int s=0; s<arr.length; s++) {
//				 //char ch = str1.charAt(s);
//		         if(arr[s] == "a"|| arr[s] == "e"||   arr[s]== "i" || arr[s]== "o" || arr[s] == "u"){
//		            count ++;
//		         }
//	
//		
//	}
			 
		System.out.println(count);
		return count;
	}
	
//	public boolean isvowel(String str) {
//		
//		
//		int count =0;
//		 for (int i=0 ; i<str.length(); i++){
//	         char ch = str.charAt(i);
//	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
//	            count ++;
//	         }
//	      }
//		//return ;
//	}
//	
	public static int count(String str)
	{
		String str1="";
		int count=0;
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
			 str1=str.substring(i,j);
			 boolean result=true;
				for(int k=0;k<str1.length();k++)
				{
					if(!(str1.charAt(k)=='i'||str1.charAt(k)=='a'||str1.charAt(k)=='e'||str1.charAt(k)=='o'||str1.charAt(k)=='u'))
						result=false;
						
				}
				if(result)
					count++;
			}
		}
		System.out.println(count);
		return count;
		
			}
		
		
	

	@Test
	public void testcase() {
		
		
		Assert.assertEquals(count("codestudio"),6);
		
	}
	@Test
	public void test2()
	{
		String s="wxyz";
		Assert.assertEquals(count(s), 0);
	}

}

