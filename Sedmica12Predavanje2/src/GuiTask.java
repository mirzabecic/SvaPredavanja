import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import quicktime.app.event.MouseMoveAdapter;


public class GuiTask{
	
	public static void main(String[] args) throws AWTException {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(900, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		beMouseListener bml = new beMouseListener();
		panel.addMouseMotionListener(bml);
		frame.add(panel);
		frame.setVisible(true);
		Scanner in = new Scanner(System.in);
		Robot r = new Robot();
		while(true){
			System.out.println("Enter x,y");
			int x = in.nextInt();
			int y = in.nextInt();
			r.mouseMove(x, y);
			
		}
	}
	public static class  beMouseListener implements MouseMotionListener{
		
		
			public beMouseListener(){
				
			}
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("X coordinate is =" + x);
			System.out.println("Y coordinate is =" + y);
			
		}
		
	}

}
