package com.seleniumExamples2024;

public class LongestSubStringFinder {

	public static void main(String[] args) {
		String input = "abcbcabcda";
		String longestSubstring = findLongestSubstring(input);
		System.out.println("Longest Substring: " + longestSubstring);
	}

	public static String findLongestSubstring(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		String longestSubstring = "";
		int maxLength = 0;

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String currentSubstring = input.substring(i, j);
				if (isPalindrome(currentSubstring) && currentSubstring.length() > maxLength) 
				{
					maxLength = currentSubstring.length();
					longestSubstring = currentSubstring;
				}
			}
		}

		return longestSubstring;
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
