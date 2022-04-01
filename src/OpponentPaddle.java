import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class OpponentPaddle {
	double x, y;
	public static Rectangle collisionBox = new Rectangle();
	public OpponentPaddle() {

		x = 760;
		y = 220;
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int) x - 10, (int) y - 40, 20, 80);
		collisionBox.setBounds((int)x,(int) y, 50, 80);
	}

	public void update() {
		if (y > GamePanel.ball.getY()) {

			if (y <= 0) {
				y = 0;
			} else {
				y -= 7;
			}
		}
		if (y < GamePanel.ball.getY()) {
			if (y >= 560) {
				y = 560;
			} else {
				y += 7;
			}

		}

	}

}
