package exercises.section08_1;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Mohamed
 */
public abstract class MyShape 
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    
    // Constructors
    public MyShape()
    {
        x1 = y1 = x2 = y2 = 0;
        color = Color.BLACK;
    }
    
    public MyShape( int x1, int y1, int x2, int y2, Color color )
    {
        setX1( x1 );    // validate and store x1
        setY1( y1 );    // validate and store y1
        setX2( x2 );    // validate and store x2
        setY2( y2 );    // validate and store y2
        setColor( color );
    }
    
    // Setters and getters
    public void setX1( int x1 )
    {
        if ( x1 >= 0 )
            this.x1 = x1;
        else
            x1 = 0;
    }
    
    public int getX1()
    {
        return x1;
    }
    
    public void setY1( int y1 )
    {
        if ( y1 >= 0 )
            this.y1 = y1;
        else
            y1 = 0;
    }
    
    public int getY1()
    {
        return y1;
    }
    
    public void setX2( int x2 )
    {
        if ( x2 >= 0 )
            this.x2 = x2;
        else
            x2 = 0;
    }
    
    public int getX2()
    {
        return x2;
    }
    
    public void setY2( int y2 )
    {
        if ( y2 >= 0 )
            this.y2 = y2;
        else
            y2 = 0;
    }
    
    public int getY2()
    {
        return y2;
    }
    
    public void setColor( Color color )
    {
        this.color = color;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    // Every class extends MyShape must implement draw method
    public abstract void draw( Graphics g );
}
