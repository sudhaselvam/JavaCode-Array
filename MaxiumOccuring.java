package dailypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxiumOccuring {
	static final String TEST_CASE_1 = "abbcc";


    public static void main(String[] args) {
    	MaxiumOccuring test = new MaxiumOccuring();
        List<Character> result = test.maximumOccurringChars(TEST_CASE_1, true);
        System.out.println(result);
        test.countOccurrence("aaabbbcde");
    }
    
    
    
    public List<Character> countOccurrence(String str){
       // int length = str.length();
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
       // char ch1 =' ';
        List<Character>cha=new ArrayList<Character>();

        for (char ch : arr) {
            if(ch == ' '){
                continue;
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> set = map.keySet();
        

        for (char c : set) {
            if (max == 0 || map.get(c) > max) {
            	
            	  max = map.get(c);
            	  System.out.println(max);
            }
        }

        for (Character o : map.keySet()) {
            if (map.get(o).equals(max)) {
                System.out.println(o);
                cha.add(o);
                
            }
        }
        System.out.println("");
        System.out.println(cha.toString());
		return cha;
    }
    
//    @Test
//    public void testcase() {
//    	Assert.assertEquals(countOccurrence("aabbc"), "[a, b]");
//    }


    public List<Character> maximumOccurringChars(String str) {
        return maximumOccurringChars(str, false);
    }

    // set skipSpaces true if you want to skip spaces
    public List<Character> maximumOccurringChars(String str, Boolean skipSpaces) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> occurrences = new ArrayList<>();
        int maxOccurring = 0;

        // creates map of all characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (skipSpaces && ch == ' ')      // skips spaces if needed
                continue;

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch);         // saves max occurring

}
        }
    

    // finds all characters with maxOccurring and adds it to occurrences List
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == maxOccurring) {
            occurrences.add(entry.getKey());
        }
    }

    return occurrences;
}
    
    @Test
    public void tes() {
    	Assert.assertEquals(maximumOccurringChars("aabbc",false), "[a, b]");
    }
    @Test
    public void testcae() {
    	
    }
}
