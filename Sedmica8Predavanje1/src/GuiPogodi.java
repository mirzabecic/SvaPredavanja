import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.w3c.dom.Text;

public class GuiPogodi extends JPanel {
	public static JButton buttonM = new JButton("M");
	public static JButton buttonT = new JButton("T");
	public static JButton buttonV = new JButton("V");
	public static int[] array = new int[100];
	public static int start = 0;
	public static int end = array.length - 1;
	public static int m = (start + end) / 2;
	public static JTextField text = new JTextField();

	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		JFrame frame = new JFrame();
		frame.setSize(300, 400);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setSize(400, 400);
		//JTextArea textFix = new JTextArea("Guess  number");
		//panel.add(textFix);
		JTextField text = new JTextField("Da li je vas broj " + m, 20);
		text.setEditable(false);
		panel.add(text);
		ButtonHandler handler = new ButtonHandler();
		buttonM.addActionListener(handler);
		buttonT.addActionListener(handler);
		buttonV.addActionListener(handler);

		

		panel.add(buttonM);
		panel.add(buttonT);
		panel.add(buttonV);

		frame.add(panel);
		frame.setVisible(true);

	}

	public static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(buttonM)) {
				end = m - 1;
				m = (start + end) / 2;
				text.setText("Da li je vas broj" + m);
				System.out.println("dsa");
			} else if (e.getSource().equals(buttonV)) {
				start = m + 1;
				m = (start + end) / 2;
				text.setText("Da li je vas broj" + m);
				System.out.println("sda");
			} else if (e.getSource().equals(buttonT)) {
				System.out.println("Congratulations");

			}

		}

	}

}
