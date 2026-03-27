package x40Arcade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LogInPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNameSignUp;
	private JTextField txtPasswordSignUp;
	private JTextField txtNameSignIn;
	private JTextField txtPasswordSignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
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
	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel staticPanel = new KenGradientPanel();
		staticPanel.setBounds(0, 0, 318, 310);
		contentPane.add(staticPanel);
		staticPanel.setLayout(null);

		JLabel lblTitle = new JLabel("Ice Candy Manager");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblTitle.setBounds(10, 97, 295, 48);
		staticPanel.add(lblTitle);

		JLabel lblDescription = new JLabel("<html> " + "A Java Swing inventory system built to help manage "
				+ "a small ice candy business." + "</html>");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDescription.setBounds(10, 142, 295, 37);
		staticPanel.add(lblDescription);

		KenGradientButton btnSignIn = new KenGradientButton("Sign In");
		btnSignIn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnSignIn.setForeground(new Color(255, 255, 255));
		
		btnSignIn.setBounds(114, 200, 89, 23);
		staticPanel.add(btnSignIn);
		
		JPanel rightContainerPanel = new JPanel();
		rightContainerPanel.setBounds(318, 0, 322, 310);
		contentPane.add(rightContainerPanel);
		rightContainerPanel.setLayout(null);
		
		JPanel signUpPanel = new JPanel();
		signUpPanel.setLayout(null);
		signUpPanel.setBounds(0, 0, 323, 310);
		rightContainerPanel.add(signUpPanel);
		
		KenGradientLabel lblCreateAccount = new KenGradientLabel("Create Account");
		lblCreateAccount.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblCreateAccount.setBounds(25, 77, 272, 41);
		signUpPanel.add(lblCreateAccount);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 94, 58));
		lblName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblName.setBounds(54, 127, 77, 27);
		signUpPanel.add(lblName);
		
		txtNameSignUp = new JTextField();
		txtNameSignUp.setColumns(10);
		txtNameSignUp.setBounds(134, 133, 128, 20);
		signUpPanel.add(txtNameSignUp);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 94, 58));
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(54, 158, 77, 27);
		signUpPanel.add(lblNewLabel_1_1);
		
		txtPasswordSignUp = new JTextField();
		txtPasswordSignUp.setColumns(10);
		txtPasswordSignUp.setBounds(134, 164, 128, 20);
		signUpPanel.add(txtPasswordSignUp);
		
		KenGradientButton btnSignUp = new KenGradientButton("Sign In");
		btnSignUp.setText("Sign Up");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnSignUp.setBounds(117, 200, 89, 23);
		signUpPanel.add(btnSignUp);
		
		JPanel signInPanel = new JPanel();
		signInPanel.setBounds(0, 0, 323, 310);
		rightContainerPanel.add(signInPanel);
		signInPanel.setLayout(null);
		
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				
				
				if (signUpPanel.isVisible()) {
					signInPanel.setVisible(true);
					signUpPanel.setVisible(false);
					btnSignIn.setText("Sign Up");
				} else if (signInPanel.isVisible()) {
					signInPanel.setVisible(false);
					signUpPanel.setVisible(true);
					btnSignIn.setText("Sign In");
				}
				
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		KenGradientLabel lblLoginAccount = new KenGradientLabel("Create Account");
		lblLoginAccount.setText("Login Account");
		lblLoginAccount.setBounds(42, 77, 239, 41);
		lblLoginAccount.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		signInPanel.add(lblLoginAccount);
		
		JLabel lblNameSignIn = new JLabel("Name");
		lblNameSignIn.setForeground(new Color(255, 94, 58));
		lblNameSignIn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNameSignIn.setBounds(54, 127, 77, 27);
		signInPanel.add(lblNameSignIn);
		
		JLabel lblPasswordSignIn = new JLabel("Password");
		lblPasswordSignIn.setForeground(new Color(255, 94, 58));
		lblPasswordSignIn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblPasswordSignIn.setBounds(54, 158, 77, 27);
		signInPanel.add(lblPasswordSignIn);
		
		txtNameSignIn = new JTextField();
		txtNameSignIn.setColumns(10);
		txtNameSignIn.setBounds(134, 133, 128, 20);
		signInPanel.add(txtNameSignIn);
		
		txtPasswordSignIn = new JTextField();
		txtPasswordSignIn.setColumns(10);
		txtPasswordSignIn.setBounds(134, 164, 128, 20);
		signInPanel.add(txtPasswordSignIn);
		
		KenGradientButton btnSignIn2 = new KenGradientButton("Sign In");
		btnSignIn2.setForeground(Color.WHITE);
		btnSignIn2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnSignIn2.setBounds(117, 200, 89, 23);
		signInPanel.add(btnSignIn2);

	}
}
