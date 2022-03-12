import javax.swing.JFrame;

public class Pong {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	GamePanel panel = new GamePanel();
	JFrame frame = new JFrame();

	public void setup() {
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Pong pong = new Pong();
		pong.setup();

	}
}
