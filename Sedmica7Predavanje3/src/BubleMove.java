import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BubleMove {
	public static void main(String[] args) {
		JFrame window = new JFrame("Test");
		window.setSize(800, 600);
		window.setLocation(500, 500);
		// window.setVisible(true);
		JPanel workSpace = new JPanel();
		Canvas canvas = new Canvas();
		workSpace.setLayout(new GridLayout(1, 2));
		workSpace.add(canvas);
		window.add(workSpace);
//		JButton myButton = new JButton("Dugmić");
//		workSpace.add(myButton);

		window.setVisible(true);
	}

	public static class Canvas extends JPanel {
		public Canvas() {
			setSize(new Dimension(750, 650));
			repaint();
//			JTextField jft = new JTextField("neki text");
//			add(jft);
		}

		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(10, 10, 50, 50);
		}
	}
}
