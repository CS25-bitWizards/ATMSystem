
package project.bitwizards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Times New Roman", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Times New Roman", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Times New Roman", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 400);
        setVisible(true);
        setLocation(300, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            cardTextField.setText("");
            pinTextField.setText("");
            String cardNo = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());
            
            if (cardNo.isEmpty() || pin.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Card Number and PIN");
            } else {
                JOptionPane.showMessageDialog(this, "Login Successful! (Dummy message)");
            }
      } else if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
      } else if(ae.getSource() == signup){
          JOptionPane.showMessageDialog(this, "Signup Page (Not Implemented)");
          
    }
}
    

     public static void main(String[]args) {
        new Login();
    }
}
        
        
