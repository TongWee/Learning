package array;

import java.util.Stack;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s == null && t == null)
			return true;
		else if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		int[] arr_s;
		int[] arr_t;
		arr_s = new int[26];
		arr_t = new int[26];
		char[] chr_s = s.toCharArray();
		char[] chr_t = t.toCharArray();
		for (int i = 0; i < chr_s.length; i++) {
			int temp = 0;
			temp = (int) chr_s[i];
			arr_s[(temp - 97) % 26]++;
			temp = (int) chr_t[i];
			arr_t[(temp - 97) % 26]++;
		}
		for (int i = 0; i < arr_s.length; i++) {
			if (arr_s[i] != arr_t[i])
				return false;
		}
		return true;
	}

	public boolean wordPattern(String pattern, String str) {
		int length = pattern.length();
		char[] chr_ptn = pattern.toCharArray();
		String[] chr_str = str.split(" ");
		if (chr_ptn.length != chr_str.length)
			return false;
		for (int i = 0; i < length - 1; i++) {
			boolean pat_bool = chr_ptn[i] == chr_ptn[i + 1];
			boolean str_bool = chr_str[i].equals(chr_str[i + 1]);
			if (pat_bool != str_bool)
				return false;
		}
		return true;
	}

	public boolean isValid(String s) {
		Stack<Character> sk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				sk.push('(');
			}
			if (s.charAt(i) == ')') {
				if (!sk.isEmpty() && sk.pop() == '(')
					continue;
				else
					return false;
			}
			if (s.charAt(i) == '[') {
				sk.push('[');
			}
			if (s.charAt(i) == ']') {
				if (!sk.isEmpty() && sk.pop() == '[')
					continue;
				else
					return false;
			}
		}
		if (sk.isEmpty())
			return true;
		else
			return false;
	}
}