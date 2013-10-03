import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class GUI_Loser extends GUI implements ActionListener
{
    //private JFrame parentFrame;
    //private JFrame loserFrame;
    //private JLabel secretWordLabel;
    //private JLabel gameResultLabel;
    //private JButton rtnBtn;

    public GUI_Loser(String Letters, JFrame frame)
    {
        super(Letters, frame);
        //parentFrame = frame;
        //resultFrame = new JFrame("You are the loser!");
        resultFrame.setTitle("You are the loser!");
        //loserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //loserFrame.setSize(new Dimension(300,470));
        //loserFrame.setLayout(new FlowLayout());
        
        //secretWordLabel = new JLabel("The answer is "+Letters+".");
        //gameResultLabel = new JLabel("You are the Loser!");
        //returnBtn = new JButton("Return to the main menu");
        gameResultLabel.setText("You are the Loser!");
        //returnBtn.addActionListener(this); 
        
        ImageIcon icon = new ImageIcon("loser.gif"); 
        JLabel loserPic = new JLabel(icon);

        
        //resultFrame.add(secretWordLabel);
        //resultFrame.add(gameResultLabel);
        //resultFrame.add(returnBtn);
        resultFrame.add(loserPic);
        
        //resultFrame.setVisible(true);
    }
   /*
    public void actionPerformed(ActionEvent e)
    {
        //resultFrame.dispose(); //close the window
        super.actionPerformed(e);
       // parentFrame.dispose(); // and the parent
    //	new Start().createAndShowGUI(); // start over
    }
   */
}