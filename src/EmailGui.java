import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmailGui {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailGui window = new EmailGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmailGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.getContentPane().setLayout(null);
		
		JLabel startLabel = new JLabel("Email Adminstration App");
		startLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		startLabel.setBounds(117, 92, 202, 16);
		frame.getContentPane().add(startLabel);
		
		JButton startButton = new JButton("Click to Get Started");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				EmailGui2 emailPage = new EmailGui2();
				emailPage.setVisible(true);
				
			}
		});
		startButton.setBounds(133, 120, 166, 41);
		frame.getContentPane().add(startButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
