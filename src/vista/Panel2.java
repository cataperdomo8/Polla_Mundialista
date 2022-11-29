package vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel2 extends JPanel{
	private Image llaves = new ImageIcon(getClass().getResource("/imagen/LlavesMundial.jpeg")).getImage();

	public void paint(Graphics g) {
		g.drawImage(llaves, 20,20 , 500, 400, this);
		setOpaque(false);
	}

}
