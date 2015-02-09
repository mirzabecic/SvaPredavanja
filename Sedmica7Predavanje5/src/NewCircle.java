import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class NewCircle  extends JPanel implements ActionListener,KeyListener{
	int bodyCount = 1;
	int frame = 0;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < bodyCount; i++){
			g.fillOval((int)(Math.random() * 800), (int)(Math.random() * 600), 30, 30);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		bodyCount++;
		repaint();
		// TODO Auto-generated method stub
		
	}
	

}
