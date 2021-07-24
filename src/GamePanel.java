import java.awt.*;
import java.awt.Event;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.Timer;

import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

	public Timer frameDraw;
	
	
	static final int GAME_WIDTH = 1000;
	static final int GAME_HEIGHT = (555);
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
	static final int BALL_DIAMETER = 20;
	static final int PADDLE_WIDTH = 25;
	static final int PADDLE_HEIGHT = 100;
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Points points;
	

	public GamePanel() {
		newPaddle();
		newBall();
		points = new Points(GAME_WIDTH, GAME_HEIGHT);
		this.setFocusable(true);
		this.setPreferredSize(SCREEN_SIZE);
		frameDraw = new Timer();

		gameThread = new Thread(this);
		gameThread.start();

	}

	public void newBall() {

	}

	public void newPaddle() {

	}

	public void paint(Graphics g) {

		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image, 0, 0, this);

	}

	public void draw(Graphics g) {

	}

	public void move() {

	}

	public void checkCollision() {

	}

	public void run() {

	}

	public class ActionListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

		}

		public void keyReleased(KeyEvent e) {

		}

	}

}
