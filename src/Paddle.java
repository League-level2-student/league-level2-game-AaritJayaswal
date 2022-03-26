import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends GameObject {
	
	public int speed = 7;

	public Paddle(int x1, int y1, int width1, int height1) {
		super(x1, y1, width1, height1);
	}

	void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);

	}
	
	 public void up() {
		 
		 y-=5;
	 }
	 public void down() {
		 y+=5;
	 }
	
	
}
