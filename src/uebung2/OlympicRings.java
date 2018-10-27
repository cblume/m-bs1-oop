package uebung2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

@SuppressWarnings("serial")
public class OlympicRings extends GraphicsProgram {
	public void run() {		
		int canvasWidth = 400;
		int canvasHeight = 200;
		int halfWidthOfCanvas = canvasWidth / 2;
		int upperBoundry = 30;
		int ringSize = 80;
		int gapBetweenRings = 6;
				
		// Set window size
		this.setSize(canvasWidth, canvasHeight);
		
		// Instantiate the blue ring
		GOval blueRing = new GOval(halfWidthOfCanvas - (ringSize / 2) - gapBetweenRings - ringSize, upperBoundry, ringSize, ringSize);
		blueRing.setColor(Color.BLUE);
		
		// Instantiate the black ring
		GOval blackRing = new GOval(halfWidthOfCanvas - (ringSize / 2), upperBoundry, ringSize, ringSize);
		blackRing.setColor(Color.BLACK);
		
		// Instantiate the red ring
		GOval redRing = new GOval(halfWidthOfCanvas + (ringSize / 2) + gapBetweenRings, upperBoundry, ringSize, ringSize);
		redRing.setColor(Color.RED);
		
		// Instantiate the yellow ring
		GOval yellowRing = new GOval(halfWidthOfCanvas - ringSize - (gapBetweenRings / 2), upperBoundry * 2.4, ringSize, ringSize);
		yellowRing.setColor(Color.YELLOW);
		
		// Instantiate the green ring
		GOval greenRing = new GOval(halfWidthOfCanvas + (gapBetweenRings / 2), upperBoundry * 2.4, ringSize, ringSize);
		greenRing.setColor(Color.GREEN);				

		// Add the rings to the canvas in the correct order
		add(blueRing);
		add(yellowRing);
		add(blackRing);
		add(greenRing);
		add(redRing);
	}
}
