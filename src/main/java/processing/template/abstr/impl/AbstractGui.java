package processing.template.abstr.impl;

import java.awt.Dimension;
import java.awt.Toolkit;

import processing.template.IGui;

public abstract class AbstractGui extends GuiTemplate implements IGui{ 
    /**
     * Position of mouse when button has been pressed
     */

    private int[] pressedPos = new int[2];

    /**
     * @return the pressedPos
     */
    public int[] getPressedPos() {
        return pressedPos;
    }

    /**
     * @param pressedPos the pressedPos to set
     */
    public void setPressedPos(int[] pressedPos) {
        this.pressedPos = pressedPos;
    }

    /**
     * @return the framesKeyPressed
     */
    public int getFramesKeyPressed() {
        return this.framesKeyPressed;
    }

    /**
     * @param framesKeyPressed the framesKeyPressed to set
     */
    public void setFramesKeyPressed(int framesKeyPressed) {
        this.framesKeyPressed = framesKeyPressed;
    }

    /**
     * @return the framesPressed
     */
    public int getFramesPressed() {
        return this.framesPressed;
    }

    /**
     * @param framesPressed the framesPressed to set
     */
    public void setFramesPressed(int framesPressed) {
        this.framesPressed = framesPressed;
    }

    /**
     * @return the screenSize
     */
    public Dimension getScreenSize() {
        return this.screenSize;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return this.Height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return this.Width;
    }

    /**
     * Counts frames pressed while key button is pressed
     */
    protected int framesKeyPressed;

    /**
     * Counts frames pressed while mouse button is pressed
     */
    protected int framesPressed;

    /**
     * Creates the final instance Dimension-object screenSize
     */
    public final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Height of the screen (not just the sketch)
     */

    public final int Height = (int) screenSize.getHeight();

    /**
     * Width of the screen (not just the sketch)
     */
    public final int Width = (int) screenSize.getWidth();

}
