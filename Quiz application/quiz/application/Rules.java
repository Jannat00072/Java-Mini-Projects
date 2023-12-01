package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //welcome
        JLabel heading=new JLabel("Welcome "+name+" to Brilliant Minds");
        heading.setBounds(60,30,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,30));
        heading.setForeground(new Color(153,0,76));
        add(heading);
        
        //rules
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
                "<html>"+
                        "1.You have 4 options to a question,Choose the correct one."+"<br><br>"+
                        "2.Do not Refresh or Close the Window, if there is any internet issue."+"<br><br>"+
                        "3.Do not change the tab."+"<br><br>"+
                        "4.Anyone suspected by an official of cheating will be disqualified."+"<br><br>"+
                        "5.You must not use any mobile device during the quiz."+"<br><br>"+
                "<html>"
        );
        
        add(rules);
        
    
    
    
    //back button
        back=new JButton("Back");
        back.setBounds(250, 500,100,30);
        back.setBackground(new Color(153,0,76));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
       //start button
        start=new JButton("Start");
        start.setBounds(400, 500,100,30);
        start.setBackground(new Color(153,0,76));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new LogIn();
        }
    }
    
    public static void main(String args[]){
        new Rules("User");
    }
}
