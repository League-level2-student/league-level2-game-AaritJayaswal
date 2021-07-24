import java.awt.*;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {

	public int speed = 10;
	public boolean isActive = true;

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;

	public Paddle(int x1, int y1, int width1, int height1) {

		super(x1, y1, width1, height1);

	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		
		
	}

}