package processing.template.impl; 

import processing.core.PApplet;
import processing.event.MouseEvent;
import processing.template.abstr.impl.AbstractGui;

/**
 * @author ro
 *
 */

/**
 * Concrete Gui-class
 */

public class Gui extends AbstractGui  {
 

    /*
     * Overrides parent abstract draw function
     */
    @Override
    public void draw() {
	/**
	 * to be customized
	 */
    }

   
    /**
     * Overrides parent abstract run function
     */
    @Override
    public boolean run(final String mainclass) {
	PApplet.main(new String[] { "--present", mainclass });
	return true;
    }

    /**
     * Overrides parent abstract settings function
     */
    @Override
    public void settings() {
	this.fullScreen();
	/**
	 * Alternatively e.g. size(x,y);
	 */
    }

    /**
     * Overrides parent abstract setup function
     */
    @Override
    public void setup() {
	frameRate(10);
	this.background(0);
    }
    
    /**
     * @param event: is 1.0 or -1.0 depending on direction of mouse wheel event (up
     *        or down)
     *
     */
    @Override
    public void mouseWheel(final MouseEvent event) {
	/**
	 *
	 * float e = event.getCount();
	 *
	 * e = 1.0 for "UP" e = -1.0 for "DOWN"
	 */
    }

    /**
     * implementation of clicked() function:
     *
     * @return
     *
     * 	returns 0 if nothing clicked or mouse still pressed returns 1 if
     *         mouse button clicked and held shorter than 20% of framerate returns 2
     *         if mouse button clicked and held longer than 20% of framerate
     */

    public int pressed() {
	if (keyPressed) {
	    framesKeyPressed += 1;
	    return 0;
	} else {
	    if (framesKeyPressed == 0) {
		return 0;
	    }
	    if (framesKeyPressed < 0.2 * frameRate) {
		framesKeyPressed = 0;
		return 1;
	    }
	    framesKeyPressed = 0;
	    return 2;
	}
    }
    

    /**
     * implementation of clicked() function:
     *
     * @return
     *
     * 	returns 0 if nothing clicked or mouse still pressed returns 1 if
     *         mouse button clicked and held shorter than 20% of framerate returns 2
     *         if mouse button clicked and held longer than 20% of framerate
     */
    public int clicked() {
	if (mousePressed) {
	    if (getFramesPressed() == 0) {
		getPressedPos()[0] = mouseY;
		getPressedPos()[1] = mouseX;
	    }
	    framesPressed += 1;
	    return 0;
	} else {
	    if (framesPressed == 0) {
		return 0;
	    }
	    if (framesPressed < 0.5 * frameRate) {
		framesPressed = 0;
		return 1;
	    }
	    framesPressed = 0;
	    return 2;
	}
    }
    }
