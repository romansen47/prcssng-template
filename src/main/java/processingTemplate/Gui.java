package processingTemplate;

import java.awt.Dimension;
import java.awt.Toolkit;

import processing.event.MouseEvent;


/**
 * @author ro 
 *
 */

/**
 * Concrete Gui-class
 */

public class Gui extends GuiTemplate{
	
	/**
	 *  Creates the final instance Dimension-object screenSize
	 */
	
	public final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 *  Width of the screen (not just the sketch)
	 */
	
	public final int Width=(int)(screenSize.getWidth());
	
	/**
	 * Height of the screen (not just the sketch)
	 */
	
	public final int Height=(int)(screenSize.getHeight());


	/*
	 * Overrides parent abstract run function
	 */
	
	@Override
	public boolean run(String mainclass) {
		main(new String[] { "--present", mainclass});
		return true;
	}

	/*
	 * Overrides parent abstract settings function
	 */
	
	@Override
	public void settings(){ 
		fullScreen();
		//size(x,y);
	} 
	
	/*
	 * Overrides parent abstract setup function
	 */
	
	
	@Override
	public void setup(){ 
		frameRate(10);
		background(0);
	} 

	/*
	 * Overrides parent abstract draw function
	 */
	
	@Override
	public void draw() {
	}
	
	/**
	 * Counts frames pressed while mouse button is pressed
	 */

	protected int framesPressed;
	
	/**
	 * Position of mouse when button has been pressed
	 */
	
	public int[] pressedPos=new int[2];
	
	/**
	 * implementation of clicked() function:  
	 *
	 * @return 
	 * 
	 * returns 0 if nothing clicked or mouse still pressed
	 * returns 1 if mouse button clicked and held shorter than 20% of framerate 
	 * returns 2 if mouse button clicked and held longer than 20% of framerate
	 */
	

	public int clicked() {
		if (mousePressed) {
			if (framesPressed==0) {
				pressedPos[0]=mouseY;
				pressedPos[1]=mouseX;
			}
			framesPressed+=1;
			return 0;
		}
		else {
			if (framesPressed==0) {
				return 0;
			}
			if (framesPressed<0.5*frameRate) {
				framesPressed=0;
				return 1;
			}
			framesPressed=0;
			return 2;
		}
	}

	/**
	 * Counts frames pressed while key button is pressed
	 */
	protected int framesKeyPressed;
	
	/**
	 * implementation of clicked() function:  
	 *
	 * @return 
	 * 
	 * returns 0 if nothing clicked or mouse still pressed
	 * returns 1 if mouse button clicked and held shorter than 20% of framerate 
	 * returns 2 if mouse button clicked and held longer than 20% of framerate
	 */
	
	public int pressed() {
		if (keyPressed) {
			framesKeyPressed+=1;
			return 0;
		}
		else {
			if (framesKeyPressed==0) {
				return 0;
			}
			if (framesKeyPressed<0.2*frameRate) {
				framesKeyPressed=0;
				return 1;
			}
			framesKeyPressed=0;
			return 2;
		}
	}

	/**
	 * @param event: is 1.0 or -1.0 depending on direction of mouse wheel event (up or down)
	 * 
	 */ 
	
	public void mouseWheel(MouseEvent event) {
		  	/**
		  	 * 
			 * float e = event.getCount();
			 * 
		  	 * e =  1.0 for "UP"
		  	 * e 0 -1.0 for "DOWN"
		  	 */
		}
}
