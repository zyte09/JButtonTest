import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;   

public class MyFrame extends JFrame implements ActionListener{
        JButton button; //declare for global component para maaccess ng action event
        JLabel label; //declare for global component para maaccess ng action event


        MyFrame(){
            ImageIcon Icon = new ImageIcon("point.png");
            Image img = Icon.getImage();
            Image scaledImage = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH); //adjust img size
            ImageIcon Icon2 = new ImageIcon("wow.png");
            Image img2 = Icon2.getImage();
            Image scaledImage2 = img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH); //adjust img size

            label = new JLabel();
            label.setIcon(new ImageIcon(scaledImage2));
            label.setBounds(150, 150, 200, 200);
            label.setVisible(false); //false will not appear right away


            button = new JButton();
            button.setBounds(100, 100, 250, 100);
            button.addActionListener(this);
            button.setText("Click Me");
            button.setFocusable(false); //remove border sa text ng Click Me
            button.setIcon(new ImageIcon(scaledImage)); //without scaledImage button.setIcon(Icon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setFont(new Font("Comic Sans", Font.BOLD, 25)); //set font
            button.setIconTextGap(-15); //remove the gap between img and text
            button.setForeground(Color.cyan); //change background color of text to cyan
            button.setBackground(Color.lightGray); //change background color of button to lightGray
            button.setBorder(BorderFactory.createEtchedBorder()); //change border of button to lightGray border 
            //button.setEnabled(false); //disable the button go to action if u want button click once


            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500,500);
            this.setVisible(true);
            this.add(button);
            this.add(label);
    }

        @Override
        public void actionPerformed(ActionEvent e) {  //ths frame will now listen for events check if the events occurrs is are button
            if(e.getSource()==button){
                System.out.println("HEHE");
                //button.setEnabled(false); //disable button once
                label.setVisible(true); //show label once
            }
        }
}