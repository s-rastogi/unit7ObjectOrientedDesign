

import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * The DrawingEditor class extends JFrame. 
 * In the DrawingEditor’s constructor display “Drawing Editor” in the title bar.
 * Create a DrawingPanel canvas and a ControlPanel controls, 
 * passing canvas to the ControlPanel’s constructor as a parameter (so that controls knows what it controls). 
 * Attach canvas and controls to the appropriate regions of the JFrame’s content pane (read about the BorderLayout class for specifics).
 * To complete the DrawingEditor class, provide a standard main method that creates a new DrawingEditor object which opens a window on the screen.

 * srastogi 
 * 2/29/16
 * 
 */
public class DrawingEditor extends JFrame
{
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 1200;
    /**
     * /constructor for the Drawing Editor Class
     */
    public DrawingEditor()
    {
        setTitle("Drawing Editor");
        setSize(WIDTH,HEIGHT);
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        
        add(canvas, BorderLayout.CENTER);
        add(controls, BorderLayout.PAGE_END);
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    /** 
     * creates a new object of Drawing Editor
     */
    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
}
