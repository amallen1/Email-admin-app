
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmailGui2 extends JFrame {

	private JPanel contentPane;
	private JTextField dptCodeTextField;
	private EmailCreator email;
	private JTextField lastNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailGui2 frame = new EmailGui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmailGui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstnamePrompt = new JLabel("First Name");
		firstnamePrompt.setBounds(29, 27, 185, 27);
		contentPane.add(firstnamePrompt);
		
		JTextField firstNameField = new JTextField();
		firstNameField.setSize(134, 26);
		firstNameField.setLocation(29, 56);
		contentPane.add(firstNameField);
		
		JLabel lblNewLabels = new JLabel("Last Name");
		lblNewLabels.setBounds(190, 32, 99, 16);
		contentPane.add(lblNewLabels);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(190, 56, 130, 26);
		contentPane.add(lastNameField);
		lastNameField.setColumns(10);
		
		
		
		JLabel dptCodeLabel = new JLabel("Department Codes");
		dptCodeLabel.setBounds(22, 102, 117, 27);
		contentPane.add(dptCodeLabel);
		
		JLabel lblsales = new JLabel("1. Sales");
		lblsales.setBounds(29, 152, 86, 16);
		contentPane.add(lblsales);
		
		JLabel lblNewLabel = new JLabel("2. Development");
		lblNewLabel.setBounds(116, 152, 107, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3. Accounting");
		lblNewLabel_1.setBounds(235, 152, 107, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter your department code.");
		lblNewLabel_2.setBounds(17, 185, 190, 39);
		contentPane.add(lblNewLabel_2);
		
		dptCodeTextField = new JTextField();
		dptCodeTextField.setBounds(201, 191, 65, 26);
		contentPane.add(dptCodeTextField);
		dptCodeTextField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//contentPane.setVisible(false);
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				String dptString = dptCodeTextField.getText();
				int dptCode = Integer.parseInt(dptString);
				EmailCreator email = new EmailCreator(firstName,lastName, dptCode);
				JOptionPane.showMessageDialog(null, email.showInfo());
				
			}
		});
		btnNewButton.setBounds(167, 249, 86, 29);
		contentPane.add(btnNewButton);
		
		
	}
}
