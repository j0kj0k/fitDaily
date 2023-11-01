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

public class BMR extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblAgeyr;
	private JLabel lblNewLabel_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMR frame = new BMR();
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
	public BMR() {
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
		lblNewLabel.setBounds(155, 71, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeightm = new JLabel("height (m)");
		lblHeightm.setBounds(155, 102, 60, 14);
		contentPane.add(lblHeightm);
		
		JLabel lblNewLabel_1 = new JLabel("BMR Calculator");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 49));
		lblNewLabel_1.setBounds(10, 11, 438, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your BMR is :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(139, 176, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,num3,ansm,ansf;
				try {
					num1=Double.parseDouble(textField.getText());
					num2=Double.parseDouble(textField_1.getText());
					num3=Double.parseDouble(textField_3.getText());
					
					ansm = 66.47+(13.75*num1)+(5.003*num2)-(6.755*num3);
					ansm = (double)Math.round(ansm * 100d) / 100d;
					
					ansf = 655.1+(9.563*num1)+(1.85*num2)-(4.676*num3);
					ansf = (double)Math.round(ansf * 100d) / 100d;
					
					textField_2.setText(Double.toString(ansf));
					textField_4.setText(Double.toString(ansm));
				}
				
				finally{};
			}
		});
		btnNewButton.setBounds(246, 98, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(72, 212, 101, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(50, 131, 86, 20);
		contentPane.add(textField_3);
		
		lblAgeyr = new JLabel("age (yr)");
		lblAgeyr.setBounds(155, 134, 60, 14);
		contentPane.add(lblAgeyr);
		
		lblNewLabel_3 = new JLabel("Female");
		lblNewLabel_3.setBounds(30, 200, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(253, 212, 101, 38);
		contentPane.add(textField_4);
		
		lblNewLabel_4 = new JLabel("Male");
		lblNewLabel_4.setBounds(211, 200, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(365, 238, 69, 23);
		contentPane.add(btnNewButton_1);
	}
}
