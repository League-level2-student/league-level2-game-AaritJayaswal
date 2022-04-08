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
	Font howToFont;
	Font scoreFont;
	public Timer frameDraw;
	public Paddle paddle = new Paddle(20, 220, 20, 80);
	public static Ball ball = new Ball();
	public OpponentPaddle op = new OpponentPaddle();
	public boolean GameActive = true;
	int score = 0;

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
			ball.update();
			op.update();

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
		howToFont = new Font("Arial", Font.PLAIN,18);
		g.setFont(howToFont);
		g.drawString("How to play: Use the arrow keys to move your paddle up and down.",100,400);
		g.drawString("Earn points by using the paddle to deflect the ball to the opponent's side.",100,430);
		g.drawString("Gain 20 points without letting the ball pass your paddle to win!",100,460);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);

		paddle.draw(g);
		ball.draw(g);
		op.draw(g);
		scoreFont = new Font("Arial", Font.PLAIN, 24);
		g.setFont(scoreFont);
		g.setColor(Color.WHITE);
		g.drawString("Score: " + score, 650, 30);
		checkCollision();
	}

	void checkCollision() {
		if (paddle.collisionBox.intersects(ball.collisionBox)) {
			ball.xVel = -ball.xVel;
			score++;
		
		}
		if (op.collisionBox.intersects(ball.collisionBox)) {
			ball.xVel = -ball.xVel;
		}
	

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		if(score >= 20) {
			g.drawString(("YOU WIN!"), 250, 300);
		}
		else {
			g.drawString("GAME OVER", 250, 300);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (ball.GameActive == false) {
			currentState = END;

		}
		if(score >= 20) {
			currentState = END;
		}
		
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
			ball.GameActive=true;

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

			else if (currentState == MENU){
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
