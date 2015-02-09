


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class BetterMove extends JPanel implements ActionListener,KeyListener{
	
	
	public static void main(String[] args) {
		JFrame window = new  JFrame("Buble move");
		window.setSize(800, 600);
		window.setLocation(600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NewCircle circle = new NewCircle();
		window.setContentPane(circle);
		
		circle.addKeyListener(circle);
		
		
		window.setVisible(true);
		Timer t = new Timer(1000,circle);
		t.start();
		circle.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
		// TODO Auto-generated method stub
		
	}
	
		

}
