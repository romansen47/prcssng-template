package processing.template;

import java.awt.Dimension;

import processing.template.abstr.IGuiTemplate;

public interface IGui extends IGuiTemplate{

    /**
     * @return the pressedPos
     */
    public int[] getPressedPos() ;

    /**
     * @param pressedPos the pressedPos to set
     */
    public void setPressedPos(int[] pressedPos);

    /**
     * @return the framesKeyPressed
     */
     int getFramesKeyPressed();

    /**
     * @param framesKeyPressed the framesKeyPressed to set
     */
     void setFramesKeyPressed(int framesKeyPressed);

    /**
     * @return the framesPressed
     */
    int getFramesPressed();

    /**
     * @param framesPressed the framesPressed to set
     */
     void setFramesPressed(int framesPressed);

    /**
     * @return the screenSize
     */
     Dimension getScreenSize();

    /**
     * @return the height
     */
     int getHeight();

    /**
     * @return the width
     */
     int getWidth();

    
}
