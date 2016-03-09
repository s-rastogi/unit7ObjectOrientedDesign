import java.lang.Boolean;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Point2D;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
* Write a description of class DrawingPanel here.
* A DrawingPanel maintains a list of shapes (an ArrayList<Shape>) and a reference to the “active shape.” 
* The latter refers to the last added shape or the shape last picked with a mouse (a shape is “picked” when the mouse clicks inside of it or on its border). 
* DrawingPanel should also have an enum field or boolean fields that indicate whether a shape is currently picked and, 
* if so, whether it is being moved or stretched. DrawingPanel’s constructor and some of the methods are summarized in Table 1.
* The methods that implement the requirements of the MouseListener, MouseMotionListener, and KeyListener interfaces are not shown. 
* Of these only mousePressed, mouseDragged, and keyPressed are used.
* 
* @author Saahil Rastogi
* @version 3/1/16
*/
public class DrawingPanel extends JPanel
{
    private Color startingColor; 
    //the intial color of the drawing panel
    private ArrayList<Shape> shapes;
    //array list holding the shapes
    private boolean chosen;
    // see if the the shape is picked and keeps tabs on it
    private Shape activeShape;
    //the shape being currently used
    /**
     * constructor for the DrawingPanel Class
     */
    public DrawingPanel()
    {
        shapes = new ArrayList<Shape>();
        
        setBackground(Color.WHITE);
        startingColor = Color.GREEN;
        
        chosen = false;
        
        addMouseListener(new MousePressListener() );
        addMouseMotionListener(new MouseMoveListener());
    }
   
    /**
     * methods returns the drawing color
     */
    public Color getColor()
    {
        return startingColor; 
    }
    
    /**
     * @return a size to cover the drawing canvas
     */
    public Dimension getPreferredSize()
    {
        return getSize( new Dimension(1000,1000));
    }
    
    /**
     * Allows a new color to be chosen
     */
    public void pickColor()
    {
        Color newColor = JColorChooser.showDialog(this, "Choose a Color", startingColor);
        if(newColor != null)
        {
            startingColor = newColor;
        }
    }
    
    /**
     * creates a new circle object, adds it to the array and repaints
     */
    public void addCircle()
    {
        activeShape = new Circle(new Point2D.Double(400,400), 60 , startingColor);
        shapes.add(activeShape);
        activeShape.draw((Graphics2D) getGraphics(), true);
    }
    
    /**
     * creates a new square object, adds it to the array and repaints
     */
    public void addSquare()
    {
        activeShape = new Square(new Point2D.Double(400,400), 60 , startingColor);
        shapes.add(activeShape);
        activeShape.draw((Graphics2D) getGraphics(), true);
    }   

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        for(Shape theshape: shapes)
        {
            if( theshape != activeShape)
            {   
                theshape.draw(g2, true);
            }
            
            if( activeShape != null)
            {
                activeShape.draw(g2,!chosen);
            }
                
        }
    }
 
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) 
        {
            activeShape = null;
            
            for(Shape theShape: shapes)
            {
                if( theShape.isInside( new Point2D.Double(event.getX(), event.getY())) == true)
                {
                    activeShape = theShape;
                }
            }
            
            if( activeShape != null)
            {
                chosen = true;
                activeShape.draw((Graphics2D) getGraphics(), true);
            }
        }
        public void mouseReleased(MouseEvent event)
        {
           
        }
        public void mouseClicked(MouseEvent event) 
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event) 
        {
        }
    }

    public class MouseMoveListener implements MouseMotionListener
    {

        public void mouseDragged(MouseEvent event) 
        {
            if(activeShape != null)
            {
                activeShape.move(event.getX(), event.getY());
            }
            repaint();
            
        }
        public void mouseMoved(MouseEvent event) 
        {
        }
    }
}