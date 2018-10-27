package uebung4;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

@SuppressWarnings("serial")
public class BouncyBall extends GraphicsProgram {
	
	final int SQUARE_SIZE = 300;
	final int BALL_SIZE = 40;
	final int PAUSE_TIME = 5;
	
	public void run() {
		GRect square = new GRect(
				(getWidth() / 2) - (SQUARE_SIZE / 2),
				(getHeight() / 2) - (SQUARE_SIZE / 2),
				SQUARE_SIZE, SQUARE_SIZE
		);
		
		GOval ball = new GOval(
				(getWidth() / 2) - (BALL_SIZE / 2), 
				(getHeight() / 2) - (BALL_SIZE / 2), 
				BALL_SIZE, BALL_SIZE
		);
		ball.setFillColor(Color.RED);
		ball.setFilled(true);
		
		add(square);
		add(ball);
		
		double dx = 0.4;
		double dy = 1.2;
		
		while (true) {
			if (ball.getX() - square.getX()< 0.01 || (square.getX() + SQUARE_SIZE) - (ball.getX() + BALL_SIZE) < 0.01) {
				dx *= -1.0;
			}
			if (ball.getY() - square.getY() < 0.01 || (square.getY() + SQUARE_SIZE) - (ball.getY() + BALL_SIZE) < 0.01) {
				dy *= -1.0;
			}
			
			ball.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
}
