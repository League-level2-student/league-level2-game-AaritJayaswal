import java.awt.Dimension;

import javax.swing.*;

public class Pong {

	public JFrame frame;
	public GamePanel panel;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 555;

	public Pong() {

		frame = new JFrame();
		panel = new GamePanel();

	}

	public static void main(String[] args) {

		Pong pong = new Pong();
		pong.setup();

	}

	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
	}

}
