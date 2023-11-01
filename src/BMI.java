import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 68, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(50, 99, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("weight (kg)");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(155, 71, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeightm = new JLabel("height (m)");
		lblHeightm.setBounds(155, 102, 60, 14);
		contentPane.add(lblHeightm);
		
		JLabel lblNewLabel_1 = new JLabel("BMI Calculator");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 49));
		lblNewLabel_1.setBounds(10, 11, 438, 46);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnUnder = new JTextPane();
		txtpnUnder.setText("Underweight 		<18.5\r\n"
				+ "Normal 		<18.5-24.9\r\n"
				+ "Overweight 		25-29.9\r\n"
				+ "Obesity Mild 		30-34.9\r\n"
				+ "Obesity Moderate 	35-39.9\r\n"
				+ "Obesity Morbid 	>40");
		txtpnUnder.setBounds(10, 150, 213, 100);
		contentPane.add(txtpnUnder);
		
		JLabel lblNewLabel_2 = new JLabel("Your BMI is :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(252, 164, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,ans;
				try {
					num1=Double.parseDouble(textField.getText());
					num2=Double.parseDouble(textField_1.getText());
					
					ans = num1/(num2*num2);
					ans = (double)Math.round(ans * 100000d) / 100000d;
					textField_2.setText(Double.toString(ans));
				}
				
				finally{};
			}
		});
		btnNewButton.setBounds(274, 80, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(287, 189, 101, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(365, 238, 69, 23);
		contentPane.add(btnNewButton_1);
	}
}
