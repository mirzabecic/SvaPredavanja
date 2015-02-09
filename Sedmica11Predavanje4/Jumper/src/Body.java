import java.awt.Color;
import java.awt.Graphics;


public class Body {
	private Point start;
	private Point center;
	private int width;
	private int height;
	private Color color;
	private int speedX;
	private int speedY;
	
	public Body ( int x, int y, int width, int height,Color color, int speedX, int speedY){
		this.start = new Point(x, y);
		this.width = width;
		this.height = height;
		this.color = color;
		this.center = new Point(x + width / 2, y + height / 2);
		this.speedX = speedX;
		this.speedY = speedY;
		
				
	}
	public void draw(Graphics g){
		move();
		g.setColor(color);
		return;
		
	}
	public boolean checkColision(Body other){
		int dX = this.width/2 + other.width/2;
		int dY = this.height/2 + other.height/2;
		if(this.center.getDistance(center) > dX && this.center.getDistance(center) > dY	)
			return false;
		return true;
	}
	
	
	public Point getStart() {
		return start;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	private void move(){
		this.start.move(speedX, speedY);
		this.center.move(speedX, speedY);
		
	}
	public int getX(){
		return start.getX();
	}
	public int getY(){
		return start.getY();
	}
	

}
