import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font subtitleFont;
	public Timer frameDraw;
	public Paddle paddle = new Paddle(20, 220, 20, 80);
	Ball ball = new Ball();
	OpponentPaddle op = new OpponentPaddle(ball);
	public GamePanel() {
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();

	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
			ball.move();
			op.move();
		} else if (currentState == END) {
			drawEndState(g);

		}
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("PONG", 320, 200);
		g.drawString("Press ENTER to start", 155, 250);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);

		paddle.draw(g);
		ball.draw(g);
		op.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}

		repaint();
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;

			}

			else {
				currentState++;

			}
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			paddle.up();

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			paddle.down();

		}
		

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
