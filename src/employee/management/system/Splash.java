package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {
        getContentPane().setBackground(Color.white); // frame background color
        setLayout(null);

        // heading(EMPLOYEE MANAGEMENT SYSTEM)
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); // frame component(heading)
        heading.setBounds(80, 30, 1200, 60);  // our personal layout(heading location)
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading); // add heading in the frame

        // image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        // button on image
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1170, 650); // frame size
        setLocation(200, 50); //frame location
        setVisible(true); // frame visibility

        // dipper on heading(blinking effect)
        while (true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }

    @Override  //after click on button
    public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new Login();  // object created                (automatically constructor called )
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}
