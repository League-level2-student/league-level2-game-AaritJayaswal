import java.awt.Color;
import java.awt.Graphics;

public class ComputerPaddle implements Paddle {

	double y;
	double yVelocity;
	final double GRAVITY = 0.85;
	boolean upAccelerate;
	boolean downAccelerate;
	int player;
	int x;
	Ball b1;

	public ComputerPaddle(int player, Ball b) {
		upAccelerate = false;
		downAccelerate = false;
		b1 = b;
		yVelocity = 0;

		y = 210;

		if (player == 1) {
			x = 20;
		} else {
			x = 660;

		}

	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int) y, 20, 80);
	}

	public void move() {
		y = b1.getY() - 40;

		if (y < 0) {
			y = 0;
		}
		if (y > 420) {
			y = 420;
		}

	}

	public void setUpAccelerate(boolean input) {

		upAccelerate = input;

	}

	public void setDownAccelerate(boolean input) {

		downAccelerate = input;
	}

	public int getY() {

		return (int) y;

	}

}
