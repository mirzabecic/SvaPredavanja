import javax.swing.JFrame;


public class Play {
public static void main(String[] args) {
	JFrame window = new JFrame("Play");
	
	
	window.setSize(500, 500);
	GameGraphics panel = new GameGraphics();
	window.setContentPane(panel);
	window.setVisible(true);
}
}
