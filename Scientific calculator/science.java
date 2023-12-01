import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class science {

	private JFrame frame;
	private JButton btnpower;
	private JButton btncube;
	private JButton btnsquare;
	private JButton btnfact;
	private JButton btnplusminus;
	private JButton divbyX;
	private JButton btnR;
	private JButton btnlog;
	private JButton btnex;
	private JButton btnmod;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnsinh;
	private JButton btnsin;
	private JButton btnC;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnCosh;
	private JButton btncos;
	private JButton btnB;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btndot;
	private JButton btntanh;
	private JButton btntan;
	private JButton btnadd;
	private JButton btnsub;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btnequal;
	private JTextField textField;
	private JRadioButton btnON;
	private JRadioButton btnOFF;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					science window = new science();
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
	public science() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.setBounds(100, 100, 451, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnpower = new JButton("x^y");
		btnpower.setEnabled(false);
		btnpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
				
			}
		});
		btnpower.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		btncube = new JButton("x^3");
		btncube.setEnabled(false);
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btncube.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		btnsquare = new JButton("x^2");
		btnsquare.setEnabled(false);
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsquare.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnfact.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnplusminus = new JButton("+/-");
		btnplusminus.setEnabled(false);
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
			
		});
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		divbyX = new JButton("1/x");
		divbyX.setEnabled(false);
		divbyX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		divbyX.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnex = new JButton("e^x");
		btnex.setEnabled(false);
		btnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnex.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnmod = new JButton("%");
		btnmod.setEnabled(false);
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnsinh = new JButton("sinh");
		btnsinh.setEnabled(false);
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnsin = new JButton("sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnC = new JButton("C");
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btncos = new JButton("cos");
		btncos.setEnabled(false);
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnB = new JButton("B");
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
			
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btntanh = new JButton("tanh");
		btntanh.setEnabled(false);
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btntan = new JButton("tan");
		btntan.setEnabled(false);
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnadd = new JButton("+");
		btnadd.setEnabled(false);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnsub = new JButton("-");
		btnsub.setEnabled(false);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnmul = new JButton("*");
		btnmul.setEnabled(false);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btndiv = new JButton("/");
		btndiv.setEnabled(false);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnequal = new JButton("=");
		btnequal.setEnabled(false);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		
		btnON = new JRadioButton("ON");
		btnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btndot.setEnabled(true);
				btnadd.setEnabled(true);				
				btnsub.setEnabled(true);
				btnmul.setEnabled(true);
				btndiv.setEnabled(true);
				btnmod.setEnabled(true);
				btnequal.setEnabled(true);
				btnC.setEnabled(true);
				btnB.setEnabled(true);
				btnplusminus.setEnabled(true);
				btnfact.setEnabled(true);
				btnsquare.setEnabled(true);
				btncube.setEnabled(true);
				btnpower.setEnabled(true);
				divbyX.setEnabled(true);
				btnex.setEnabled(true);
				btnlog.setEnabled(true);
				btnsin.setEnabled(true);
				btnsinh.setEnabled(true);
				btncos.setEnabled(true);
				btnCosh.setEnabled(true);
				btntan.setEnabled(true);
				btntanh.setEnabled(true);
				btnR.setEnabled(true);
				
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(btnON);
		btnON.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnOFF = new JRadioButton("OFF");
		btnOFF.setSelected(true);
		btnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btndot.setEnabled(false);
				btnadd.setEnabled(false);				
				btnsub.setEnabled(false);
				btnmul.setEnabled(false);
				btndiv.setEnabled(false);
				btnmod.setEnabled(false);
				btnequal.setEnabled(false);
				btnC.setEnabled(false);
				btnB.setEnabled(false);
				btnplusminus.setEnabled(false);
				btnfact.setEnabled(false);
				btnsquare.setEnabled(false);
				btncube.setEnabled(false);
				btnpower.setEnabled(false);
				divbyX.setEnabled(false);
				btnex.setEnabled(false);
				btnlog.setEnabled(false);
				btnsin.setEnabled(false);
				btnsinh.setEnabled(false);
				btncos.setEnabled(false);
				btnCosh.setEnabled(false);
				btntan.setEnabled(false);
				btntanh.setEnabled(false);
				btnR.setEnabled(false);
				
				textField.setEnabled(false);
				
			}
		});
		buttonGroup.add(btnOFF);
		btnOFF.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnON)
							.addGap(18)
							.addComponent(btnOFF, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnex, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnsin, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btncos, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btntan, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(divbyX, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnlog, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnsinh, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnCosh, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btntanh, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnpower, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnmod, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btncube, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnsub, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnsquare, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnmul, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnfact, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btndiv, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnplusminus, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btndot, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnequal, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addGap(33))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnON)
						.addComponent(btnOFF))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnex, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnsin, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btncos, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btntan, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(divbyX, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btnlog, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnsinh, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnCosh, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btntanh, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnpower, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btnmod, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btncube, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnsub, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnsquare, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnmul, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnfact, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btndiv, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnplusminus, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btndot, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(btnequal, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
