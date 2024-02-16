package com.seleniumExamples2024;

public class SubStringFinder2 {
	static String currentSubstring = " ";
	static String longestSubstring = "";
	public static void main(String[] args) {
		String input = "abcdef";
		int maxLength = 0;
		
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				currentSubstring = input.substring(i, j);
				System.out.println(currentSubstring);
				if (currentSubstring.length() > maxLength) 
				{
					maxLength = currentSubstring.length();
					longestSubstring = currentSubstring;
				}
			}
			System.out.println("longestSubstring  " + longestSubstring);
		}

	}
}
