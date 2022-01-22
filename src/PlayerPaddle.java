import java.awt.Color;
import java.awt.Graphics;

public class PlayerPaddle implements Paddle {

	double y;
	double yVelocity;
	final double GRAVITY = 0.85;
	boolean upAccelerate;
	boolean downAccelerate;
	int player;
	int x;

	public PlayerPaddle(int player) {
		upAccelerate = false;
		downAccelerate = false;

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

		if (upAccelerate == true) {

			yVelocity -= 2;
		} else if (downAccelerate)

			yVelocity += 2;

		else if (!upAccelerate && !downAccelerate) {

			yVelocity *= GRAVITY;

		}

		if (yVelocity >= 5) {

			yVelocity = 5;
		} else if (yVelocity <= -5) {

			yVelocity = -5;
		}

		y += yVelocity;

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
