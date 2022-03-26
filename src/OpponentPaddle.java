import java.awt.Color;
import java.awt.Graphics;

public class OpponentPaddle {
	double xVel, yVel, x, y;
	Ball ball;

	public OpponentPaddle(Ball ball) {

		x = 740;
		y = 220;
		xVel = 5;

	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int) x, (int) y, 20, 80);

	}

	public void move() {
		y = ball.getY() - 40;
		if (y < 0) {
			y = 0;
		}
		if (y > 520) {
			y = 520;
		}

	}

	public int getY() {

		return (int) y;
	}

}
