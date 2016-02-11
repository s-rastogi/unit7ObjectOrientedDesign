import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**

 */
public class ButtonViewer
{
   public static final int FRAME_WIDTH = 100;
   public static final int FRAME_HEIGHT = 100;
   
   private JFrame frame;
   private JPanel panel;
   private JButton button;
   private JButton button2;
   private JLabel label;
   public ButtonViewer()
   {
       this.frame = new JFrame();
       this.panel = new JPanel();
       
       JButton button = new JButton( "A" );
       panel.add( button );
       
       JButton button2 = new JButton( "B" );
       panel.add( button2 );
       
       this.label = new JLabel();
       this.panel.add( this.label );
       
       this.frame.add( this.panel );
       
       ClickListener listener = new ClickListener();
       button.addActionListener( listener );
       button2.addActionListener( listener );
       
       frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
       frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       frame.setVisible( true );
   }
   
   public static void main( String[] args )
   {
     ButtonViewer view = new ButtonViewer();  
   }
   
   public class ClickListener implements ActionListener
   {
   
    public void actionPerformed( ActionEvent event )
     {
        label.setText( "Button" + event.getActionCommand() + " was clicked!" );
     }
    }


}
