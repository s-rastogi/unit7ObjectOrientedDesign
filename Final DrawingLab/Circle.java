import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D.Double;

public class Circle extends Shape
{
    private double x;
    // the x coordinate of the upper left
    private double y;
    //the y coordinate of the upper left
    private double width;
    // the width of the shape
    private double height;
    // the height of the shape
    private Ellipse2D.Double newCircle;
    // the new square
    
    /**
     * the Constructor of the class Circle
     */
    public Circle( Point2D.Double center, double radius, Color color)
    {
        super(center,radius, color);
        width = 2 * super.getRadius();
        height = width;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        if (newCircle.contains(point) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
     public void draw(Graphics2D g2, boolean filled)
     {   
        newCircle = new Ellipse2D.Double(this.getCenter().getX(),this.getCenter().getY(),this.getRadius()*2,this.getRadius()*2);
        g2.setPaint(shapeColor);
        g2.draw(newCircle);
        if(filled == true)
        {
            g2.fill(newCircle);
        }
    }
}
