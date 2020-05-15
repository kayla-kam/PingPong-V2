package PongV2;

import java.awt.Graphics;
import java.awt.Color;

public class HumanPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
	int player, x;
	
	public HumanPaddle(int player) {
		upAccel = false; downAccel = false;
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
		if(upAccel) {
			yVel -= 2;
		}
		else if(downAccel) {
			yVel += 2;
		}
		else if(!upAccel && !downAccel) {
			yVel *= GRAVITY;
		}
		if(yVel >= 5) {
			yVel = 5;
		}
		else if(yVel <= -5) {
			yVel = -5;
		}
		y += yVel;
		
		if( y < 0) {
			y = 0;
		}
		//500 - 80 = 420
		if(y > 420) {
			y = 420;
		}
	}

	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	public void setDownAccel(boolean input) {
		downAccel = input;
	}
	public int getY() {
		// TODO Auto-generated method stub
		return (int) y;
	}

}
