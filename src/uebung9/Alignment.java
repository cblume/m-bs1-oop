package uebung9;

import acm.program.ConsoleProgram;

@SuppressWarnings("serial")
public class Alignment extends ConsoleProgram {	
	public void run() {
		String longSequence = "TAACGGTACGTC";
		String shortSequence = "TTGCC";
				
		println("Check if the sequence '" + shortSequence + "' complementarily matches the sequence '" + longSequence + "'...");
		
		int match = findFirstMatchingPosition(shortSequence, longSequence);
		
		println("The sequences do" + (match > -1 ? " match, starting at position " + match + "." : " not match at any position."));
	}
	
	public int findFirstMatchingPosition(String shortDNA, String longDNA) {
		String needle = shortDNA.toUpperCase();
		String haystack = longDNA.toUpperCase();
		
		int offset = needle.length();
		int upperBoundary = haystack.length();
		
		for (int i = 0; i <= upperBoundary - offset; i++) {
			boolean matchedComplement = false;
			for(int j = 0; j < offset; j++) {
				switch(needle.charAt(j)) {
					case 'A':
						matchedComplement = haystack.charAt(i + j) == 'T';
						break;
					case 'T':
						matchedComplement = haystack.charAt(i + j) == 'A';
						break;
					case 'C':
						matchedComplement = haystack.charAt(i + j) == 'G';
						break;
					case 'G':
						matchedComplement = haystack.charAt(i + j) == 'C';
						break;
				}
				if (!matchedComplement) {
					break;
				}
			}
			if (matchedComplement) {
				return i;
			}
		}
		return -1;
	}
}
