package uebung5;

import acm.program.ConsoleProgram;

@SuppressWarnings("serial")
public class Fibonacci extends ConsoleProgram {
	public void run() {
		int x = 0;
		int y = 1;
		println("F0 = " + x);
		println("F1 = " + y);
		
		for (int i = 2; i < 20; i++) {
			int z = x + y;
			println("F" + i + " = " + z);
			x = y;
			y = z;
		}
	}
}
