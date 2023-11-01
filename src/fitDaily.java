import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fitDaily {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fitDaily window = new fitDaily();
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
	public fitDaily() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 902, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Day 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day1 = new Day();
				day1.setVisible(true);
				btnNewButton.setBackground(Color.GREEN);
			}
		});
		btnNewButton.setBounds(51, 121, 88, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDay_6 = new JButton("Day 8");
		btnDay_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_6.setBackground(Color.GREEN);
			}
		});
		btnDay_6.setBounds(187, 121, 88, 40);
		frame.getContentPane().add(btnDay_6);
		
		JButton btnDay_13 = new JButton("Day 15");
		btnDay_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_13.setBackground(Color.GREEN);
			}
		});
		btnDay_13.setBounds(323, 121, 88, 40);
		frame.getContentPane().add(btnDay_13);
		
		JButton btnDay_20 = new JButton("Day 22");
		btnDay_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_20.setBackground(Color.GREEN);
			}
		});
		btnDay_20.setBounds(458, 121, 93, 40);
		frame.getContentPane().add(btnDay_20);
		
		JButton btnDay = new JButton("Day 2");
		btnDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day2 day2 = new Day2();
				day2.setVisible(true);
				btnDay.setBackground(Color.GREEN);
			}
		});
		btnDay.setBounds(51, 166, 88, 40);
		frame.getContentPane().add(btnDay);
		
		JButton btnDay_7 = new JButton("Day 9");
		btnDay_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day5 day5 = new Day5();
				day5.setVisible(true);
				btnDay_7.setBackground(Color.GREEN);
			}
		});
		btnDay_7.setBounds(187, 166, 88, 40);
		frame.getContentPane().add(btnDay_7);
		
		JButton btnDay_14 = new JButton("Day 16");
		btnDay_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day2 day2 = new Day2();
				day2.setVisible(true);
				btnDay_14.setBackground(Color.GREEN);
			}
		});
		btnDay_14.setBounds(323, 166, 88, 40);
		frame.getContentPane().add(btnDay_14);
		
		JButton btnDay_21 = new JButton("Day 23");
		btnDay_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day5 day5 = new Day5();
				day5.setVisible(true);
				btnDay_21.setBackground(Color.GREEN);
			}
		});
		btnDay_21.setBounds(458, 166, 93, 40);
		frame.getContentPane().add(btnDay_21);
		
		JButton btnDay_1 = new JButton("Day 3");
		btnDay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_1.setBackground(Color.GREEN);
			}
		});	
		btnDay_1.setBounds(51, 211, 88, 40);
		frame.getContentPane().add(btnDay_1);
		
		JButton btnDay_8 = new JButton("Day 10");
		btnDay_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_8.setBackground(Color.GREEN);
			}
		});
		btnDay_8.setBounds(187, 211, 88, 40);
		frame.getContentPane().add(btnDay_8);
		
		JButton btnDay_15 = new JButton("Day 17");
		btnDay_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_15.setBackground(Color.GREEN);
			}
		});
		btnDay_15.setBounds(323, 211, 88, 40);
		frame.getContentPane().add(btnDay_15);
		
		JButton btnDay_22 = new JButton("Day 24");
		btnDay_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_22.setBackground(Color.GREEN);
			}
		});
		btnDay_22.setBounds(458, 211, 93, 40);
		frame.getContentPane().add(btnDay_22);
		
		JButton btnDay_2 = new JButton("Day 4");
		btnDay_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day3 day3 = new Day3();
				day3.setVisible(true);
				btnDay_2.setBackground(Color.GREEN);
			}
		});
		btnDay_2.setBounds(51, 256, 88, 40);
		frame.getContentPane().add(btnDay_2);
		
		JButton btnDay_9 = new JButton("Day 11");
		btnDay_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day6 day6 = new Day6();
				day6.setVisible(true);
				btnDay_9.setBackground(Color.GREEN);
			}
		});
		btnDay_9.setBounds(187, 256, 88, 40);
		frame.getContentPane().add(btnDay_9);
		
		JButton btnDay_16 = new JButton("Day 18");
		btnDay_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day3 day3 = new Day3();
				day3.setVisible(true);
				btnDay_16.setBackground(Color.GREEN);
			}
		});
		btnDay_16.setBounds(323, 256, 88, 40);
		frame.getContentPane().add(btnDay_16);
		
		JButton btnDay_23 = new JButton("Day 25");
		btnDay_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day6 day6 = new Day6();
				day6.setVisible(true);
				btnDay_23.setBackground(Color.GREEN);
			}
		});
		btnDay_23.setBounds(458, 256, 93, 40);
		frame.getContentPane().add(btnDay_23);
		
		JButton btnDay_3 = new JButton("Day 5");
		btnDay_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_3.setBackground(Color.GREEN);
			}
		});
		btnDay_3.setBounds(51, 301, 88, 40);
		frame.getContentPane().add(btnDay_3);
		
		JButton btnDay_10 = new JButton("Day 12");
		btnDay_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_10.setBackground(Color.GREEN);
			}
		});
		btnDay_10.setBounds(187, 301, 88, 40);
		frame.getContentPane().add(btnDay_10);
		
		JButton btnDay_17 = new JButton("Day 19");
		btnDay_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_17.setBackground(Color.GREEN);
			}
		});
		btnDay_17.setBounds(323, 301, 88, 40);
		frame.getContentPane().add(btnDay_17);
		
		JButton btnDay_24 = new JButton("Day 26");
		btnDay_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day day = new Day();
				day.setVisible(true);
				btnDay_24.setBackground(Color.GREEN);
			}
		});
		btnDay_24.setBounds(458, 301, 93, 40);
		frame.getContentPane().add(btnDay_24);
		
		JButton btnDay_4 = new JButton("Day 6");
		btnDay_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day4 day4 = new Day4();
				day4.setVisible(true);
				btnDay_4.setBackground(Color.GREEN);
			}
		});
		btnDay_4.setBounds(51, 346, 88, 40);
		frame.getContentPane().add(btnDay_4);
		
		JButton btnDay_11 = new JButton("Day 13");
		btnDay_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day7 day7 = new Day7();
				day7.setVisible(true);
				btnDay_11.setBackground(Color.GREEN);
			}
		});
		btnDay_11.setBounds(187, 346, 88, 40);
		frame.getContentPane().add(btnDay_11);
		
		JButton btnDay_18 = new JButton("Day 20");
		btnDay_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day4 day4 = new Day4();
				day4.setVisible(true);
				btnDay_18.setBackground(Color.GREEN);
			}
		});
		btnDay_18.setBounds(323, 346, 88, 40);
		frame.getContentPane().add(btnDay_18);
		
		JButton btnDay_25 = new JButton("Day 27");
		btnDay_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day7 day7 = new Day7();
				day7.setVisible(true);
				btnDay_25.setBackground(Color.GREEN);
			}
		});
		btnDay_25.setBounds(458, 346, 93, 40);
		frame.getContentPane().add(btnDay_25);
		
		JButton btnDay_5 = new JButton("Day 7");
		btnDay_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day8 day8 = new Day8();
				day8.setVisible(true);
				btnDay_5.setBackground(Color.GREEN);
			}
		});
		btnDay_5.setBounds(51, 391, 88, 45);
		frame.getContentPane().add(btnDay_5);
		
		JButton btnDay_12 = new JButton("Day 14");
		btnDay_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day8 day8 = new Day8();
				day8.setVisible(true);
				btnDay_12.setBackground(Color.GREEN);
			}
		});
		btnDay_12.setBounds(187, 391, 88, 45);
		frame.getContentPane().add(btnDay_12);
		
		JButton btnDay_19 = new JButton("Day 21");
		btnDay_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day8 day8 = new Day8();
				day8.setVisible(true);
				btnDay_19.setBackground(Color.GREEN);
			}
		});
		btnDay_19.setBounds(323, 391, 88, 45);
		frame.getContentPane().add(btnDay_19);
		
		JButton btnDay_26 = new JButton("Day 28");
		btnDay_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Day8 day8 = new Day8();
				day8.setVisible(true);
				btnDay_26.setBackground(Color.GREEN);
			}
		});
		btnDay_26.setBounds(458, 391, 93, 45);
		frame.getContentPane().add(btnDay_26);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Machio.png")).getImage();
		Image newImage = img.getScaledInstance(202, 400, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(newImage));
		lblNewLabel.setBounds(628, 42, 184, 400);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Week 1");
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(75, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Week 2");
		lblNewLabel_1_1.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(211, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Week 3");
		lblNewLabel_1_2.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(344, 96, 55, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Week 4");
		lblNewLabel_1_3.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(470, 96, 63, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("fitDaily");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		lblNewLabel_2.setBounds(25, 0, 250, 74);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Tips");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tips tip1 = new Tips();
				tip1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(218, 475, 160, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Calculate:");
		lblNewLabel_3.setBounds(481, 475, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("BMI for adult");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMI bmi1 = new BMI();
				bmi1.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(553, 471, 138, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_2 = new JButton("BMR");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMR bmr1 = new BMR();
				bmr1.setVisible(true);
			}
		});
		btnNewButton_2_2.setBounds(553, 492, 138, 23);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("More to come...");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_3.setBounds(690, 471, 151, 23);
		frame.getContentPane().add(btnNewButton_2_3);
	}
}
