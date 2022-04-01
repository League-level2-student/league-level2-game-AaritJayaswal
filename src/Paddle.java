import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Paddle extends GameObject {

	public int speed = 7;
	public static Rectangle collisionBox = new Rectangle();
	public Paddle(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
	}

	void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		collisionBox.setBounds((int)x,(int) y, width - 10, height);
	}

	public void up() {

		if (y <= 0) {
			y = 0;
		} else {
			y -= speed;
		}

	}

	public void down() {
		if (y >= 520) {
			y = 520;
		} else {
			y += speed;
		}
	}

}
