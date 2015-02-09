import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;






public class Rectangle {
	public static void main(String[] args) {
		RepaintListener listener = new RepaintListener();
		Canvas canvasPanel = new Canvas();
		canvasPanel.addMouseListener(listener);
		JFrame mainWindow = new JFrame("Sareni pravougaonik");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setVisible(true);
		mainWindow.setSize(600, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		
		
	}
	public static class RepaintListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e){
			Component source =  (Component)e.getSource();
			source.repaint();
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
		
	}
	public static class Canvas extends JPanel{
	   @Override
	   public void paintComponent (Graphics g){
		   g.setColor(new Color((float)(Math.random()), (float)(Math.random()), (float)(Math.random()),(float)(Math.random())));
		   g.setColor(Color.getHSBColor(0.3f, (float)(Math.random()), (float)(Math.random())));
		   g.fillRect(50, 50, 100, 100);
		   
	   }
		
	}

}
