package dailypractice;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicate {
	public static String smallestSubsequence(String s) {
		Stack<Integer> stack = new Stack<>();
		int[] lastIndex = new int[26];
		boolean[] visited = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			lastIndex[s.charAt(i) - 'a'] = i;
		}
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (visited[index])
				continue;
			while (!stack.isEmpty() && stack.peek() > index && i < lastIndex[stack.peek()]) {
				visited[stack.pop()] = false;
			}
			stack.push(index);
			visited[index] = true;
		}
		StringBuilder sb = new StringBuilder();
		for (int i : stack) {
			sb.append((char) ('a' + i));
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
    @Test
	public  void distinct() {
    	
    	String str="bcabb";
		Assert.assertEquals(smallestSubsequence(str),"bca");
		
	}

}
