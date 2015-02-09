import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class HelloWorldGUI1 {
	public static void main(String[] args) {
		ButtonHandler drzac = new ButtonHandler();
		JPanel nesto = new JPanel();
		JButton newbutton = new JButton("Novo DUGME");
		nesto.add(newbutton);
		
		Dimension dim = new Dimension();
		
		
		
		JButton okButton1 = new JButton("OK");
		JFrame write = new JFrame("GUI BRAH");
		write.add(okButton1);
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ButtonHandler());
		write.setSize(200, 200);
		write.setVisible(true);
		
	}
	 static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("KLIK");
			
			// TODO Auto-generated method stub
			
		}
		
	}

	

}
