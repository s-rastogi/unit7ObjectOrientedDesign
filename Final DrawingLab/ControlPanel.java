
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;


/**
 * ControlPanel extends JPanel. Add three buttons to it: 
 * “Pick Color,” “Add Circle,” and “Add Square.” Add a JPanel 
 * after the “Pick Color” button; its purpose is to show the
 * currently selected color. Call canvas’s getColor method to
 * obtain the initial color. Attach the appropriate listener to 
 * the “Pick Color,” “Add Circle,” and “Add Square” buttons, using 
 * the control panel itself as a listener, or, if you prefer, 
 * inner action listener classes, or anonymous inline classes. 
 * When “Pick Color” is clicked, call canvas’s pickColor method, 
 * then get the selected color back from canvas and show that 
 * color on the color display button. When “Add Circle” or “Add 
 * Square” is clicked, call canvas’s addCircle or addSquare method.
 * Extension: Don’t forget to return the keyboard focus to canvas
 * in either event 
 * 
 * @author Saahil Rastogi
 * @version 3/1/16
 */
public class ControlPanel extends JPanel
{
    
    private JButton colorSelect;
    //select color button
    private JButton addCircle;
    //button that adds a circle
    private JButton addRectangle;
    //button that adds a rectangle
    private DrawingPanel canvas;
    //its the canvas for the drawing panel
    private JPanel colorPanel;
    // the color panel htat works for JColorChooser
    

    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;
     
        colorSelect = new JButton("Select Color");
        add(colorSelect);
        
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLUE);
        add(colorPanel);
        
        addCircle = new JButton("Add Circle");
        add(addCircle);
        
        addRectangle = new JButton("Add Rectangle");
        add(addRectangle);

        ClickListener listener = new ClickListener();
        
        colorSelect.addActionListener(listener);
        addCircle.addActionListener(listener);
        addRectangle.addActionListener(listener);
        
        setVisible(true);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == colorSelect )
            {
                canvas.pickColor();
                colorPanel.setBackground(canvas.getColor());
            }
            
            else if (event.getSource() == addCircle )
            {
                canvas.addCircle();
                System.out.println("Add Circle");
            }
            
            else if (event.getSource() == addRectangle )
            {
                canvas.addSquare();
                System.out.println("Add Rectangle");
            }
            
            else
            {
                System.out.println("error");
            }
        }
    }
}
    
