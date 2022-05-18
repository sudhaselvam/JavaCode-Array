package dailypractice;

public class SubString {
	
	public static int findsubString(String str) {
		String re="";
		int count = 0 ;
		for(int i =0;i<str.length();i++) {
			for(int j =i+1;j<str.length();j++) {
				re=str.substring(i,j);
				if(re.length()>=2) {
					StringBuilder s = new StringBuilder(re);
					s.reverse();
					if(s.toString().compareTo(re)==0) {
						count++;
					}
				}
				
			}
		}
		System.out.println(count);
		return count;
	}
	
	

	public static void main(String[] args) {
		findsubString("racecar");
		

	}

}
