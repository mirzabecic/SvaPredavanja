import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.crypto.SecretKeyFactorySpi;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.Text;


public class Vjezba {
	static JTextField text = new JTextField(10);
	static JTextArea out = new JTextArea(5,5);
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Test");
		window.setSize(300, 600);
		window.setLocation(150, 150);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Ok");
		
		ButtonHandler bh = new ButtonHandler();
		panel.add(button);
		
		button.addActionListener(bh);	
			
		panel.add(text);
		//panel.setBackground(Color.WHITE);
		
		panel.add(out);
		
		window.add(panel);
		
		window.setVisible(true);
			
	}
	
			public static class ButtonHandler implements ActionListener{
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int broj = Integer.parseInt(text.getText());
					JButton b =(JButton)e.getSource();
					String ubaci= "";

					for ( int i = 0; i <= broj ; i ++){
					if (i % 2 == 0){
					    ubaci += i + ", ";
					}
					
				}
			out.setText(ubaci);		
			}
					
			
		}
}