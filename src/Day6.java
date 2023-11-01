import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Day6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Day6 frame = new Day6();
				try {
					
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
	public Day6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 466);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAa = new JTextPane();
		txtpnAa.setBackground(Color.WHITE);
		txtpnAa.setEditable(false);
		txtpnAa.setFont(new Font("Sitka Small", Font.BOLD, 14));
		txtpnAa.setText("Utilize a heavy ball to tax your core and major muscle groups together. \r\n"
				+ "Move your hips, shoulders, and feet to generate torque and power. \r\n"
				+ "Repeat for 20 minutes doing as many rounds as possible.\r\n"
				+ "If you need rest, take a minute to recover and drink water. \r\n"
				+ "Stretch for five minutes afterward. \r\n"
				+ "\r\n"
				+ "GUIDE:\r\n"
				+ "https://bit.ly/3r8n8jI");
		txtpnAa.setBounds(10, 28, 228, 388);
		contentPane.add(txtpnAa);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  contentPane.setVisible(false);
				  dispose();
			}
		});
		btnNewButton.setBounds(331, 393, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/boing.jpg")).getImage();
		Image newImage = img.getScaledInstance(252, 400, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(newImage));
		lblNewLabel.setBounds(206, 0, 223, 416);
		contentPane.add(lblNewLabel);
	}
}
