package dailypractice;

public class FindSubString {
	public static int findAllPalindromesUsingBruteForceApproach(String input) {
	    int count =0;
	    String temp="";
	    for (int i = 0; i < input.length(); i++) 
	        for (int j = i + 1; j <= input.length(); j++) 
	        // temp=input.substring(i, j);
	        
	            if (isPalindrome(input.substring(i,j))) 
	            	
	               count++;
	        
	  System.out.println(count);
		return count;
	}
	
	public static int countPal(String str) {
		int count =0;
		String []arr=str.split(" ");
		for(int i =0;i<arr.length;i++) {
			if(isPalindrome(arr[i])) {
				count++;
				
			}
		}
		System.out.println(count);
		return count;
	}
	
	
	private static boolean isPalindrome(String input) {
	    StringBuilder plain = new StringBuilder(input);
	    StringBuilder reverse = plain.reverse();
	    return (reverse.toString()).equals(input);
	}
		
		
		
	
	
	public static void main (String[]args) {
		//findAllPalindromesUsingBruteForceApproach("this is a racecar");
		countPal("this is a racecar");
		
	}

}
