import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawUndoPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		CircleDraw listener = new CircleDraw();
		JPanel panel = new JPanel();
		panel.addMouseListener(listener);
		frame.add(panel);
		frame.setVisible(true);

	}

	public static class CircleDraw implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component) e.getSource();
			Graphics g = source.getGraphics();
			g.setColor(Color.RED);
			g.fillOval(e.getX() - 13, e.getY() - 13, 25, 25);


		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

}
