package exercises.section08_1;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Mohamed
 */
public class MyRectangle extends MyShape 
{
    private boolean filled;

    // Constructors
    public MyRectangle()
    {
        super();
        filled = false;
    }
    
    public MyRectangle( int x1, int y1, int x2, int y2, Color color, boolean filled )
    {
        super( x1, y1, x2, y2, color );
        setFilled( filled );
    }
    
    // Setter and getter
    public void setFilled( boolean filled )
    {
        this.filled = filled;
    }
    
    public boolean getFilled()
    {
        return filled;
    }

    private int getUpperLeftX()
    {
        return Math.min( getX1(), getX2() );
    }
    
    private int getUpperLeftY()
    {
        return Math.min( getY1(), getY2() );
    }
    
    private int getWidth()
    {
        return Math.abs( getX1() - getX2() );
    }
    
    private int getHeight()
    {
        return Math.abs( getY1() - getY2() );
    }
    
    @Override
    public void draw(Graphics g) 
    {
        g.setColor( getColor() );
        
        if ( filled )
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        else
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
    
}