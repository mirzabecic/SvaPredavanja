import java.awt.Color;
import java.awt.Graphics;


public class RedCircle extends Circle {

	public RedCircle(Graphics g) {
		super(g);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drawAt(int locA, int locB) {
		g.setColor(Color.RED);
		super.drawAt(locA, locB);
	}
}
