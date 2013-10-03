import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {

	protected JFrame parentFrame;
	protected JLabel secretWordLabel;
    protected JLabel gameResultLabel;
    protected JButton returnBtn;
    protected JFrame resultFrame;
    
	public GUI(String Letters, JFrame frame) {
		super();
		parentFrame = frame;
		secretWordLabel = new JLabel("The answer is "+Letters+".");
		gameResultLabel = new JLabel("");
		returnBtn = new JButton("Return to the main menu");
		returnBtn.addActionListener((ActionListener) this);
		
		resultFrame = new JFrame("");
	
		resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultFrame.setSize(new Dimension(300,470));
		resultFrame.setLayout(new FlowLayout());

		resultFrame.add(secretWordLabel);
        resultFrame.add(gameResultLabel);
        resultFrame.add(returnBtn);
        resultFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		parentFrame.dispose();
		resultFrame.dispose();
    	new Start().createAndShowGUI();
	}

}