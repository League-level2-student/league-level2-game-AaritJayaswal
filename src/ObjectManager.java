import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class ObjectManager implements ActionListener {

	
	public Paddle paddle;
	
	public ObjectManager(Paddle paddle1) {
		
		paddle = paddle1;
		
		
	}
	
	
	
	void draw(Graphics g) {
		
		paddle.draw(g);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
