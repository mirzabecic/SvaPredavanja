import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCircle {

	public static void main(String[] args) {
		StampListener listener = new StampListener();
		JPanel canvasPanel = new JPanel();
		canvasPanel.addMouseListener(listener);
		canvasPanel.addMouseMotionListener(listener);
		JFrame mainWindow = new JFrame("Sareni pravougaonik");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setVisible(true);
		mainWindow.setSize(600, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);

	}

	public static class StampListener implements MouseListener,
			MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			 Graphics g = source.getGraphics();

			 g.fillOval(e.getX() - 35, e.getY()-35, 70, 70);

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
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component) e.getSource();
			Graphics g = source.getGraphics();
			g.setColor(Color.getHSBColor((float) (Math.random()),
					(float) (Math.random()), (float) (Math.random())));
			g.fillOval(e.getX() - 35, e.getY() - 35, 30, 30);
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static class Canvas extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(new Color((float) (Math.random()), (float) (Math
					.random()), (float) (Math.random()),
					(float) (Math.random())));
			g.setColor(Color.getHSBColor(0.3f, (float) (Math.random()),
					(float) (Math.random())));
			g.fillRect(50, 50, 100, 100);

		}

	}

}
