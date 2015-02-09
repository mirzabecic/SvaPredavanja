


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewPractice extends JPanel{
	
	/**
	 * Lista boja koje korisnik moze odabrati za crtanje.
	 */
	private static Color[] palette = new Color[] {
		Color.WHITE,
		Color.BLACK,
		Color.RED,
		Color.BLUE,
		Color.GREEN,
		Color.CYAN,
		Color.MAGENTA,
		new Color(133, 7, 42),
	};
	public NewPractice(){
		super();
		for(int i = 0; i < palette.length;i++){
			JButton d = new JButton("Color");
			d.setBackground(palette[i]);
			d.setOpaque(true);
			d.setBorderPainted(true);
			d.setForeground(palette[i]);
			add(d);
			
	}
	
		
	}
	/**
	 * Velicina kvadratica u paleti boja.
	 */
	private static int colorPickerSize = 50;
	
	public static void main(String[] args) {
		PaintListener listener = new PaintListener(); 
		
		Canvas canvasPanel = new Canvas();
		canvasPanel.setBackground(Color.WHITE);
		canvasPanel.addMouseListener(listener);
		canvasPanel.addMouseMotionListener(listener);
		
		JFrame mainWindow = new JFrame("Paint+");
		mainWindow.setContentPane(canvasPanel);
		NewPractice cp = new NewPractice();
		mainWindow.add(cp);
		// postavljamo sirinu prozora tako da vidimo sve boje
		mainWindow.setSize(palette.length * colorPickerSize, 500);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}
	
	public static class PaintListener implements MouseListener, MouseMotionListener {
		private Color selectedColor = Color.RED;
		
		/**
		 * Provjerava koordinate na kojima se nalazio kursor misa i poredi
		 * s indeksima niza palette u kojem se nalaze boje iscrtane na dnu
		 * ekrana. Ako se klik poklapa s nekom pojom, stavlja tu boju u
		 * privatni atribut selectedColor.
		 * 
		 * Obratite paznju da ovdje koristimo dva privatna staticka atributa klase
		 * PainterPlus kojima imamo pristup jer je klasa PaintListener static
		 * nested klasa koja pripada klasi PaintPlus. Ako bismo klasu PaintListener
		 * izdvojili u poseban fajl, ovim atributima ne bismo imali pristup. 
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component)e.getSource();
			
			if (e.getY() >= source.getHeight() - colorPickerSize) {
				for (int i = 0; i < palette.length; i++) {
					if (e.getX() < colorPickerSize * (i+1)) {
						selectedColor = palette[i];
						
						// ako bismo ovdje zaboravili break, for petlja
						// bi se nastavila izvrsavati za ostale boje
						// a posto bi uslov bio ispunjen i za njih,
						// bila bi odabrana posljednja broja u listi, a ne
						// ona na koju je korisnik kliknuo
						break;
					}
				}				
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			
			g.setColor(selectedColor);
			
			int ovalDiameter = 10;
			g.fillOval(e.getX() - ovalDiameter/2, e.getY() - ovalDiameter/2, ovalDiameter, ovalDiameter);			
		}

		@Override
		public void mouseReleased(MouseEvent e) { }

		@Override
		public void mouseClicked(MouseEvent e) { }

		@Override
		public void mouseEntered(MouseEvent e) { }

		@Override
		public void mouseExited(MouseEvent e) { }

		@Override
		public void mouseMoved(MouseEvent e) { }
	}

	public static class Canvas extends JPanel {
		/**
		 * Crta onoliko pravougaonika razlicitih boja koliko imamo elemenata
		 * u listi palette.
		 * 
		 * Obratite paznju da je palette privatni static atribut klase PainterPlus,
		 * medutim da mu jos uvijek imamo pristup iz nested static klase Canvas.
		 * Ako bismo klasu Canvas izdvojili u poseban fajl, ne bismo vise imali pristup
		 * privatnim atributima.  
		 */
		@Override
		public void paintComponent(Graphics g) {			
			for (int i = 0; i < palette.length; i++) {
				g.setColor(palette[i]);
				g.fillRect(colorPickerSize * i, getHeight() - colorPickerSize,
				           colorPickerSize, colorPickerSize);				
			}
		}
	}

}

