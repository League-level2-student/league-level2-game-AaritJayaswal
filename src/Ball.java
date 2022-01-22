import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	double xVelocity;
	double yVelocity;
	double x;
	double y;

	public Ball() {

		x = 350;
		y = 250;
		xVelocity = -2;
		yVelocity = 1;

	}

	public void draw(Graphics g) {

		g.setColor(Color.white);
		g.fillOval((int) x - 10, (int) y - 10, 20, 20);

	}

	public void move() {

		x += xVelocity;

		y += yVelocity;

	}

	public int getX() {

		return (int) x;

	}

	public int getY() {

		return (int) y;

	}

}
