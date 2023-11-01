import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tips extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tips frame = new Tips();
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
	public Tips() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnA = new JTextPane();
		txtpnA.setBackground(SystemColor.inactiveCaption);
		txtpnA.setText("Stay Hydrated. ...\r\n"
				+ "\r\n"
				+ "Exercise Daily. Exercise daily for at least an hour. ...\r\n"
				+ "\r\n"
				+ "Eat the Right Foods and Portion Each Meal. No matter how bad your stomach is telling you to go for candy over healthy food, try to stay away from sweets. ...\r\n"
				+ "\r\n"
				+ "Keep Track of Calories and Food Intake Per Day. ...\r\n"
				+ "\r\n"
				+ "Be Sure to Get Sleep. ...\r\n"
				+ "\r\n"
				+ "Stay Motivated.");
		txtpnA.setBounds(24, 32, 235, 179);
		contentPane.add(txtpnA);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/tip.png")).getImage();
		Image newImage = img.getScaledInstance(125, 200, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(newImage));
		lblNewLabel.setBounds(278, 11, 146, 240);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(170, 227, 89, 23);
		contentPane.add(btnNewButton);
	}

}
