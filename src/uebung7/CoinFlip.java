package uebung7;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

@SuppressWarnings("serial")
public class CoinFlip extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {		
		int heads = 0;
		int tails = 0;
		int counter = 0;
		
		while (heads < 3 && tails < 3) {
			readLine("> Press Enter to flip a coin.");
			
			counter += 1;
			String flip = rgen.nextBoolean() ? "heads" : "tails"; 
			println("You flipped " + flip.toUpperCase());
			
			if (flip.equals("heads")) {
				heads += 1;
				tails = 0;
			}
			else {
				tails += 1;
				heads = 0;
			}
		}
		
		println("Congratulations, you won the game after " + counter + " coin flips!");
	}
}
