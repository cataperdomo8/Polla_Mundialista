package vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel3 extends JPanel{
	ImageIcon imagen;
	String nombre;
	public Panel3(String nombre) {
		this.nombre=nombre;
	}
	public void paint(Graphics g) {
		imagen=new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(), 0,0 ,  getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}

}
