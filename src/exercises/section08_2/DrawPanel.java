package exercises.section08_2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Mohamed
 */
public class DrawPanel extends JPanel 
{
    private MyShape[] myShapes;
    private static Random randomNumber = new Random();
    private int numOfLines;
    private int numOfOvals;
    private int numOfRects;
    
    public DrawPanel()
    {
        int numOfShapes = Integer.parseInt( JOptionPane.showInputDialog( "How many shapes?" ) );
        myShapes = new MyShape[ numOfShapes ];
        
        numOfLines = randomNumber.nextInt( numOfShapes );
        numOfOvals = randomNumber.nextInt( numOfShapes - numOfLines );
        numOfRects = numOfShapes - ( numOfOvals + numOfLines );
        
        // Declare line objects in myShapes array
        for ( int i = 0; i < numOfLines; i++ )
            myShapes[ i ] = 
                    new MyLine(
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            new Color( randomNumber.nextInt( 256 ),
                                       randomNumber.nextInt( 256 ),
                                       randomNumber.nextInt( 256 )
                            )
                    );
        
        // Declare oval objects in myShapes array
        for ( int i = numOfLines; i < numOfLines + numOfOvals; i++ )
            myShapes[ i ] = 
                    new MyOval( 
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            randomNumber.nextInt( 700 ),
                            new Color( randomNumber.nextInt( 256 ),
                                       randomNumber.nextInt( 256 ),
                                       randomNumber.nextInt( 256 ) ),
                        randomNumber.nextInt( 2 ) == 0 ? true : false 
                    );
        
        // Declare rectangle objects in myShapes array
        for ( int i = numOfLines + numOfOvals; i < numOfShapes; i++ )
            myShapes[ i ] = 
                    new MyRectangle(
                                    randomNumber.nextInt( 700 ),
                                    randomNumber.nextInt( 700 ),
                                    randomNumber.nextInt( 700 ),
                                    randomNumber.nextInt( 700 ),
                                    new Color( randomNumber.nextInt( 256 ),
                                               randomNumber.nextInt( 256 ),
                                               randomNumber.nextInt( 256 ) ),
                                randomNumber.nextInt(2) == 0 ? true : false 
                    );
    }
    
    public String statusText()
    {
        return String.format( "%s: %d, %s: %d, %s: %d",
                "Lines", numOfLines, "Ovals", numOfOvals, "Rectangles", numOfRects );
    }
    
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        
        for ( MyShape currentShape : myShapes )
            currentShape.draw(g);
    }
}