package x40Arcade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanelNorth = new KenGradientPanel();
		headerPanelNorth.setBorder(null);
		headerPanelNorth.setPreferredSize(new Dimension(100, 120));
		headerPanelNorth.setBackground(new Color(255, 140, 0));
		contentPane.add(headerPanelNorth, BorderLayout.NORTH);
		headerPanelNorth.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHeader = new JLabel("Welcome to IceCandy Manager");
		lblHeader.setForeground(new Color(240, 255, 255));
		lblHeader.setFont(new Font("Segoe UI", Font.BOLD, 30));
		headerPanelNorth.add(lblHeader, BorderLayout.NORTH);
		
		JLabel lblDescription = new JLabel("<html>A Java Swing-based inventory and sales management system designed for a small ice candy business. "
				+ "This application allows users to track product stock, record daily sales, and manage item data through a simple and user-friendly interface. "
				+ "Built as a personal project to support a real-world family business.</html>");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setForeground(new Color(255, 255, 255));
		lblDescription.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		headerPanelNorth.add(lblDescription, BorderLayout.CENTER);
		
		JPanel orderPanelWest = new JPanel();
		orderPanelWest.setBorder(null);
		orderPanelWest.setPreferredSize(new Dimension(200, 100));
		orderPanelWest.setBackground(new Color(255, 195, 113));
		contentPane.add(orderPanelWest, BorderLayout.WEST);
		
		JPanel tablePanelCenter = new JPanel();
		contentPane.add(tablePanelCenter, BorderLayout.CENTER);
		tablePanelCenter.setLayout(new BoxLayout(tablePanelCenter, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tablePanelCenter.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setBorder(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Name", "Flavor", "Price", "stock"
			}
		));
		
		JPanel footerPanelSouth = new JPanel();
		footerPanelSouth.setBackground(new Color(255, 99, 71));
		footerPanelSouth.setPreferredSize(new Dimension(200, 100));
		contentPane.add(footerPanelSouth, BorderLayout.SOUTH);
		
		JPanel menuPanelEast = new JPanel();
		menuPanelEast.setPreferredSize(new Dimension(200, 200));
		menuPanelEast.setBackground(new Color(255, 182, 193));
		contentPane.add(menuPanelEast, BorderLayout.EAST);

	}

}
