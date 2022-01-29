import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pong extends Applet implements Runnable, KeyListener {
	final int WIDTH = 700;
	final int HEIGHT = 500;
	Thread thread;
	PlayerPaddle p1;
	Ball b1;
	ComputerPaddle p2;

	public void init() {

		this.resize(WIDTH, HEIGHT);

		this.addKeyListener(this);
		p1 = new PlayerPaddle(1);
		b1 = new Ball();
		p2 = new ComputerPaddle(2, b1);

		thread = new Thread(this);
		thread.start();

	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		if (b1.getX() < -10 || b1.getX() > 710) {
			g.setColor(Color.RED);
			g.drawString("You lose", 350, 250);
		} else {
			p1.draw(g);
			p2.draw(g);
			b1.draw(g);
			b1.checkPaddleCollision(p1, p2);
		}
	}

	public void update(Graphics g) {
		paint(g);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;;) {

			p1.move();
			p2.move();
			b1.move();
			repaint();

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			p1.setUpAccelerate(true);

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			p1.setDownAccelerate(true);

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			p1.setUpAccelerate(false);

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			p1.setDownAccelerate(false);

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
