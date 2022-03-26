import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	double xVel, yVel, x, y;
	public static Rectangle collisionBox = new Rectangle();
	public Ball() {

		x = 350;
		y = 250;
		xVel = -2;
		yVel = 1;

	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval((int) x, (int) y, 20, 20);
		collisionBox.setBounds((int)x - 10,(int) y - 10, 20, 20);
	}

	public void update() {
		if (x > 790) {
			x = 790;
		} else {
			x += xVel;
		}
		if (x < 10) {
			x = 10;
		} else {
			x += xVel;

		}
		if (y > 590) {
			y = 590;
		} else {
			y += yVel;
		}
		if (y < 10) {
			y = 10;
		} else {
			y += yVel;
		}

	}

	public int getY() {

		return (int) y;
	}

}
