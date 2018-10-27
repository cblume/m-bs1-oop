package uebung3;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

@SuppressWarnings("serial")
public class Checkers extends GraphicsProgram {
	
	final int CANVAS_WIDTH = 300;
	final int CANAVS_HEIGHT = 300;
	final int N_ROWS = 8;
	final int N_COLS = 8;
	final int PIECE_OFFSET = 4;
	
	public void run() {
		setSize(CANVAS_WIDTH, CANAVS_HEIGHT);
		double squareSize = getHeight() / N_ROWS;
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLS; j++) {
				double x = j * squareSize;
				double y = i * squareSize;
				GRect square = new GRect(x, y, squareSize, squareSize);
				square.setFillColor(Color.GRAY);
				add(square);
				if ((i + j) % 2 != 0) {
					square.setFilled(true);
					if (i < 3 || i > 4) {
						GOval checkersPiece = new GOval(
								x + (PIECE_OFFSET / 2), 
								y + (PIECE_OFFSET / 2), 
								squareSize - PIECE_OFFSET , 
								squareSize - PIECE_OFFSET
						);
						checkersPiece.setFillColor(i < 3 ? Color.RED : Color.BLACK);
						checkersPiece.setFilled(true);
						add(checkersPiece);
					}
				}
				
			}
		}
		
	}
}
