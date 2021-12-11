import javax.swing.JFrame;

public class Pong {

	public Pong(String title, Game game) {
		
	JFrame frame = new JFrame();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.add(game);
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	
	game.start();
	
	
	}
}
