
import javax.swing.JFrame;
/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame extends JFrame
{
    private static final int FRAME_WIDTH = 300; 
    private static final int FRAME_HEIGHT = 400;
    

    /**
     * Default constructor for objects of class Frame
     */
    public Frame()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
