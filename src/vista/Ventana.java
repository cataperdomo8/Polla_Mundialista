package vista;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{
	
	private Panel panelPrincipal;
	private Panel panelGA;
	private Panel panelGB;
	private Panel panelGC;
	private Panel panelGD;
	private Panel panelGE;
	private Panel panelGF;
	private Panel panelGG;
	private Panel panelGH;
	
	private JLabel etiquetas;
	private JLabel equipo1;
	private JLabel equipo2;
	
	public JButton boton0 = new JButton("Grupo A");
	public JButton boton1 = new JButton("Grupo B");
	public JButton boton2 = new JButton("Grupo C");
	public JButton boton3 = new JButton("Grupo D");
	public JButton boton4 = new JButton("Grupo E");
	public JButton boton5 = new JButton("Grupo F");
	public JButton boton6 = new JButton("Grupo G");
	public JButton boton7 = new JButton("Grupo H");
	
	public JTextField textFieldGA1=new JTextField();
	public JTextField textFieldGA2=new JTextField();
	public JTextField textFieldGB1=new JTextField();
	public JTextField textFieldGB2=new JTextField();

	public Ventana() {
		super("_ P O L L A_M U N D I A L I S T A_");
		setLayout(null);
		setBounds(10, 10, 1350, 680);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(88, 24, 69));
		componentes();
	}

	public void componentes() {
		inicializarPaneles();
		inicializarEtiquetas();
		inicializarGA();
		inicializarGB();

	}

	public void inicializarPaneles() {
		panelPrincipal = new Panel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(300,0 , 1100, 100);
		panelPrincipal.setBackground(new Color(88, 24, 69));
		panelPrincipal.setVisible(true);
		this.add(panelPrincipal);
		
		panelGA = new Panel();
		panelGA.setLayout(null);
		panelGA.setBounds(300,100, 1100, 800);
		panelGA.setBackground(new Color(88, 24, 69));
		panelGA.setVisible(false);
		this.add(panelGA);
		
		panelGB = new Panel();
		panelGB.setLayout(null);
		panelGB.setBounds(300,100, 1100, 800);
		panelGB.setBackground(new Color(88, 24, 69));
		panelGB.setVisible(false);
		this.add(panelGB);
		
		panelGC = new Panel();
		panelGC.setLayout(null);
		panelGC.setBounds(300,100, 1100, 800);
		panelGC.setBackground(new Color(88, 24, 69));
		panelGC.setVisible(false);
		this.add(panelGC);
		
		panelGD = new Panel();
		panelGD.setLayout(null);
		panelGD.setBounds(300,100, 1100, 800);
		panelGD.setBackground(new Color(88, 24, 69));
		panelGD.setVisible(false);
		this.add(panelGD);
		
		panelGE = new Panel();
		panelGE.setLayout(null);
		panelGE.setBounds(300,100, 1100, 800);
		panelGE.setBackground(new Color(88, 24, 69));
		panelGE.setVisible(false);
		this.add(panelGE);
		
		panelGF = new Panel();
		panelGF.setLayout(null);
		panelGF.setBounds(300,100, 1100, 800);
		panelGF.setBackground(new Color(88, 24, 69));
		panelGF.setVisible(false);
		this.add(panelGF);
		
		panelGG = new Panel();
		panelGG.setLayout(null);
		panelGG.setBounds(300,100, 1100, 800);
		panelGG.setBackground(new Color(88, 24, 69));
		panelGG.setVisible(false);
		this.add(panelGG);
		
		panelGH = new Panel();
		panelGH.setLayout(null);
		panelGH.setBounds(300,100, 1100, 800);
		panelGH.setBackground(new Color(88, 24, 69));
		panelGH.setVisible(false);
		this.add(panelGH);
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
		this.boton0.addActionListener(this);
		
		this.boton1.setBounds(85, 150, 100, 30);
		this.boton1.setBackground(new Color(253, 251, 251));
		this.add(boton1);
		this.boton1.addActionListener(this);
		
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
	
	public void inicializarGA(){
		equipo1 = new JLabel("Qatar");
	    equipo2 = new JLabel("Ecuador");
	    
	    
	    equipo1.setBounds(300, 30, 1100, 60);
	    equipo1.setFont(new Font("calibri", 0, 20));
	    equipo1.setForeground(Color.white);
	    panelGA.add(equipo1);
	    
	    equipo2.setBounds(600, 30, 1100, 60);
	    equipo2.setFont(new Font("calibri", 0, 20));
	    equipo2.setForeground(Color.white);
	    panelGA.add(equipo2);
	    
	    textFieldGA1.setBounds(370, 45,40,20);
	    panelGA.add(textFieldGA1);
	    
	    textFieldGA2.setBounds(550, 45,40,20);
	    panelGA.add(textFieldGA2);
	}
	
	public void inicializarGB(){
		equipo1 = new JLabel("Inglaterra");
	    equipo2 = new JLabel("Iran");
	    
	    equipo1.setBounds(280, 30, 1100, 60);
	    equipo1.setFont(new Font("calibri", 0, 20));
	    equipo1.setForeground(Color.white);
	    panelGB.add(equipo1);
	    
	    equipo2.setBounds(600, 30, 1100, 60);
	    equipo2.setFont(new Font("calibri", 0, 20));
	    equipo2.setForeground(Color.white);
	    panelGB.add(equipo2);
	    
	    textFieldGB1.setBounds(370, 45,40,20);
	    panelGB.add(textFieldGB1);
	    
	    textFieldGB2.setBounds(550, 45,40,20);
	    panelGB.add(textFieldGB2);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton0) {
			panelGA.setVisible(true);
			panelGB.setVisible(false);
			panelGC.setVisible(false);
			panelGD.setVisible(false);
			panelGE.setVisible(false);
			panelGF.setVisible(false);
			panelGG.setVisible(false);
			panelGH.setVisible(false);
		}else if (e.getSource()==boton1) {
			panelGA.setVisible(false);
			panelGB.setVisible(true);
			panelGC.setVisible(false);
			panelGD.setVisible(false);
			panelGE.setVisible(false);
			panelGF.setVisible(false);
			panelGG.setVisible(false);
			panelGH.setVisible(false);
		}
		
	}


}
