import java.awt.*;
import java.awt.Event;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ball extends GameObject{

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	

	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } 
	        catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	
	}

	public Ball(int x1, int y1, int width1, int height1) {
		
		super(x1,y1,width1,height1);
		
		
	}
	
	public int speed = 1;
	public boolean isActive = true;
	
	
	
	
}

