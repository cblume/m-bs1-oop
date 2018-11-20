package uebung8;

import acm.program.ConsoleProgram;

@SuppressWarnings("serial")
public class Palindrome extends ConsoleProgram {
	
	public void run() {
		while(true) {
			String str = readLine("Please enter a string: ");
			println("The string '" + str + "' is" + (isPalindrome(str) ? " " : " not ") + "a palindrome.");
			println("=============");
		}
	}
	
	private String reverseString(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		return rev;
	}
	
	public boolean isPalindrome(String str) {
		return str.equalsIgnoreCase(reverseString(str));
	}
}
