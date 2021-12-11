
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Timer;

public class Game extends Canvas implements Runnable {

	
	/**
	 * 
	 */

	private static final long serialVersionUID = -4647718764425224474L;

	public static final int WIDTH = 1000;
	public static final int HEIGHT = WIDTH*9/16;
	
	public boolean running = false;
	private Thread gameThread;
	
	private Ball ball;
	private Paddle paddle;
	private Paddle paddle2;
	public Timer frameDraw;
	
	public Game()  {
		
		canvasSetup();
		initialize();
		new Pong("Pong", this);
		
	}

	private void initialize() {
		//ball
		
		
		//paddles
	}

	private void canvasSetup() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		this.setBackground(Color.black);
	}

	@Override
	public void run() {
		
	
		
		
	}

	public void start() {
	gameThread = new Thread(this);
	gameThread.start();
	running = true;
		
	}
	
	public void stop() {
		try {
			gameThread.join();
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new Game();
	}
	
}
