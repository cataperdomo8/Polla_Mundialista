package vista;

import javax.swing.*;

import controlador.Controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{

	private Controller c;

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
	private JLabel partido1;
	private JLabel partido2;
	private JLabel partido3;
	private JLabel partido4;
	private JLabel partido5;
	private JLabel partido6;

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
	public JTextField textFieldGA3=new JTextField();
	public JTextField textFieldGA4=new JTextField();
	public JTextField textFieldGA5=new JTextField();
	public JTextField textFieldGA6=new JTextField();
	public JTextField textFieldGA7=new JTextField();
	public JTextField textFieldGA8=new JTextField();
	public JTextField textFieldGA9=new JTextField();
	public JTextField textFieldGA10=new JTextField();
	public JTextField textFieldGA11=new JTextField();
	public JTextField textFieldGA12=new JTextField();
	
	public JTextField textFieldGB1=new JTextField();
	public JTextField textFieldGB2=new JTextField();
	public JTextField textFieldGB3=new JTextField();
	public JTextField textFieldGB4=new JTextField();
	public JTextField textFieldGB5=new JTextField();
	public JTextField textFieldGB6=new JTextField();
	public JTextField textFieldGB7=new JTextField();
	public JTextField textFieldGB8=new JTextField();
	public JTextField textFieldGB9=new JTextField();
	public JTextField textFieldGB10=new JTextField();
	public JTextField textFieldGB11=new JTextField();
	public JTextField textFieldGB12=new JTextField();
	
	public JTextField textFieldGC1=new JTextField();
	public JTextField textFieldGC2=new JTextField();
	public JTextField textFieldGC3=new JTextField();
	public JTextField textFieldGC4=new JTextField();
	public JTextField textFieldGC5=new JTextField();
	public JTextField textFieldGC6=new JTextField();
	public JTextField textFieldGC7=new JTextField();
	public JTextField textFieldGC8=new JTextField();
	public JTextField textFieldGC9=new JTextField();
	public JTextField textFieldGC10=new JTextField();
	public JTextField textFieldGC11=new JTextField();
	public JTextField textFieldGC12=new JTextField();
	
	public JTextField textFieldGD1=new JTextField();
	public JTextField textFieldGD2=new JTextField();
	public JTextField textFieldGD3=new JTextField();
	public JTextField textFieldGD4=new JTextField();
	public JTextField textFieldGD5=new JTextField();
	public JTextField textFieldGD6=new JTextField();
	public JTextField textFieldGD7=new JTextField();
	public JTextField textFieldGD8=new JTextField();
	public JTextField textFieldGD9=new JTextField();
	public JTextField textFieldGD10=new JTextField();
	public JTextField textFieldGD11=new JTextField();
	public JTextField textFieldGD12=new JTextField();
	
	public JTextField textFieldGE1=new JTextField();
	public JTextField textFieldGE2=new JTextField();
	public JTextField textFieldGE3=new JTextField();
	public JTextField textFieldGE4=new JTextField();
	public JTextField textFieldGE5=new JTextField();
	public JTextField textFieldGE6=new JTextField();
	public JTextField textFieldGE7=new JTextField();
	public JTextField textFieldGE8=new JTextField();
	public JTextField textFieldGE9=new JTextField();
	public JTextField textFieldGE10=new JTextField();
	public JTextField textFieldGE11=new JTextField();
	public JTextField textFieldGE12=new JTextField();
	
	public JTextField textFieldGF1=new JTextField();
	public JTextField textFieldGF2=new JTextField();
	public JTextField textFieldGF3=new JTextField();
	public JTextField textFieldGF4=new JTextField();
	public JTextField textFieldGF5=new JTextField();
	public JTextField textFieldGF6=new JTextField();
	public JTextField textFieldGF7=new JTextField();
	public JTextField textFieldGF8=new JTextField();
	public JTextField textFieldGF9=new JTextField();
	public JTextField textFieldGF10=new JTextField();
	public JTextField textFieldGF11=new JTextField();
	public JTextField textFieldGF12=new JTextField();
	
	public JTextField textFieldGG1=new JTextField();
	public JTextField textFieldGG2=new JTextField();
	public JTextField textFieldGG3=new JTextField();
	public JTextField textFieldGG4=new JTextField();
	public JTextField textFieldGG5=new JTextField();
	public JTextField textFieldGG6=new JTextField();
	public JTextField textFieldGG7=new JTextField();
	public JTextField textFieldGG8=new JTextField();
	public JTextField textFieldGG9=new JTextField();
	public JTextField textFieldGG10=new JTextField();
	public JTextField textFieldGG11=new JTextField();
	public JTextField textFieldGG12=new JTextField();
	
	public JTextField textFieldGH1=new JTextField();
	public JTextField textFieldGH2=new JTextField();
	public JTextField textFieldGH3=new JTextField();
	public JTextField textFieldGH4=new JTextField();
	public JTextField textFieldGH5=new JTextField();
	public JTextField textFieldGH6=new JTextField();
	public JTextField textFieldGH7=new JTextField();
	public JTextField textFieldGH8=new JTextField();
	public JTextField textFieldGH9=new JTextField();
	public JTextField textFieldGH10=new JTextField();
	public JTextField textFieldGH11=new JTextField();
	public JTextField textFieldGH12=new JTextField();
	
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
		inicializarGC();
		inicializarGD();
		inicializarGE();
		inicializarGF();
		inicializarGG();
		inicializarGH();

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

	public void inicializarGA(){
		partido1 = new JLabel("Qatar                                                    Ecuador");
		partido2 = new JLabel("Senegal                                                Holanda");
		partido3 = new JLabel("Holanda                                               Ecuador");
		partido4 = new JLabel("Qatar                                                    Senegal");
		partido5 = new JLabel("Ecuador                                                Senegal");
		partido6 = new JLabel("Holanda                                                Qatar");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGA.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGA.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGA.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGA.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGA.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGA.add(partido6);
		
		textFieldGA1.setBounds(375, 45,40,20);
		panelGA.add(textFieldGA1);
		textFieldGA2.setBounds(550, 45,40,20);
		panelGA.add(textFieldGA2);
		
		textFieldGA3.setBounds(375, 90,40,20);
		panelGA.add(textFieldGA3);
        textFieldGA4.setBounds(550, 90,40,20);
		panelGA.add(textFieldGA4);
		
		textFieldGA5.setBounds(375, 130,40,20);
		panelGA.add(textFieldGA5);
        textFieldGA6.setBounds(550, 130,40,20);
		panelGA.add(textFieldGA6);
		
		textFieldGA7.setBounds(375, 170,40,20);
		panelGA.add(textFieldGA7);
        textFieldGA8.setBounds(550, 170,40,20);
		panelGA.add(textFieldGA8);
		
		textFieldGA9.setBounds(375, 210,40,20);
		panelGA.add(textFieldGA9);
        textFieldGA10.setBounds(550, 210,40,20);
		panelGA.add(textFieldGA10);
		
		textFieldGA11.setBounds(375, 250,40,20);
		panelGA.add(textFieldGA11);
        textFieldGA12.setBounds(550, 250,40,20);
		panelGA.add(textFieldGA12);
		
	}

	public void inicializarGB(){
		partido1 = new JLabel("Inglaterra                                           Iran");
		partido2 = new JLabel("USA                                                    Gales");
		partido3 = new JLabel("Gales                                                  Iran");
		partido4 = new JLabel("Inglaterra                                           USA");
		partido5 = new JLabel("Iran                                                     USA");
		partido6 = new JLabel("Gales                                                  Inglaterra");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGB.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGB.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGB.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGB.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGB.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGB.add(partido6);
		
		textFieldGB1.setBounds(382, 45,40,20);
		panelGB.add(textFieldGB1);
		textFieldGB2.setBounds(550, 45,40,20);
		panelGB.add(textFieldGB2);
		
		textFieldGB3.setBounds(382, 90,40,20);
		panelGB.add(textFieldGB3);
        textFieldGB4.setBounds(550, 90,40,20);
		panelGB.add(textFieldGB4);
		
		textFieldGB5.setBounds(382, 130,40,20);
		panelGB.add(textFieldGB5);
        textFieldGB6.setBounds(550, 130,40,20);
		panelGB.add(textFieldGB6);
		
		textFieldGB7.setBounds(382, 170,40,20);
		panelGB.add(textFieldGB7);
        textFieldGB8.setBounds(550, 170,40,20);
		panelGB.add(textFieldGB8);
		
		textFieldGB9.setBounds(382, 210,40,20);
		panelGB.add(textFieldGB9);
        textFieldGB10.setBounds(550, 210,40,20);
		panelGB.add(textFieldGB10);
		
		textFieldGB11.setBounds(382, 250,40,20);
		panelGB.add(textFieldGB11);
        textFieldGB12.setBounds(550, 250,40,20);
		panelGB.add(textFieldGB12);
		
	}
	
	public void inicializarGC(){
		
		partido1 = new JLabel("Argentina                                           Arabia");
		partido2 = new JLabel("Mexico                                               Polonia");
		partido3 = new JLabel("Polonia                                               Arabia");
		partido4 = new JLabel("Argentina                                           Mexico");
		partido5 = new JLabel("Polonia                                               Argentina");
		partido6 = new JLabel("Arabia                                                Mexico");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGC.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGC.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGC.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGC.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGC.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGC.add(partido6);
		
		textFieldGC1.setBounds(382, 45,40,20);
		panelGC.add(textFieldGC1);
		textFieldGC2.setBounds(550, 45,40,20);
		panelGC.add(textFieldGC2);
		
		textFieldGC3.setBounds(382, 90,40,20);
		panelGC.add(textFieldGC3);
        textFieldGC4.setBounds(550, 90,40,20);
		panelGC.add(textFieldGC4);
		
		textFieldGC5.setBounds(382, 130,40,20);
		panelGC.add(textFieldGC5);
        textFieldGC6.setBounds(550, 130,40,20);
		panelGC.add(textFieldGC6);
		
		textFieldGC7.setBounds(382, 170,40,20);
		panelGC.add(textFieldGC7);
		textFieldGC8.setBounds(550, 170,40,20);
		panelGC.add(textFieldGC8);
		
		textFieldGC9.setBounds(382, 210,40,20);
		panelGC.add(textFieldGC9);
        textFieldGC10.setBounds(550, 210,40,20);
		panelGC.add(textFieldGC10);
		
		textFieldGC11.setBounds(382, 250,40,20);
		panelGC.add(textFieldGC11);
        textFieldGC12.setBounds(550, 250,40,20);
		panelGC.add(textFieldGC12);
		
		
	}
	
	public void inicializarGD(){
		
		partido1 = new JLabel("Dinamarca                                         Tunez");
		partido2 = new JLabel("Francia                                               Australia");
		partido3 = new JLabel("Túnez                                                 Australia");
		partido4 = new JLabel("Francia                                               Dinamarca");
		partido5 = new JLabel("Australia                                            Dinamarca");
		partido6 = new JLabel("Túnez                                                 Francia");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGD.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGD.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGD.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGD.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGD.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGD.add(partido6);
		
		textFieldGD1.setBounds(388, 45,40,20);
		panelGD.add(textFieldGD1);
		textFieldGD2.setBounds(550, 45,40,20);
		panelGD.add(textFieldGD2);
		
		textFieldGD3.setBounds(388, 90,40,20);
		panelGD.add(textFieldGD3);
        textFieldGD4.setBounds(550, 90,40,20);
		panelGD.add(textFieldGD4);
		
		textFieldGD5.setBounds(388, 130,40,20);
		panelGD.add(textFieldGD5);
        textFieldGD6.setBounds(550, 130,40,20);
		panelGD.add(textFieldGD6);
		
		textFieldGD7.setBounds(388, 170,40,20);
		panelGD.add(textFieldGD7);
        textFieldGD8.setBounds(550, 170,40,20);
		panelGD.add(textFieldGD8);
		
		textFieldGD9.setBounds(388, 210,40,20);
		panelGD.add(textFieldGD9);
        textFieldGD10.setBounds(550, 210,40,20);
		panelGD.add(textFieldGD10);
		
		textFieldGD11.setBounds(388, 250,40,20);
		panelGD.add(textFieldGD11);
        textFieldGD12.setBounds(550, 250,40,20);
		panelGD.add(textFieldGD12);
		
	}
	
	public void inicializarGE(){
		
		partido1 = new JLabel("Alemania                                            Japon");
		partido2 = new JLabel("España                                               Costa rica");
		partido3 = new JLabel("Japon                                                 Costa rica");
		partido4 = new JLabel("España                                               Alemania");
		partido5 = new JLabel("Costa Rica                                          Alemania");
		partido6 = new JLabel("Japon                                                 España");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGE.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGE.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGE.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGE.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGE.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGE.add(partido6);
		
		textFieldGE1.setBounds(387, 45,40,20);
		panelGE.add(textFieldGE1);
		textFieldGE2.setBounds(550, 45,40,20);
		panelGE.add(textFieldGE2);
		
		textFieldGE3.setBounds(387, 90,40,20);
		panelGE.add(textFieldGE3);
        textFieldGE4.setBounds(550, 90,40,20);
		panelGE.add(textFieldGE4);
		
		textFieldGE5.setBounds(387, 130,40,20);
		panelGE.add(textFieldGE5);
        textFieldGE6.setBounds(550, 130,40,20);
		panelGE.add(textFieldGE6);
		
		textFieldGE7.setBounds(387, 170,40,20);
		panelGE.add(textFieldGE7);
        textFieldGE8.setBounds(550, 170,40,20);
		panelGE.add(textFieldGE8);
		
		textFieldGE9.setBounds(387, 210,40,20);
		panelGE.add(textFieldGE9);
        textFieldGE10.setBounds(550, 210,40,20);
		panelGE.add(textFieldGE10);
		
		textFieldGE11.setBounds(387, 250,40,20);
		panelGE.add(textFieldGE11);
        textFieldGE12.setBounds(550, 250,40,20);
		panelGE.add(textFieldGE12);
		
		
	}
	
	
	public void inicializarGF(){
		
		partido1 = new JLabel("Marruecos                                         Croacia");
		partido2 = new JLabel("Belgica                                               Canada");
		partido3 = new JLabel("Belgica                                               Marruecos");
		partido4 = new JLabel("Croacia                                              Canada");
		partido5 = new JLabel("Canada                                              Marruecos");
		partido6 = new JLabel("Croacia                                              Belgica");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGF.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGF.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGF.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGF.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGF.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGF.add(partido6);
		
		textFieldGF1.setBounds(388, 45,40,20);
		panelGF.add(textFieldGF1);
		textFieldGF2.setBounds(550, 45,40,20);
		panelGF.add(textFieldGF2);
		
		textFieldGF3.setBounds(388, 90,40,20);
		panelGF.add(textFieldGF3);
        textFieldGF4.setBounds(550, 90,40,20);
		panelGF.add(textFieldGF4);
		
		textFieldGF5.setBounds(388, 130,40,20);
		panelGF.add(textFieldGF5);
        textFieldGF6.setBounds(550, 130,40,20);
		panelGF.add(textFieldGF6);
		
		textFieldGF7.setBounds(388, 170,40,20);
		panelGF.add(textFieldGF7);
        textFieldGF8.setBounds(550, 170,40,20);
		panelGF.add(textFieldGF8);
		
		textFieldGF9.setBounds(388, 210,40,20);
		panelGF.add(textFieldGF9);
        textFieldGF10.setBounds(550, 210,40,20);
		panelGF.add(textFieldGF10);
		
		textFieldGF11.setBounds(388, 250,40,20);
		panelGF.add(textFieldGF11);
        textFieldGF12.setBounds(550, 250,40,20);
		panelGF.add(textFieldGF12);
		
	}
	
	public void inicializarGG(){
		
		partido1 = new JLabel("Suiza                                                  Camerún");
		partido2 = new JLabel("Brasil                                                  Serbia");
		partido3 = new JLabel("Camerun                                            Serbia");
		partido4 = new JLabel("Brasil                                                  Suiza");
		partido5 = new JLabel("Serbia                                                 Suiza");
		partido6 = new JLabel("Camerun                                            Brasil");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGG.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGG.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGG.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGG.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGG.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGG.add(partido6);
		
		textFieldGG1.setBounds(382, 45,40,20);
		panelGG.add(textFieldGG1);
		textFieldGG2.setBounds(550, 45,40,20);
		panelGG.add(textFieldGG2);
		
		textFieldGG3.setBounds(382, 90,40,20);
		panelGG.add(textFieldGG3);
        textFieldGG4.setBounds(550, 90,40,20);
		panelGG.add(textFieldGG4);
		
		textFieldGG5.setBounds(382, 130,40,20);
		panelGG.add(textFieldGG5);
        textFieldGG6.setBounds(550, 130,40,20);
		panelGG.add(textFieldGG6);
		
		textFieldGG7.setBounds(382, 170,40,20);
		panelGG.add(textFieldGG7);
        textFieldGG8.setBounds(550, 170,40,20);
		panelGG.add(textFieldGG8);
		
		textFieldGG9.setBounds(382, 210,40,20);
		panelGG.add(textFieldGG9);
        textFieldGG10.setBounds(550, 210,40,20);
		panelGG.add(textFieldGG10);
		
		textFieldGG11.setBounds(382, 250,40,20);
		panelGG.add(textFieldGG11);
        textFieldGG12.setBounds(550, 250,40,20);
		panelGG.add(textFieldGG12);
		
	}
	
	public void inicializarGH(){
		

		partido1 = new JLabel("Uruguay                                             Corea");
		partido2 = new JLabel("Portugal                                             Ghana");
		partido3 = new JLabel("Corea                                                 Ghana");
		partido4 = new JLabel("Portugal                                             Uruguay");
		partido5 = new JLabel("Ghana                                                Uruguay");
		partido6 = new JLabel("Corea                                                 Portugal");
		
		partido1.setBounds(300, 30, 1100, 60);
		partido1.setFont(new Font("calibri", 0, 20));
		partido1.setForeground(Color.white);
		panelGH.add(partido1);

		partido2.setBounds(300, 70, 1100, 60);
		partido2.setFont(new Font("calibri", 0, 20));
		partido2.setForeground(Color.white);
		panelGH.add(partido2);
		
		partido3.setBounds(300, 110, 1100, 60);
		partido3.setFont(new Font("calibri", 0, 20));
		partido3.setForeground(Color.white);
		panelGH.add(partido3);
		
		partido4.setBounds(300, 150, 1100, 60);
		partido4.setFont(new Font("calibri", 0, 20));
		partido4.setForeground(Color.white);
		panelGH.add(partido4);
		
		partido5.setBounds(300, 190, 1100, 60);
		partido5.setFont(new Font("calibri", 0, 20));
		partido5.setForeground(Color.white);
		panelGH.add(partido5);
		
		partido6.setBounds(300, 230, 1100, 60);
		partido6.setFont(new Font("calibri", 0, 20));
		partido6.setForeground(Color.white);
		panelGH.add(partido6);
		
		textFieldGH1.setBounds(382, 45,40,20);
		panelGH.add(textFieldGH1);
		textFieldGH2.setBounds(550, 45,40,20);
		panelGH.add(textFieldGH2);
		
		textFieldGH3.setBounds(382, 90,40,20);
		panelGH.add(textFieldGH3);
        textFieldGH4.setBounds(550, 90,40,20);
		panelGH.add(textFieldGH4);
		
		textFieldGH5.setBounds(382, 130,40,20);
		panelGH.add(textFieldGH5);
        textFieldGH6.setBounds(550, 130,40,20);
		panelGH.add(textFieldGH6);
		
		textFieldGH7.setBounds(382, 170,40,20);
		panelGH.add(textFieldGH7);
        textFieldGH8.setBounds(550, 170,40,20);
		panelGH.add(textFieldGH8);
		
		textFieldGH9.setBounds(382, 210,40,20);
		panelGH.add(textFieldGH9);
        textFieldGH10.setBounds(550, 210,40,20);
		panelGH.add(textFieldGH10);
		
		textFieldGH11.setBounds(382, 250,40,20);
		panelGH.add(textFieldGH11);
        textFieldGH12.setBounds(550, 250,40,20);
		panelGH.add(textFieldGH12);
		
	}

	//Recibe el controlador y se lo entrega al boton.
	public void setController(Controller cont){
		this.c = cont;
		this.boton0.addActionListener(this.c);
		this.boton1.addActionListener(this.c);
		this.boton2.addActionListener(this.c);
		this.boton3.addActionListener(this.c);
		this.boton4.addActionListener(this.c);
		this.boton5.addActionListener(this.c);
		this.boton6.addActionListener(this.c);
		this.boton7.addActionListener(this.c);
	}

	public JButton getBoton0() {
		return boton0;
	}

	public void setBoton0(JButton boton0) {
		this.boton0 = boton0;
	}

	public JButton getBoton1() {
		return boton1;
	}

	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public void setBoton4(JButton boton4) {
		this.boton4 = boton4;
	}

	public JButton getBoton5() {
		return boton5;
	}

	public void setBoton5(JButton boton5) {
		this.boton5 = boton5;
	}

	public JButton getBoton6() {
		return boton6;
	}

	public void setBoton6(JButton boton6) {
		this.boton6 = boton6;
	}

	public JButton getBoton7() {
		return boton7;
	}

	public void setBoton7(JButton boton7) {
		this.boton7 = boton7;
	}

	public Panel getPanelGA() {
		return panelGA;
	}

	public void setPanelGA(Panel panelGA) {
		this.panelGA = panelGA;
	}

	public Panel getPanelGB() {
		return panelGB;
	}

	public void setPanelGB(Panel panelGB) {
		this.panelGB = panelGB;
	}

	public Panel getPanelGC() {
		return panelGC;
	}

	public void setPanelGC(Panel panelGC) {
		this.panelGC = panelGC;
	}

	public Panel getPanelGD() {
		return panelGD;
	}

	public void setPanelGD(Panel panelGD) {
		this.panelGD = panelGD;
	}

	public Panel getPanelGE() {
		return panelGE;
	}

	public void setPanelGE(Panel panelGE) {
		this.panelGE = panelGE;
	}

	public Panel getPanelGF() {
		return panelGF;
	}

	public void setPanelGF(Panel panelGF) {
		this.panelGF = panelGF;
	}

	public Panel getPanelGG() {
		return panelGG;
	}

	public void setPanelGG(Panel panelGG) {
		this.panelGG = panelGG;
	}

	public Panel getPanelGH() {
		return panelGH;
	}

	public void setPanelGH(Panel panelGH) {
		this.panelGH = panelGH;
	}

}