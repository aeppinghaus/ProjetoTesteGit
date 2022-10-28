import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login {
  public static void main(String[] args) {
    JFrame f = new JFrame("Button Example");
    
    final JTextField email = new JTextField();
    email.setBounds(50, 50, 150, 20);
    email.setText("email@email.com");

    final JTextField senha = new JTextField();
    senha.setBounds(50, 75, 150, 20);
    senha.setText("*******");

    JButton b = new JButton("Entrar");
    b.setBounds(50, 100, 95, 30);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        email.setText("Welcome to Javatpoint.");
      }
    });

    f.add(email);
    f.add(senha);
    f.add(b);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
  }
}
