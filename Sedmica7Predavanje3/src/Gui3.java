import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui3 {

	public static JButton jb1 = new JButton("OK");
	public static JButton jb2 = new JButton("Cancel");
	
public static void main(String[] args) {
	JFrame jf = new JFrame("Java Window");
	jf.setLocation(700, 200);
	jf.setSize(300, 200);

	JPanel jp = new JPanel();
	jf.add(jp);
	jp.add(jb1);
	jp.add(jb2);
	ButtonHandler  bH = new ButtonHandler();
	jb1.addActionListener(bH);
	jb2.addActionListener(bH);

	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}
public static class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Klik!");

		JButton b = (JButton)e.getSource();
        if(b.getText().equals("OK")){
        	jb1.setText("Clicked");
        	jb2.setText("Cancel");
        }else if(b.getText().equals("Cancel")){
        	jb1.setText("OK");
        	jb2.setText("Clicked");
        }
	
	}
	
	}
}