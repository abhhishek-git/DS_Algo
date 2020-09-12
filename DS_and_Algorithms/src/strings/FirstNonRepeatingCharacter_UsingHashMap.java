package strings;

import java.util.HashMap;
//O(n)
public class FirstNonRepeatingCharacter_UsingHashMap {
	public static void main(String[] args) {
		String s = "aaabcdcceeef";
		char c = firstNonRepeatingCharacterMethod(s);
		System.out.println(c);
	}

	private static char firstNonRepeatingCharacterMethod(String s) {
		HashMap<Character, Integer> char_count = new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(char_count.containsKey(c)){
				char_count.put(c, char_count.get(c)+1);
			}else {
				char_count.put(c, 1);
			}
		}
		System.out.println(char_count);
		for(int i=0; i<s.length();i++) {
			char c= s.charAt(i);
			if(char_count.get(c) ==1)
				return c;
		}
		return '-';
	}
}
