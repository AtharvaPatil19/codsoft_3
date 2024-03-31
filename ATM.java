//SAVE THIS FILE AS ATM.java
//INSTALL JDK, OPEN COMMAND PROMPT AND RUN COMMAND javac ATM.java THEN java ATM
//PASSWORD FOR ATM IS 1234

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;



public class ATM implements ActionListener
{
	private JFrame frmAtm;
	private JTextField amt;
	private JTextField display;
	private JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btncb = new JButton("CHECK BALANCE");
	JButton btnwd = new JButton("WITHDRAW");
	JButton btndp = new JButton("DEPOSITE");
	JButton btnetr = new JButton("ENTER");
	JButton btnclr = new JButton("CLEAR");
	JButton btnext = new JButton("EXIT");

	UserAcc user= new UserAcc(1234,10000);
	int info, uamt;
	public ATM()
	{
		prepareGUI();
		
	}
	public void prepareGUI()
	{
		frmAtm = new JFrame();
		frmAtm.setTitle("ATM");
		frmAtm.getContentPane().setBackground(new Color(0, 0, 0));
		frmAtm.setBackground(new Color(0, 0, 0));
		frmAtm.setBounds(100, 100, 915, 677);
		frmAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtm.getContentPane().setLayout(null);
		frmAtm.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 15));
		panel.setBounds(20, 10, 873, 249);
		frmAtm.getContentPane().add(panel);
		panel.setLayout(null);
		
		amt = new JTextField();
		amt.setHorizontalAlignment(SwingConstants.CENTER);
		amt.setFont(new Font("Tahoma", Font.BOLD, 25));
		amt.setText("Please press \"ENTER\" to enter password");
		amt.setForeground(new Color(0, 0, 128));
		amt.setEditable(false);
		amt.setBounds(51, 176, 775, 46);
		panel.add(amt);
		amt.setColumns(10);
		amt.getCaret().setVisible(false);
		
		display = new JTextField();
		display.setForeground(new Color(0, 128, 0));
		display.setText("WELCOME TO ABC BANK ATM\r\n");
		display.setFont(new Font("Tahoma", Font.BOLD, 33));
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setEditable(false);
		display.setBounds(27, 25, 820, 138);
		panel.add(display);
		display.setColumns(10);
		display.getCaret().setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 15));
		panel_1.setBounds(20, 243, 873, 397);
		frmAtm.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		btn1.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn1.setBounds(26, 24, 127, 60);
		panel_1.add(btn1);
		
		
		btn4.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn4.setBounds(26, 119, 127, 60);
		panel_1.add(btn4);
		
		
		btn7.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn7.setBounds(26, 214, 127, 60);
		panel_1.add(btn7);
		
		
		btn2.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn2.setBounds(217, 24, 127, 60);
		panel_1.add(btn2);
		
		btn8.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn8.setBounds(217, 214, 127, 60);
		panel_1.add(btn8);
		
		
		btn3.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn3.setBounds(407, 24, 127, 60);
		panel_1.add(btn3);
		
		
		btn6.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn6.setBounds(407, 119, 127, 60);
		panel_1.add(btn6);
		
		
		btn9.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn9.setBounds(407, 214, 127, 60);
		panel_1.add(btn9);
		
		btn0.setFont(new Font("Tahoma", Font.BOLD, 47));
		btn0.setBounds(217, 310, 127, 60);
		panel_1.add(btn0);
		btncb.setForeground(new Color(255, 128, 0));
		btncb.setBackground(new Color(255, 255, 255));
		
		
		btncb.setFont(new Font("Tahoma", Font.BOLD, 25));
		btncb.setBounds(581, 34, 266, 79);
		panel_1.add(btncb);
		btnwd.setForeground(new Color(0, 128, 0));
		
		
		btnwd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnwd.setBounds(581, 154, 266, 79);
		panel_1.add(btnwd);
		btndp.setForeground(new Color(0, 0, 255));
		
		
		btndp.setFont(new Font("Tahoma", Font.BOLD, 25));
		btndp.setBounds(581, 269, 266, 79);
		panel_1.add(btndp);
		btnclr.setForeground(new Color(255, 0, 0));
		
		
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnclr.setBounds(407, 310, 127, 60);
		panel_1.add(btnclr);
		btnetr.setForeground(new Color(0, 255, 0));
		
		btnetr.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnetr.setBounds(26, 310, 127, 60);
		panel_1.add(btnetr);
		btn5.setBounds(217, 119, 127, 60);
		panel_1.add(btn5);
		
		
		btn5.setFont(new Font("Tahoma", Font.BOLD, 47));
	
		btnext.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnext.setBounds(648, 358, 85, 21);
		panel_1.add(btnext);
		btnext.setForeground(new Color(255, 0, 0));


		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);			
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);			
		btn0.addActionListener(this);			
		btncb.addActionListener(this);
		btnwd.addActionListener(this);
		btndp.addActionListener(this);
		btnetr.addActionListener(this);
		btnclr.addActionListener(this);
		btnext.addActionListener(this);
	}
		
	
	
	public void actionPerformed(ActionEvent e)
	{
		String s= e.getActionCommand();
		if(s.equals("1"))
		{
			amt.setText(amt.getText()+"1");
			
		}
		else if(s.equals("2"))
		{
			amt.setText(amt.getText()+"2");

			
		}
		else if(s.equals("3"))
		{
			amt.setText(amt.getText()+"3");

			
		}
		else if(s.equals("4"))
		{
			amt.setText(amt.getText()+"4");

			
		}
		else if(s.equals("5"))
		{
			amt.setText(amt.getText()+"5");

			
		}
		else if(s.equals("6"))
		{
			amt.setText(amt.getText()+"6");

			
		}
		else if(s.equals("7"))
		{
			amt.setText(amt.getText()+"7");

			
		}
		else if(s.equals("8"))
		{
			amt.setText(amt.getText()+"8");

			
		}
		else if(s.equals("9"))
		{
			amt.setText(amt.getText()+"9");

			
		}
		else if(s.equals("0"))
		{
			amt.setText(amt.getText()+"0");

			
		}
		
		
		else if(s.equals("CLEAR"))
		{
			amt.setText("");
			
		}
		else if(s.equals("ENTER"))
		{
			
			try
			{
				String p= amt.getText();
				info=Integer.parseInt(p);
				amt.setText("");
			}
			catch(NumberFormatException exp)
			{
				display.setText("ENTER PASSWORD!");
				amt.setText("");
				info=0;
			}
		}
		if(info==user.password)
		{
			btnetr.setEnabled(false);
			display.setText("CHECK BALANCE OR WITHDRAW OR DEPOSITE");
			if(s.equals("CHECK BALANCE"))
			{
				display.setText("Account Balance: ₹" + user.checkbalance());
				amt.setText("");
			}
			else if(s.equals("WITHDRAW"))
			{
				try
				{
					String a= amt.getText();
					uamt=Integer.parseInt(a);
					display.setText(user.withdraw(uamt));
				}
				catch(NumberFormatException exp1)
				{
					display.setText("ENTER AMMOUNT TO WITHDRAW!");
					uamt=0;
				}
				amt.setText("");
			}
			else if(s.equals("DEPOSITE"))
			{
				try
				{
					String d=amt.getText();
					uamt=Integer.parseInt(d);
					display.setText(user.deposite(uamt));
				}	
				catch(NumberFormatException exp2)
				{
					display.setText("ENTER AMMOUNT TO DEPOSITE!");
					uamt=0;
				}
				amt.setText("");
			}
			else if(s.equals("EXIT"))
			{
				display.setText("WELCOME TO ABC BANK ATM\r\n");
				info=0;
				btnetr.setEnabled(true);
			}
		}
	}
						
	public static void main(String [] args)
	{
		ATM start= new ATM();
		
	}
	
}


class UserAcc
{
	int password;
	int balance;
	public UserAcc(int password, int balance)
	{
		this.password= password;
		this.balance= balance;
	}
	public int checkbalance()
	{
		return this.balance;
	}
	public String withdraw(int amt)
	{
		if(this.balance>=amt)
		{
			this.balance=(this.balance-amt);
			return "TRANSACTION SUCCESSFUL!";
		}
		else
		{
			return "INSUFFICIANT BALANCE!";
		}
	}
	public String deposite(int amt)
	{
		if(amt<=100000)
		{
			this.balance=(this.balance+amt);
			return "TRANSACTION SUCCESSFUL!";
		}
		else
		{
			return "YOU CAN DEPOSITE AMMOUNT BELOW ₹100000 ONLY";
		}
	}
}
			
