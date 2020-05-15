package PongV2;

import java.awt.Graphics;
import java.awt.Color;

public class AIPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
	int player, x;
	Ball b1;
	
	public AIPaddle(int player, Ball b) {
		upAccel = false; downAccel = false;
		b1 = b;
		y = 210; yVel = 0;
		if(player == 1) {
			x = 20;
		}
		else {
			x = 660;
		}
	}
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(x, (int) y, 20, 80);
		
	}

	
	public void move() {
		y = b1.getY() - 40; 
		
		if( y < 0) {
			y = 0;
		}
		//500 - 80 = 420
		if(y > 420) {
			y = 420;
		}
	}

	public int getY() {

		return (int) y;
	}

}

//make an unbeatable AI Paddle that tracks the y vale of the ball.
//takes where the ball currently is and move the AI paddle up half way so the paddle is centered on the Y value of the ball.