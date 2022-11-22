package vista;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Ventana extends JFrame{

	private Panel panelPrincipal;
	private JLabel etiquetas;
	public JButton boton0 = new JButton("Grupo A");
	public JButton boton1 = new JButton("Grupo B");
	public JButton boton2 = new JButton("Grupo C");
	public JButton boton3 = new JButton("Grupo D");
	public JButton boton4 = new JButton("Grupo E");
	public JButton boton5 = new JButton("Grupo F");
	public JButton boton6 = new JButton("Grupo G");
	public JButton boton7 = new JButton("Grupo H");

	public Ventana() {
		super("_ P O L L A_M U N D I A L I S T A_");
		setLayout(null);
		setBounds(10, 10, 1350, 680);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentes();
	}

	public void componentes() {
		inicializarPaneles();
		inicializarEtiquetas();

	}

	public void inicializarPaneles() {
		panelPrincipal = new Panel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(300,0 , 1100, 800);
		panelPrincipal.setBackground(new Color(88, 24, 69));
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
		
		this.boton0.setBounds(85, 100, 100, 30);
		this.boton0.setBackground(new Color(253, 251, 251));
		this.add(boton0);
		this.boton1.setBounds(85, 150, 100, 30);
		this.boton1.setBackground(new Color(253, 251, 251));
		this.add(boton1);
		this.boton2.setBounds(85, 200, 100, 30);
		this.boton2.setBackground(new Color(253, 251, 251));
		this.add(boton2);
		this.boton3.setBounds(85, 250, 100, 30);
		this.boton3.setBackground(new Color(253, 251, 251));
		this.add(boton3);
		this.boton4.setBounds(85, 300, 100, 30);
		this.boton4.setBackground(new Color(253, 251, 251));
		this.add(boton4);
		this.boton5.setBounds(85, 350, 100, 30);
		this.boton5.setBackground(new Color(253, 251, 251));
		this.add(boton5);
		this.boton6.setBounds(85, 400, 100, 30);
		this.boton6.setBackground(new Color(253, 251, 251));
		this.add(boton6);
		this.boton7.setBounds(85, 450, 100, 30);
		this.boton7.setBackground(new Color(253, 251, 251));
		this.add(boton7);
		
	}

}
