import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

public abstract class Shape
{
    private double shapeRadius; 
    //shapes radius
    public Color shapeColor; 
    //shapes color
    private Point2D.Double shapeCenter;
    //shapes center
    
    /**
     * constructor for the Shape Class
     */
    public Shape(Point2D.Double center, double radius, Color color) 
    {
        shapeRadius = radius; 
        shapeColor = color; 
        shapeCenter = center; 
    }
    
    /**
     * returns the center of the shape
     */
    public Point2D.Double getCenter()
    {
        return shapeCenter;
    }

    /** 
     * returns the radius
     */
    public double getRadius() 
    {
        return shapeRadius;
    }

    public void move(double x, double y) 
    {
        shapeCenter = new Point2D.Double(x,y);
    }

    /** 
     * makes the radius of the shape r
     */
    public void setRadius(double r) 
    {
        shapeRadius = r;
    }

    public abstract boolean isInside(Point2D.Double point);

    public abstract void draw(Graphics2D g2, boolean filled);
}