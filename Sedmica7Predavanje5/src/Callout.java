import java.awt.BorderLayout;



import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;





public class Callout {



public static void main(String[] args) {

Students students = new Students();



JLabel nameLabel = new JLabel();

nameLabel.setText(students.getRandomStudent());



JPanel mainPanel = new JPanel();

mainPanel.setLayout(new BorderLayout());

mainPanel.add(nameLabel, BorderLayout.CENTER);


JFrame mainWindow = new JFrame("Prozivka");

mainWindow.setSize(400, 300);

mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


mainWindow.add(mainPanel);



mainWindow.setVisible(true);




}



}