import javax.swing.JFrame;

/**
 * Write a description of class DrawingEditor here.
 * 
 * srastogi
 * 2/22/16
 */
public class DrawingEditor extends JFrame
{
  public static final int FRAME_WIDTH = 100;
  public static final int FRAME_HEIGHT = 100;
   
   
  private JFrame frame;
   
  DrawingEditor()
  {
        frame =  new JFrame();
  }
    
  public static void main ( String[] args )
  {
       DrawingEditor frame = new DrawingEditor();
  }
    
}
