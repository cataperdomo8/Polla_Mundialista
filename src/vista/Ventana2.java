package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Ventana2 extends JFrame{

	private Panel panelPrincipal;
	public Panel2 panelImageLlaves;
	public Panel3 panelImageGrupos;
	private JLabel etiquetas;

	public Ventana2() {
		super("_ P O L L A _ M U N D I A L I S T A _ F A S E 2_");
		setLayout(null);
		setBounds(10, 10, 1450, 680);
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
		panelPrincipal = new Panel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(0,0 , 1350, 100);
		panelPrincipal.setBackground(new Color(88, 24, 69));
		panelPrincipal.setVisible(true);
		this.add(panelPrincipal);
		
		panelImageLlaves = new Panel2("/imagen/LlavesMundial.jpeg");
		panelImageLlaves.setLayout(null);
		panelImageLlaves.setBounds(0,100, 750, 500);
		panelImageLlaves.setVisible(true);
		this.add(panelImageLlaves);
		
		panelImageGrupos = new Panel3("/imagen/grupos.JPG");
		panelImageGrupos.setLayout(null);
		panelImageGrupos.setBounds(760,100, 650, 500);
		panelImageGrupos.setVisible(true);
		this.add(panelImageGrupos);
	}

	public void inicializarEtiquetas() {
		etiquetas = new JLabel("P O L L A  M U N D I A L I S T A  F A S E 2");
		etiquetas.setBounds(0, 0, 1300, 60);
		etiquetas.setHorizontalAlignment((int) TOP_ALIGNMENT);
		etiquetas.setFont(new Font("calibri", 1, 24));
		etiquetas.setForeground(Color.white);
		panelPrincipal.add(etiquetas);

		etiquetas = new JLabel("Natalia Salas, Catalina Perdomo, Ma Alejandra Rodriguez");
		etiquetas.setBounds(0, 0, 1300, 100);
		etiquetas.setHorizontalAlignment((int) TOP_ALIGNMENT);
		etiquetas.setFont(new Font("calibri", 0, 16));
		etiquetas.setForeground(Color.white);
		panelPrincipal.add(etiquetas);
	}

}
