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

public class Day7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Day7 frame = new Day7();
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
	public Day7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 466);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAa_1 = new JTextPane();
		txtpnAa_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		txtpnAa_1.setEditable(false);
		txtpnAa_1.setBackground(Color.WHITE);
		txtpnAa_1.setBounds(24, 224, 159, 57);
		contentPane.add(txtpnAa_1);
		
		JTextPane txtpnAa = new JTextPane();
		txtpnAa.setBackground(Color.WHITE);
		txtpnAa.setEditable(false);
		txtpnAa.setFont(new Font("Sitka Small", Font.BOLD, 14));
		txtpnAa.setText("This is a classic bodyweight circuit that shows two options for each movement: Basic or Advanced. \r\n"
				+ "Since you’ve now been training had for two weeks, maybe you can try the advanced version and gauge your strength/stabilization level.\r\n"
				+ "\r\n"
				+ "GUIDE:\r\n"
				+ "https://bit.ly/3KUYgnp");
		txtpnAa.setBounds(10, 28, 388, 150);
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
		Image img = new ImageIcon(this.getClass().getResource("/pngegg.png")).getImage();
		Image newImage = img.getScaledInstance(400,185, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(newImage));
		lblNewLabel.setBounds(24, 198, 374, 229);
		contentPane.add(lblNewLabel);
	}
}
