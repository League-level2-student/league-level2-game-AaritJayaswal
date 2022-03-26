import java.awt.Color;
import java.awt.Graphics;

public class OpponentPaddle {
	double x, y;

	public OpponentPaddle() {

		x = 640;
		y = 220;

	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int) x - 10, (int) y - 40, 20, 80);

	}

	public void move() {

		y = ball.getY();

	}

}
