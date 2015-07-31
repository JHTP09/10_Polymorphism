package exercises.section08_2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Mohamed
 */
public class DrawTest
{
    public static void main( String[] args )
    {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        
        JLabel statusBar = new JLabel( panel.statusText() );
        statusBar.setBackground( Color.WHITE );
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.add( statusBar, BorderLayout.SOUTH );
        application.setSize( 750, 750 );
        application.setVisible( true );
    }
}