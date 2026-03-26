package x40Arcade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class IceCandyManager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceCandyManager frame = new IceCandyManager();
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
	public IceCandyManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel signIn = new KenGradientPanel();
		signIn.setBounds(0, 0, 318, 310);
		contentPane.add(signIn);
		signIn.setLayout(null);

		JLabel lblTitle = new JLabel("Ice Candy Manager");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblTitle.setBounds(10, 75, 295, 48);
		signIn.add(lblTitle);

		JLabel lblDescription = new JLabel("<html><b> " + "A Java Swing inventory system built to help manage "
				+ "a small ice candy business." + "</b></html>");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDescription.setBounds(10, 144, 295, 37);
		signIn.add(lblDescription);

		KenGradientButton btnSignIn = new KenGradientButton("Sign In");
		btnSignIn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
			}
		});
		

		btnSignIn.setBounds(104, 192, 89, 23);
		signIn.add(btnSignIn);

		JPanel signUp = new JPanel();
		signUp.setBounds(317, 0, 323, 310);
		contentPane.add(signUp);
		signUp.setLayout(null);

		JLabel lblNewLabel = new KenGradientLabel("Create Account");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblNewLabel.setBounds(25, 77, 272, 41);
		signUp.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 94, 58));
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(54, 127, 77, 27);
		signUp.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(134, 133, 128, 20);
		signUp.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 94, 58));
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(54, 158, 77, 27);
		signUp.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 164, 128, 20);
		signUp.add(textField_1);
		
		KenGradientButton kngrdntbtnSignUp = new KenGradientButton("Sign In");
		kngrdntbtnSignUp.setText("Sign Up");
		kngrdntbtnSignUp.setForeground(Color.WHITE);
		kngrdntbtnSignUp.setFont(new Font("Segoe UI", Font.BOLD, 15));
		kngrdntbtnSignUp.setBounds(115, 196, 89, 23);
		signUp.add(kngrdntbtnSignUp);

	}
}
