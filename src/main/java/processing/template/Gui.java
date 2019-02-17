package processing.template;

import java.awt.Dimension;
import java.awt.Toolkit;

import processing.core.PApplet;
import processing.event.MouseEvent;

/**
 * @author ro
 *
 */

/**
 * Concrete Gui-class
 */

public class Gui extends GuiTemplate {

    /**
     * Creates the final instance Dimension-object screenSize
     */

    public final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Width of the screen (not just the sketch)
     */

    public final int Width = (int) this.screenSize.getWidth();

    /**
     * Height of the screen (not just the sketch)
     */

    public final int Height = (int) this.screenSize.getHeight();

    /*
     * Overrides parent abstract run function
     */

    @Override
    public boolean run(final String mainclass) {
	PApplet.main(new String[] { "--present", mainclass });
	return true;
    }

    /*
     * Overrides parent abstract settings function
     */

    @Override
    public void settings() {
	this.fullScreen();
	// size(x,y);
    }

    /*
     * Overrides parent abstract setup function
     */

    @Override
    public void setup() {
	this.frameRate(10);
	this.background(0);
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

    public static int[] pressedPos = new int[2];

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
	if (this.mousePressed) {
	    if (this.framesPressed == 0) {
		this.pressedPos[0] = this.mouseY;
		this.pressedPos[1] = this.mouseX;
	    }
	    this.framesPressed += 1;
	    return 0;
	} else {
	    if (this.framesPressed == 0) {
		return 0;
	    }
	    if (this.framesPressed < 0.5 * this.frameRate) {
		this.framesPressed = 0;
		return 1;
	    }
	    this.framesPressed = 0;
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
     * 	returns 0 if nothing clicked or mouse still pressed returns 1 if
     *         mouse button clicked and held shorter than 20% of framerate returns 2
     *         if mouse button clicked and held longer than 20% of framerate
     */

    public int pressed() {
	if (this.keyPressed) {
	    this.framesKeyPressed += 1;
	    return 0;
	} else {
	    if (this.framesKeyPressed == 0) {
		return 0;
	    }
	    if (this.framesKeyPressed < 0.2 * this.frameRate) {
		this.framesKeyPressed = 0;
		return 1;
	    }
	    this.framesKeyPressed = 0;
	    return 2;
	}
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
	 * e = 1.0 for "UP" e 0 -1.0 for "DOWN"
	 */
    }
}
