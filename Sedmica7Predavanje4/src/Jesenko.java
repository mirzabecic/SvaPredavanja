import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

 
public class Jesenko extends JPanel implements ActionListener {
	Dimension windowSize;
	Circle krug;
	Circle krug1;
	public Jesenko(Dimension windowSize){
		this.windowSize = windowSize;
		   krug = new Circle(60,60,60,true,Color.RED, 1, 2, windowSize );
		   krug1 = new Circle(120,120,60,false,Color.BLUE, 2, 1, windowSize);
	}
	

   
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		krug.checkColision(krug1);
		krug.draw(g);
		krug1.draw(g);
		//g.setColor(Color.BLACK);
		//g.fillRect(40 + frame, 40 + frame, 40, 40);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//frame++;
		repaint();
		// TODO Auto-generated method stub
		
	}
	

}