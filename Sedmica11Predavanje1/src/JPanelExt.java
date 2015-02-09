import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelExt extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Circle circle = new Circle(g);
		g.setColor(Color.BLACK);
		circle.drawAt(50, 50);
		CrossedCircle crossed = new CrossedCircle(g);
		crossed.drawAt(100, 100);
	}

}
