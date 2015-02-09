import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class Circle {
	private Color color;
	private int x;
	private int y;
	private int radius;
	private boolean isFill;
	private int speedX;
	private int speedY;
	private Dimension windowDimension;
	
	public Circle(int x, int y, int radius, boolean isFill, Color color,int speedX, int speedY, Dimension windowDimension){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFill = isFill;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDimension = windowDimension;
		
	}
	public void draw(Graphics g){
		
		move();
		
		g.setColor(color);
		if(isFill == true){
			
			g.fillOval(x, y, radius, radius);
		}
		else 
			g.drawOval(x, y, radius, radius);
		
	}
	private void move(){
		if (x < 0  || x + radius >= windowDimension.getWidth()){
			speedX *= -1;
		}
		//24 pixela je razlika izmedju panela i framea
		if(y < 0 ||  y + radius + 24>= windowDimension.getHeight()){
			speedY *= -1;
		}
		
		x = x + speedX;
		y = y + speedY;
	}
	public void checkColision(Circle other){
		int temp = other.x + other.radius;
		if (temp >= this.x){
			speedX *= -1;
			//other.speedX *= -1;
		}
		temp = this.x + this.radius;
		if(temp >= other.x){
			speedX *= -1;
			//other.speedX *= -1;
		}
		temp = other.y + other.radius;
		if (temp >= this.y){
			speedY *= -1;
			//other.speedY *= -1;
		}
		temp = this.y + this.radius;
		if(temp >= other.y){
			speedY *= -1;
			//other.speedY *= -1;
		}
	}
	}
	