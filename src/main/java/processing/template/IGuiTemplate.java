/**
 *
 */
package processing.template;

/**
 * @author ro
 *
 */

public interface IGuiTemplate {

    /**
     * This method starts the gui
     */

    public abstract boolean run(String mainclass);

    /**
     * The settings function from processing framework
     */

    public abstract void settings();

    /**
     * The setup function from processing framework
     */

    public abstract void setup();

    /**
     * The draw function from processing framework
     */

    public abstract void draw();

}
