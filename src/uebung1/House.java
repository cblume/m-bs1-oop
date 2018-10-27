package uebung1;

import acm.graphics.*;
import acm.program.GraphicsProgram;

@SuppressWarnings("serial")
public class House extends GraphicsProgram {
	public void run() {
		int canvasWidth = 270;
		int canvasHeight = 200;
		int houseOriginX = 30;
		int houseOriginY = 80;
		int houseWidth = 200;
		int houseHeight = 80;
		int middleOfTheHouse = houseOriginX + (houseWidth / 2);		// half the width starting at `houseOriginX` 
		int roofPoint = 20;
		int gapBetweenSideOfTheHouseAndWindow = 20;
		int windowWidth = 40;
		int windowHeight = 40;
		int doorWidth = 30;
		int doorHeight = 50;
		int doorHandleWidth = 5;
		int doorHandleHeight = 5;
				
		// Set window size
		this.setSize(canvasWidth, canvasHeight);
		
		// Draw the house shape
		add(new GRect(houseOriginX, houseOriginY, houseWidth, houseHeight));
		
		// Draw the roof
		add(new GLine(houseOriginX, houseOriginY, middleOfTheHouse, roofPoint));
		add(new GLine(middleOfTheHouse, roofPoint, houseOriginX + houseWidth, houseHeight));
		
		// Draw the left window
		add(new GRect(
				houseOriginX + gapBetweenSideOfTheHouseAndWindow, 
				houseOriginY + gapBetweenSideOfTheHouseAndWindow, 
				windowWidth, windowHeight)
		);
		
		// Draw the right window
		add(new GRect(
				houseOriginX + houseWidth - gapBetweenSideOfTheHouseAndWindow - windowWidth, 
				houseOriginY + gapBetweenSideOfTheHouseAndWindow, 
				windowWidth, windowHeight)
		);
		
		// Draw the door
		add(new GRect(middleOfTheHouse - (doorWidth / 2), houseOriginY + 30, doorWidth, doorHeight));
		
		// Draw the door handle
		add(new GRect(
				middleOfTheHouse + (doorWidth / 2) - 10, 
				houseOriginY + 30 + (doorHeight / 2),
				doorHandleWidth, doorHandleHeight)
		); 
	}
}
