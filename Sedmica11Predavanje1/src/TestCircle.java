import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCircle {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanelExt panel = new JPanelExt();
		frame.setContentPane(panel);
		frame.setVisible(true);

	}

}
