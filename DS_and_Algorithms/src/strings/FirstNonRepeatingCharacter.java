package strings;

import java.util.HashMap;
//O(n)
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s = "aaabcdcceeef";
		char c = firstNonRepeatingCharacterMethod(s);
		System.out.println(c);
	}

	private static char firstNonRepeatingCharacterMethod(String s) {
		HashMap<Character, Integer> char_count = new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++) {
			if(char_count.containsKey(s.charAt(i))){
				char_count.put(s.charAt(i), char_count.get(s.charAt(i))+1);
			}else {
				char_count.put(s.charAt(i), 1);
			}
		}
		System.out.println(char_count);
		for(int i=0; i<s.length();i++) {
			if(char_count.get(s.charAt(i)) ==1)
				return s.charAt(i);
		}
		return '-';
	}
}
