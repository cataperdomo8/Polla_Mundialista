package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana2 extends JFrame{

	private Panel2 panelPrincipal;
	private JLabel etiquetas;

	public Ventana2() {
		super("_ P O L L A _ M U N D I A L I S T A _ F A S E 2_");
		setLayout(null);
		setBounds(10, 10, 1450, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(88, 24, 69));
		componentes();
	}

	public void componentes() {
		inicializarPaneles();
		inicializarEtiquetas();
	}

	public void inicializarPaneles() {
		panelPrincipal = new Panel2();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(10,10 , 1450, 800);
		panelPrincipal.setVisible(true);
		this.add(panelPrincipal);
	}

	public void inicializarEtiquetas() {
		etiquetas = new JLabel("P O L L A M U N D I A L I S T A");
		etiquetas.setBounds(0, 0, 1000, 60);
		etiquetas.setHorizontalAlignment((int) TOP_ALIGNMENT);
		etiquetas.setFont(new Font("calibri", 1, 24));
		etiquetas.setForeground(Color.white);
		panelPrincipal.add(etiquetas);

		etiquetas = new JLabel("Natalia Salas, Catalina Perdomo, Ma Alejandra Rodriguez");
		etiquetas.setBounds(0, 0, 1000, 100);
		etiquetas.setHorizontalAlignment((int) TOP_ALIGNMENT);
		etiquetas.setFont(new Font("calibri", 0, 16));
		etiquetas.setForeground(Color.white);
		panelPrincipal.add(etiquetas);
	}

}
