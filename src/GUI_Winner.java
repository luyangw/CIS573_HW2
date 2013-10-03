import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class GUI_Winner extends GUI implements ActionListener
{
	
    public GUI_Winner(String Letters,JFrame frame)
    {
    	super(Letters, frame);
    	parentFrame = frame;
        resultFrame.setTitle("You are the winner!!!");
        bg(resultFrame);
        JLabel answerLabel = new JLabel("The answer is ");
        
        secretWordLabel.setText(Letters);
        secretWordLabel.setFont(new Font("Default",Font.PLAIN,23));
        secretWordLabel.setForeground(Color.red);
        gameResultLabel.setText("You are winner!");
        //returnBtn = new JButton("Return to the main menu");

        //returnBtn.addActionListener(this); 
        
        resultFrame.add(answerLabel);
        resultFrame.add(secretWordLabel);
        resultFrame.add(gameResultLabel);
        resultFrame.add(returnBtn);

        //congratulationsFrame.setVisible(true);

    }

    public void bg(JFrame frame)
    {
        ImageIcon background = new ImageIcon("Congrats.gif");
        JLabel label = new JLabel(background);
     
        label.setBounds(0, 0, background.getIconWidth(),
            background.getIconHeight());
   
        JPanel imagePanel = (JPanel) frame.getContentPane();
        imagePanel.setOpaque(false);

        imagePanel.setLayout(new FlowLayout());

        frame.getLayeredPane().setLayout(null);

        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(background.getIconWidth(), background.getIconHeight());
        frame.setResizable(false);

    }

    /*
    public void actionPerformed(ActionEvent e)
    {
    	//congratulationsFrame.dispose();
        parentFrame.dispose();
    	new Start().createAndShowGUI();
    }
    */
}