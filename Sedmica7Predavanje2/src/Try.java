

	import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
	public class Try {
		static JLabel newLable = new JLabel();
		 static JLabel ml = new JLabel();
		 static JTextField text = new JTextField();
	private static class FirstGui extends JPanel {
		
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	
	

	}



	}
	private static class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		int age = Integer.parseInt(text.getText());
		
		if ( age < 18 )
			ml.setText("Cao");
		ml.setText("Primljeni ste u klub");
		
		
		
		
		
		
		
	
	}




	}
	public static void main(String[] args) {
	FirstGui displayPanel = new FirstGui();
	JButton okButton = new JButton("OK");
	ButtonHandler listener = new ButtonHandler();
	okButton.addActionListener(listener);
	JPanel content = new JPanel();
	content.setLayout(new BorderLayout());
	//content.add(displayPanel, BorderLayout.CENTER);
	content.add(okButton, BorderLayout.SOUTH);
	content.add(ml, BorderLayout.NORTH);
	content.add(newLable, BorderLayout.CENTER);
	content.add(text, BorderLayout.CENTER);
	JFrame window = new JFrame("GUI Test");
	window.setContentPane(content);
	window.setSize(300,200);
	window.setLocation(100,100);
	ml.setText("How old are you");
	
	
	
	//JLabel ml = new JLabel("Koliko imas godina?");
	//displayPanel.add(ml);
	//text = new TextField();
	
	
		
	
		
	
	window.setVisible(true);
	
		}
	

	}







