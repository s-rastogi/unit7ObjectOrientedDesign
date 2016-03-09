import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Square extends Shape
{
    private double x;
    // the x coordinate of the upper left
    private double y;
    //the y coordinate of the upper left
    private double width;
    // the width of the shape
    private double height;
    // the height of the shape
    private Rectangle2D.Double newSquare;
    // the new square
    
    /**
     * the Constructor of the class Square
     */
    public Square( Point2D.Double center, double radius, Color color)
    {
        super(center,radius, color);
        height = 2 * super.getRadius();
        width = height;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        if ( newSquare.contains(point) == true)
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
        newSquare= new Rectangle2D.Double(this.getCenter().getX(),this.getCenter().getY(),this.getRadius()*2,this.getRadius()*2);
        g2.setColor(shapeColor);
        g2.draw(newSquare);
        if(filled == true)
        {
            g2.fill(newSquare);
        }
    }
    
}
