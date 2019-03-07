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
     * The draw function from processing framework
     */

    void draw();

    /**
     * This method starts the gui
     * 
     * @param mainclass the fqn
     * @return true
     */

    boolean run(String mainclass);

    /**
     * The settings function from processing framework
     */

    void settings();

    /**
     * The setup function from processing framework
     */

    void setup();

}
