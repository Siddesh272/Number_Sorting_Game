package JavaProject;


import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.SystemColor;
import java.util.Arrays;
import java.util.Random;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
public class Sort2 extends JFrame {
	private JButton btn3;
	private JButton btn1;
	private JButton btn2;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	static String value1,value2,value3,value4,value5,value6;
	
	static int numbers[]=new int[6];
	static int i=0;
	static String button1, button2, button3, button4, button5, button6;
	public static JLabel text2;
	public static JLabel text3;
	public static JLabel text4;
	public static JLabel text5;
	public static JLabel text1;
	public static JLabel text6;
	
	JFrame window;
	JLabel counterLabel;
	Font font1 = new Font("Arial", Font.PLAIN, 70);	
	Timer timer;	
	int second, minute;
	String ddSecond;
	String score;
	DecimalFormat dFormat = new DecimalFormat("00");
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textScore1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sort2 frame = new Sort2();
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
	public static void getValue(String button) {
		if(value1=="?")
		{
			   text1.setText(button);
			   value1=text1.getText();
		}
		else if(value2=="?")
		{
				text2.setText(button);
				value2=text2.getText();
		}
		else if(value3=="?")
		{
				text3.setText(button);
				value3=text3.getText();
		}
		else if(value4=="?")
		{
				text4.setText(button);
				value4=text4.getText();
		}
		else if(value5=="?")
		{
				text5.setText(button);
				value5=text5.getText();
		}
		else if(value6=="?")
		{
				text6.setText(button);
				value6=text6.getText();
		}
	}
	public Sort2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 486);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		counterLabel = new JLabel("");
		counterLabel.setBounds(750, 10, 70, 44);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		counterLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		
		
		counterLabel.setText("14");
		second =14;
		
		countdownTimer();
		timer.start();
		contentPane.add(counterLabel);
		
		text1 = new JLabel("?");
		text1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value1=text1.getText();
		
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setBackground(SystemColor.controlShadow);
		text1.setBounds(81, 260, 103, 44);
		contentPane.add(text1);
		
		text2 = new JLabel("?");
		text2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value2=text2.getText();
	    
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setBackground(SystemColor.controlShadow);
		text2.setBounds(212, 260, 103, 44);
		contentPane.add(text2);
		
		text3 = new JLabel("?");
		text3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value3=text3.getText();
		
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setBackground(SystemColor.controlShadow);
		text3.setBounds(346, 260, 103, 44);
		contentPane.add(text3);
		
		text4 = new JLabel("?");
		text4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value4=text4.getText();
		
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setBackground(SystemColor.controlShadow);
		text4.setBounds(480, 260, 103, 44);
		contentPane.add(text4);
		
		text5 = new JLabel("?");
		text5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value5=text5.getText();
	
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setBackground(SystemColor.controlShadow);
		text5.setBounds(615, 260, 103, 44);
		contentPane.add(text5);
		
		text6 = new JLabel("?");
		text6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value6=text6.getText();
	
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setBackground(SystemColor.controlShadow);
		text6.setBounds(750, 260, 103, 44);
		contentPane.add(text6);
		
		Random random=new Random();
		int max,min;
		
		max=30; min=20;
		int b1=(int)(Math.random()*(max-min+1)+min);
		btn1 = new JButton(Integer.toString(b1));
		button1=btn1.getText();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1=btn1.getText();
				getValue(button1);
				btn1.setEnabled(false);
			}
		});
		btn1.setBounds(81, 111, 103, 44);
		contentPane.add(btn1);
		
		max=90; min=80;
		int b2=(int)(Math.random()*(max-min+1)+min);
		btn2 = new JButton(Integer.toString(b2));
		button2=btn2.getText();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2=btn2.getText();
				getValue(button2);
				btn2.setEnabled(false);
			}
		});
		btn2.setBounds(212, 111, 103, 44);
		contentPane.add(btn2);
		
		max=10; min=0;
		int b3=(int)(Math.random()*(max-min+1)+min);
		btn3 = new JButton(Integer.toString(b3));
		btn3.setBounds(346, 111, 103, 44);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3=btn3.getText();
				getValue(button3);
				btn3.setEnabled(false);	
			}
		});
		
		max=200; min=190;
		int b4=(int)(Math.random()*(max-min+1)+min);
		btn4 = new JButton(Integer.toString(b4));
		btn4.setBounds(480, 111, 103, 44);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4=btn4.getText();
				getValue(button4);
				btn4.setEnabled(false);
			}
		});
		
		max=50; min=40;
		int b5=(int)(Math.random()*(max-min+1)+min);
		btn5 = new JButton(Integer.toString(b5));
		btn5.setBounds(615, 111, 103, 44);
		contentPane.add(btn5);

		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5=btn5.getText();
				getValue(button5);
				btn5.setEnabled(false);

			}
		});
		
		max=70; min=60;
		int b6=(int)(Math.random()*(max-min+1)+min);
		btn6 = new JButton(Integer.toString(b6));
		btn6.setBounds(750, 111, 103, 44);
		contentPane.add(btn6);
		
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				if(value1=="?" || value2=="?" || value3=="?" || value4=="?" || value5=="?" || value6=="?")
					JOptionPane.showMessageDialog(null, "Fill all the JLabels");
				if(second!=0) {
					textScore1 = new JTextField("10");
				int i=0;
				int flag=0;
				int b[]=new int[6];
				b[0]=b1;
				b[1]=b2;
				b[2]=b3;
				b[3]=b4;
				b[4]=b5;
				b[5]=b6;
				Arrays.sort(b);
				
				
			      String val1=text1.getText(),val2=text2.getText(),val3=text3.getText(),val4=text4.getText(),val5=text5.getText(),val6=text6.getText();
			      String[] v= {val1,val2,val3,val4,val5,val6};
			      int [] x = new int [6];
			      for(i=0; i<6; i++) {
			         x[i] = Integer.parseInt(v[i]);
			      }
			      for(i=0;i<6;i++) {
						if(x[i]==b[i])
							flag+=1;
					}
			      if(flag==6) {
			    	  JOptionPane.showMessageDialog(null, "Congratulations! You have cleared level 2"); 
			          Sort3 sort=new Sort3();
				      sort.setVisible(true);
				      score=textScore1.getText();
						
						 try {
			                    Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Suraj\\eclipse-workspace\\PlayerLoginGame.db");

			                    String query = "UPDATE player set score = ('" + score + "') where score =5 ";

			                    Statement sta = connection.createStatement();
			                    int m = sta.executeUpdate(query);
			                    
			                    connection.close();
			                } catch (Exception exception) {
			                    exception.printStackTrace();
			                }
					      
			      }
			      else {
			    	  JOptionPane.showMessageDialog(null, "You failed to clear the level 2");
			    	  WelcomeWindow welcome=new WelcomeWindow();
					  welcome.setVisible(true);
			      }
			}
				else if(second==0) {
					JOptionPane.showMessageDialog(null, "Time Limit Exceeded !!");
					 WelcomeWindow welcome=new WelcomeWindow();
					  welcome.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(619, 359, 131, 50);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Time");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		lblNewLabel.setBounds(643, 12, 90, 39);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 WelcomeWindow welcome=new WelcomeWindow();
				  welcome.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnNewButton_1.setBounds(195, 359, 131, 50);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("Score");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(119, 12, 103, 39);
		contentPane.add(lblNewLabel_2);
		
		textScore1 = new JTextField("5");
		textScore1.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		textScore1.setBounds(244, 12, 103, 40);
		contentPane.add(textScore1);
		textScore1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg5.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 934, 460);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6=btn6.getText();
				getValue(button6);
				btn6.setEnabled(false);

			}
		});	
		 
	}

public void countdownTimer() {
	
	timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			second--;
			ddSecond = dFormat.format(second);
				
			counterLabel.setText("" + ddSecond);
			
			if(second==-1) {
				second = 59;
				minute--;
				ddSecond = dFormat.format(second);
				//ddMinute = dFormat.format(minute);	
				counterLabel.setText("" + ddSecond);
			}
			if(minute==0 && second==0) {
				timer.stop();
			}
		}
	});		
}		
}