import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import sun.awt.RepaintArea;


public class SupposedToBeEasy extends JPanel implements ActionListener{
	int frame = 5;
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Mumijevi");
		window.setSize(500, 500);
		
		window.setLocation(800, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jesenko drawPanel = new Jesenko(window.getSize());
		window.setContentPane(drawPanel);
		drawPanel.repaint();
		
		window.setVisible(true);
		Timer t = new Timer(10,drawPanel);
		t.start();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillOval(50 + frame , 50 + frame, 50, 50);
		nestoNesto(g);
		
		
	}
	public void nestoNesto (Graphics graphics){
		graphics.setColor(Color.RED);
		graphics.fillRect(100 + 100, 100 - frame, 100, 100);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		// TODO Auto-generated method stub
		
	}
	
		
		
	

}
