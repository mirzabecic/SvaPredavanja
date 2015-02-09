import java.awt.Graphics;




public class Circle {
	protected int size = 50;
	
		Graphics g;
		public Circle (Graphics g){
			this.g = g;
			
		}
		public void drawAt(int locA, int locB){
			g.fillOval(locA-25, locB-25, 50, 50);
			
		}
	
	

}
