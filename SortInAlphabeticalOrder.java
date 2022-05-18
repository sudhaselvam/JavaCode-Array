package dailypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortInAlphabeticalOrder {

	
	 public static ArrayList < String > sortArrStr(int n, ArrayList < String > arrStr, char c) {
	        
	        // HashMap for storing the order.
	        final Map < Character, Integer > hmap = new HashMap < > ();

	        // Create a string according to the new alphabetical order.
	        String newOrder = "";
	        int value = c - 'a';

	        // Add the character starting from the given character c to z and then a to (c-1).
	        for (int i = 0; i < 26; i++) {
	            newOrder += ((char)((value + i) % 26 + 'a'));
	        }

	        // Store the order for each character.
	        for (int i = 0; i < 26; i++) {
	            hmap.put(newOrder.charAt(i), i);
	        }

	        // Call the sort function.
	        Collections.sort(arrStr, new Comparator < String > () {
	            @Override
	            public int compare(String x, String y) {
	                for (int i = 0; i < Math.min(x.length(), y.length()); i++) {
	                    if (x.charAt(i) == y.charAt(i)) {
	                        continue;
	                    } else {
	                        return hmap.get(x.charAt(i)) - hmap.get(y.charAt(i));
	                    }
	                }
	                return x.length() - y.length();
	            }
	        });

	        return arrStr;

	    }
}
