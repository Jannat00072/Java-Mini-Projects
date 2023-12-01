package quiz.application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;          //to create Jframe




public class LogIn extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField tfname;
    
    LogIn(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
      
        //image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));    //to load image
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);            //to place image on JFrame
        
        //heading
        JLabel heading=new JLabel("Brilliant Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,35));
        heading.setForeground(new Color(153,0,76));
        add(heading);
         
        //Username
        JLabel name=new JLabel("Enter your Name");
        name.setBounds(800,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(153,0,76));
        add(name);
        
        //username box
        tfname=new JTextField();
        tfname.setBounds(730,185,300,25);
        tfname.setFont(new Font ("Times New Roman", Font.BOLD,18));
        add(tfname);
        
        //rules button
        rules=new JButton("Rules");
        rules.setBounds(730, 300,120,25);
        rules.setBackground(new Color(153,0,76));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        //back button
        back=new JButton("Back");
        back.setBounds(915, 300,120,25);
        back.setBackground(new Color(153,0,76));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);   //to set size
        setLocation(200,200);      //to specify location
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name); 
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new LogIn();
    }
}
