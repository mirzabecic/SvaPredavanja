import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

						
public class NewEx extends JPanel implements ActionListener {
	int frame = 0;
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(500, 500);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NewEx panel = new NewEx();
		window.setContentPane(panel);
		window.repaint();
		
		panel.setLocation(800,400);
		window.setVisible(true);
		Timer t = new Timer(100,panel);
		t.start();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillOval(40 - frame, 40, 40, 40);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		// TODO Auto-generated method stub
		
	}

}
