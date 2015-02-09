import java.awt.Color;
import java.awt.Graphics;


public class CrossedCircle  extends Circle{

	public CrossedCircle(Graphics g) {
		super(g);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drawAt(int locA, int locB) {
		super.drawAt(locA, locB);
		Color previousColor = g.getColor();
		g.setColor(Color.WHITE);
		g.drawLine(locA - size/2, locB - size/2, locA + size/2, locB + size/2);
		g.drawLine(locA + size/2, locB - size/2, locA - size/2, locB + size/2);
		g.setColor(previousColor);
			
	}

}
