package vista;

import javax.swing.*;

import controlador.Controller;

import java.awt.Color;
import java.awt.Font;

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
	private JLabel titulo;

	public JButton boton0 = new JButton("Grupo A");
	public JButton boton1 = new JButton("Grupo B");
	public JButton boton2 = new JButton("Grupo C");
	public JButton boton3 = new JButton("Grupo D");
	public JButton boton4 = new JButton("Grupo E");
	public JButton boton5 = new JButton("Grupo F");
	public JButton boton6 = new JButton("Grupo G");
	public JButton boton7 = new JButton("Grupo H");
	public JButton bSiguienteFase = new JButton("Siguiente Fase");

	public JTextField textFieldGA1=new JTextField("0");
	public JTextField textFieldGA2=new JTextField("2");
	public JTextField textFieldGA3=new JTextField("1");
	public JTextField textFieldGA4=new JTextField("1");
	public JTextField textFieldGA5=new JTextField("2");
	public JTextField textFieldGA6=new JTextField("2");
	public JTextField textFieldGA7=new JTextField("3");
	public JTextField textFieldGA8=new JTextField("1");
	public JTextField textFieldGA9=new JTextField("3");
	public JTextField textFieldGA10=new JTextField("1");
	public JTextField textFieldGA11=new JTextField("2");
	public JTextField textFieldGA12=new JTextField("1");

	public JTextField textFieldGB1=new JTextField("6");
	public JTextField textFieldGB2=new JTextField("2");
	public JTextField textFieldGB3=new JTextField("2");
	public JTextField textFieldGB4=new JTextField("2");
	public JTextField textFieldGB5=new JTextField("3");
	public JTextField textFieldGB6=new JTextField("1");
	public JTextField textFieldGB7=new JTextField("0");
	public JTextField textFieldGB8=new JTextField("0");
	public JTextField textFieldGB9=new JTextField("2");
	public JTextField textFieldGB10=new JTextField("0");
	public JTextField textFieldGB11=new JTextField("3");
	public JTextField textFieldGB12=new JTextField("3");

	public JTextField textFieldGC1=new JTextField("0");
	public JTextField textFieldGC2=new JTextField("0");
	public JTextField textFieldGC3=new JTextField("3");
	public JTextField textFieldGC4=new JTextField("3");
	public JTextField textFieldGC5=new JTextField("3");
	public JTextField textFieldGC6=new JTextField("1");
	public JTextField textFieldGC7=new JTextField("0");
	public JTextField textFieldGC8=new JTextField("0");
	public JTextField textFieldGC9=new JTextField("0");
	public JTextField textFieldGC10=new JTextField("0");
	public JTextField textFieldGC11=new JTextField("3");
	public JTextField textFieldGC12=new JTextField("3");

	public JTextField textFieldGD1=new JTextField("0");
	public JTextField textFieldGD2=new JTextField("0");
	public JTextField textFieldGD3=new JTextField("3");
	public JTextField textFieldGD4=new JTextField("1");
	public JTextField textFieldGD5=new JTextField("2");
	public JTextField textFieldGD6=new JTextField("2");
	public JTextField textFieldGD7=new JTextField("2");
	public JTextField textFieldGD8=new JTextField("1");
	public JTextField textFieldGD9=new JTextField("2");
	public JTextField textFieldGD10=new JTextField("1");
	public JTextField textFieldGD11=new JTextField("3");
	public JTextField textFieldGD12=new JTextField("0");

	public JTextField textFieldGE1=new JTextField("0");
	public JTextField textFieldGE2=new JTextField("5");
	public JTextField textFieldGE3=new JTextField("2");
	public JTextField textFieldGE4=new JTextField("0");
	public JTextField textFieldGE5=new JTextField("1");
	public JTextField textFieldGE6=new JTextField("2");
	public JTextField textFieldGE7=new JTextField("3");
	public JTextField textFieldGE8=new JTextField("2");
	public JTextField textFieldGE9=new JTextField("5");
	public JTextField textFieldGE10=new JTextField("2");
	public JTextField textFieldGE11=new JTextField("1");
	public JTextField textFieldGE12=new JTextField("2");

	public JTextField textFieldGF1=new JTextField("1");
	public JTextField textFieldGF2=new JTextField("3");
	public JTextField textFieldGF3=new JTextField("2");
	public JTextField textFieldGF4=new JTextField("5");
	public JTextField textFieldGF5=new JTextField("0");
	public JTextField textFieldGF6=new JTextField("2");
	public JTextField textFieldGF7=new JTextField("0");
	public JTextField textFieldGF8=new JTextField("1");
	public JTextField textFieldGF9=new JTextField("5");
	public JTextField textFieldGF10=new JTextField("0");
	public JTextField textFieldGF11=new JTextField("2");
	public JTextField textFieldGF12=new JTextField("0");

	public JTextField textFieldGG1=new JTextField("0");
	public JTextField textFieldGG2=new JTextField("0");
	public JTextField textFieldGG3=new JTextField("1");
	public JTextField textFieldGG4=new JTextField("1");
	public JTextField textFieldGG5=new JTextField("2");
	public JTextField textFieldGG6=new JTextField("3");
	public JTextField textFieldGG7=new JTextField("5");
	public JTextField textFieldGG8=new JTextField("0");
	public JTextField textFieldGG9=new JTextField("6");
	public JTextField textFieldGG10=new JTextField("7");
	public JTextField textFieldGG11=new JTextField("0");
	public JTextField textFieldGG12=new JTextField("2");

	public JTextField textFieldGH1=new JTextField("2");
	public JTextField textFieldGH2=new JTextField("1");
	public JTextField textFieldGH3=new JTextField("2");
	public JTextField textFieldGH4=new JTextField("2");
	public JTextField textFieldGH5=new JTextField("0");
	public JTextField textFieldGH6=new JTextField("0");
	public JTextField textFieldGH7=new JTextField("3");
	public JTextField textFieldGH8=new JTextField("0");
	public JTextField textFieldGH9=new JTextField("5");
	public JTextField textFieldGH10=new JTextField("0");
	public JTextField textFieldGH11=new JTextField("2");
	public JTextField textFieldGH12=new JTextField("3");

	public Ventana() {
		super("_ P O L L A _ M U N D I A L I S T A _ F A S E 1 _");
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
		etiquetas = new JLabel("P O L L A  M U N D I A L I S T A  F A S E 1");
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
		titulo = new JLabel("Grupo A");
		partido1 = new JLabel("Qatar                                                    Ecuador");
		partido2 = new JLabel("Senegal                                                Holanda");
		partido3 = new JLabel("Holanda                                               Ecuador");
		partido4 = new JLabel("Qatar                                                    Senegal");
		partido5 = new JLabel("Ecuador                                                Senegal");
		partido6 = new JLabel("Holanda                                                Qatar");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGA.add(titulo);
		
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
		titulo = new JLabel("Grupo B");
		partido1 = new JLabel("Inglaterra                                           Iran");
		partido2 = new JLabel("USA                                                    Gales");
		partido3 = new JLabel("Gales                                                  Iran");
		partido4 = new JLabel("Inglaterra                                           USA");
		partido5 = new JLabel("Iran                                                     USA");
		partido6 = new JLabel("Gales                                                  Inglaterra");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGB.add(titulo);
		
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
		titulo = new JLabel("Grupo C");
		partido1 = new JLabel("Argentina                                           Arabia");
		partido2 = new JLabel("Mexico                                               Polonia");
		partido3 = new JLabel("Polonia                                               Arabia");
		partido4 = new JLabel("Argentina                                           Mexico");
		partido5 = new JLabel("Polonia                                               Argentina");
		partido6 = new JLabel("Arabia                                                Mexico");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGC.add(titulo);
		
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
		titulo = new JLabel("Grupo D");
		partido1 = new JLabel("Dinamarca                                         Tunez");
		partido2 = new JLabel("Francia                                               Australia");
		partido3 = new JLabel("Túnez                                                 Australia");
		partido4 = new JLabel("Francia                                               Dinamarca");
		partido5 = new JLabel("Australia                                            Dinamarca");
		partido6 = new JLabel("Túnez                                                 Francia");
		
		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGD.add(titulo);
		
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
		titulo = new JLabel("Grupo E");
		partido1 = new JLabel("Alemania                                            Japon");
		partido2 = new JLabel("España                                               Costa rica");
		partido3 = new JLabel("Japon                                                 Costa rica");
		partido4 = new JLabel("España                                               Alemania");
		partido5 = new JLabel("Costa Rica                                          Alemania");
		partido6 = new JLabel("Japon                                                 España");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGE.add(titulo);
		
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
		titulo = new JLabel("Grupo F");
		partido1 = new JLabel("Marruecos                                         Croacia");
		partido2 = new JLabel("Belgica                                               Canada");
		partido3 = new JLabel("Belgica                                               Marruecos");
		partido4 = new JLabel("Croacia                                              Canada");
		partido5 = new JLabel("Canada                                              Marruecos");
		partido6 = new JLabel("Croacia                                              Belgica");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGF.add(titulo);
		
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
		titulo = new JLabel("Grupo G");
		partido1 = new JLabel("Suiza                                                  Camerún");
		partido2 = new JLabel("Brasil                                                  Serbia");
		partido3 = new JLabel("Camerun                                            Serbia");
		partido4 = new JLabel("Brasil                                                  Suiza");
		partido5 = new JLabel("Serbia                                                 Suiza");
		partido6 = new JLabel("Camerun                                            Brasil");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGG.add(titulo);
		
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
		titulo = new JLabel("Grupo H");
		partido1 = new JLabel("Uruguay                                             Corea");
		partido2 = new JLabel("Portugal                                             Ghana");
		partido3 = new JLabel("Corea                                                 Ghana");
		partido4 = new JLabel("Portugal                                             Uruguay");
		partido5 = new JLabel("Ghana                                                Uruguay");
		partido6 = new JLabel("Corea                                                 Portugal");

		titulo.setBounds(450, 10, 1100, 60);
		titulo.setFont(new Font("Arial", 0, 20));
		titulo.setForeground(Color.white);
		panelGH.add(titulo);
		
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

		bSiguienteFase.setBounds(800,450, 120, 30);
		bSiguienteFase.setBackground(new Color(253, 251, 251));
		panelGH.add(bSiguienteFase);

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
		this.bSiguienteFase.addActionListener(this.c);
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

	public JButton getbSiguienteFase() {
		return bSiguienteFase;
	}

	public void setbSiguienteFase(JButton bSiguienteFase) {
		this.bSiguienteFase = bSiguienteFase;
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

	public JTextField getTextFieldGA1() {
		return textFieldGA1;
	}

	public JTextField getTextFieldGA2() {
		return textFieldGA2;
	}

	public void setTextFieldGA2(JTextField textFieldGA2) {
		this.textFieldGA2 = textFieldGA2;
	}

	public JTextField getTextFieldGA3() {
		return textFieldGA3;
	}

	public void setTextFieldGA3(JTextField textFieldGA3) {
		this.textFieldGA3 = textFieldGA3;
	}

	public JTextField getTextFieldGA4() {
		return textFieldGA4;
	}

	public void setTextFieldGA4(JTextField textFieldGA4) {
		this.textFieldGA4 = textFieldGA4;
	}

	public JTextField getTextFieldGA5() {
		return textFieldGA5;
	}

	public void setTextFieldGA5(JTextField textFieldGA5) {
		this.textFieldGA5 = textFieldGA5;
	}

	public JTextField getTextFieldGA6() {
		return textFieldGA6;
	}

	public void setTextFieldGA6(JTextField textFieldGA6) {
		this.textFieldGA6 = textFieldGA6;
	}

	public JTextField getTextFieldGA7() {
		return textFieldGA7;
	}

	public void setTextFieldGA7(JTextField textFieldGA7) {
		this.textFieldGA7 = textFieldGA7;
	}

	public JTextField getTextFieldGA8() {
		return textFieldGA8;
	}

	public void setTextFieldGA8(JTextField textFieldGA8) {
		this.textFieldGA8 = textFieldGA8;
	}

	public JTextField getTextFieldGA9() {
		return textFieldGA9;
	}

	public void setTextFieldGA9(JTextField textFieldGA9) {
		this.textFieldGA9 = textFieldGA9;
	}

	public JTextField getTextFieldGA10() {
		return textFieldGA10;
	}

	public void setTextFieldGA10(JTextField textFieldGA10) {
		this.textFieldGA10 = textFieldGA10;
	}

	public JTextField getTextFieldGA11() {
		return textFieldGA11;
	}

	public void setTextFieldGA11(JTextField textFieldGA11) {
		this.textFieldGA11 = textFieldGA11;
	}

	public JTextField getTextFieldGA12() {
		return textFieldGA12;
	}

	public void setTextFieldGA12(JTextField textFieldGA12) {
		this.textFieldGA12 = textFieldGA12;
	}

	public JTextField getTextFieldGB1() {
		return textFieldGB1;
	}

	public void setTextFieldGB1(JTextField textFieldGB1) {
		this.textFieldGB1 = textFieldGB1;
	}

	public JTextField getTextFieldGB2() {
		return textFieldGB2;
	}

	public void setTextFieldGB2(JTextField textFieldGB2) {
		this.textFieldGB2 = textFieldGB2;
	}

	public JTextField getTextFieldGB3() {
		return textFieldGB3;
	}

	public void setTextFieldGB3(JTextField textFieldGB3) {
		this.textFieldGB3 = textFieldGB3;
	}

	public JTextField getTextFieldGB4() {
		return textFieldGB4;
	}

	public void setTextFieldGB4(JTextField textFieldGB4) {
		this.textFieldGB4 = textFieldGB4;
	}

	public JTextField getTextFieldGB5() {
		return textFieldGB5;
	}

	public void setTextFieldGB5(JTextField textFieldGB5) {
		this.textFieldGB5 = textFieldGB5;
	}

	public JTextField getTextFieldGB6() {
		return textFieldGB6;
	}

	public void setTextFieldGB6(JTextField textFieldGB6) {
		this.textFieldGB6 = textFieldGB6;
	}

	public JTextField getTextFieldGB7() {
		return textFieldGB7;
	}

	public void setTextFieldGB7(JTextField textFieldGB7) {
		this.textFieldGB7 = textFieldGB7;
	}

	public JTextField getTextFieldGB8() {
		return textFieldGB8;
	}

	public void setTextFieldGB8(JTextField textFieldGB8) {
		this.textFieldGB8 = textFieldGB8;
	}

	public JTextField getTextFieldGB9() {
		return textFieldGB9;
	}

	public void setTextFieldGB9(JTextField textFieldGB9) {
		this.textFieldGB9 = textFieldGB9;
	}

	public JTextField getTextFieldGB10() {
		return textFieldGB10;
	}

	public void setTextFieldGB10(JTextField textFieldGB10) {
		this.textFieldGB10 = textFieldGB10;
	}

	public JTextField getTextFieldGB11() {
		return textFieldGB11;
	}

	public void setTextFieldGB11(JTextField textFieldGB11) {
		this.textFieldGB11 = textFieldGB11;
	}

	public JTextField getTextFieldGB12() {
		return textFieldGB12;
	}

	public void setTextFieldGB12(JTextField textFieldGB12) {
		this.textFieldGB12 = textFieldGB12;
	}

	public JTextField getTextFieldGC1() {
		return textFieldGC1;
	}

	public void setTextFieldGC1(JTextField textFieldGC1) {
		this.textFieldGC1 = textFieldGC1;
	}

	public JTextField getTextFieldGC2() {
		return textFieldGC2;
	}

	public void setTextFieldGC2(JTextField textFieldGC2) {
		this.textFieldGC2 = textFieldGC2;
	}

	public JTextField getTextFieldGC3() {
		return textFieldGC3;
	}

	public void setTextFieldGC3(JTextField textFieldGC3) {
		this.textFieldGC3 = textFieldGC3;
	}

	public JTextField getTextFieldGC4() {
		return textFieldGC4;
	}

	public void setTextFieldGC4(JTextField textFieldGC4) {
		this.textFieldGC4 = textFieldGC4;
	}

	public JTextField getTextFieldGC5() {
		return textFieldGC5;
	}

	public void setTextFieldGC5(JTextField textFieldGC5) {
		this.textFieldGC5 = textFieldGC5;
	}

	public JTextField getTextFieldGC6() {
		return textFieldGC6;
	}

	public void setTextFieldGC6(JTextField textFieldGC6) {
		this.textFieldGC6 = textFieldGC6;
	}

	public JTextField getTextFieldGC7() {
		return textFieldGC7;
	}

	public void setTextFieldGC7(JTextField textFieldGC7) {
		this.textFieldGC7 = textFieldGC7;
	}

	public JTextField getTextFieldGC8() {
		return textFieldGC8;
	}

	public void setTextFieldGC8(JTextField textFieldGC8) {
		this.textFieldGC8 = textFieldGC8;
	}

	public JTextField getTextFieldGC9() {
		return textFieldGC9;
	}

	public void setTextFieldGC9(JTextField textFieldGC9) {
		this.textFieldGC9 = textFieldGC9;
	}

	public JTextField getTextFieldGC10() {
		return textFieldGC10;
	}

	public void setTextFieldGC10(JTextField textFieldGC10) {
		this.textFieldGC10 = textFieldGC10;
	}

	public JTextField getTextFieldGC11() {
		return textFieldGC11;
	}

	public void setTextFieldGC11(JTextField textFieldGC11) {
		this.textFieldGC11 = textFieldGC11;
	}

	public JTextField getTextFieldGC12() {
		return textFieldGC12;
	}

	public void setTextFieldGC12(JTextField textFieldGC12) {
		this.textFieldGC12 = textFieldGC12;
	}

	public JTextField getTextFieldGD1() {
		return textFieldGD1;
	}

	public void setTextFieldGD1(JTextField textFieldGD1) {
		this.textFieldGD1 = textFieldGD1;
	}

	public JTextField getTextFieldGD2() {
		return textFieldGD2;
	}

	public void setTextFieldGD2(JTextField textFieldGD2) {
		this.textFieldGD2 = textFieldGD2;
	}

	public JTextField getTextFieldGD3() {
		return textFieldGD3;
	}

	public void setTextFieldGD3(JTextField textFieldGD3) {
		this.textFieldGD3 = textFieldGD3;
	}

	public JTextField getTextFieldGD4() {
		return textFieldGD4;
	}

	public void setTextFieldGD4(JTextField textFieldGD4) {
		this.textFieldGD4 = textFieldGD4;
	}

	public JTextField getTextFieldGD5() {
		return textFieldGD5;
	}

	public void setTextFieldGD5(JTextField textFieldGD5) {
		this.textFieldGD5 = textFieldGD5;
	}

	public JTextField getTextFieldGD6() {
		return textFieldGD6;
	}

	public void setTextFieldGD6(JTextField textFieldGD6) {
		this.textFieldGD6 = textFieldGD6;
	}

	public JTextField getTextFieldGD7() {
		return textFieldGD7;
	}

	public void setTextFieldGD7(JTextField textFieldGD7) {
		this.textFieldGD7 = textFieldGD7;
	}

	public JTextField getTextFieldGD8() {
		return textFieldGD8;
	}

	public void setTextFieldGD8(JTextField textFieldGD8) {
		this.textFieldGD8 = textFieldGD8;
	}

	public JTextField getTextFieldGD9() {
		return textFieldGD9;
	}

	public void setTextFieldGD9(JTextField textFieldGD9) {
		this.textFieldGD9 = textFieldGD9;
	}

	public JTextField getTextFieldGD10() {
		return textFieldGD10;
	}

	public void setTextFieldGD10(JTextField textFieldGD10) {
		this.textFieldGD10 = textFieldGD10;
	}

	public JTextField getTextFieldGD11() {
		return textFieldGD11;
	}

	public void setTextFieldGD11(JTextField textFieldGD11) {
		this.textFieldGD11 = textFieldGD11;
	}

	public JTextField getTextFieldGD12() {
		return textFieldGD12;
	}

	public void setTextFieldGD12(JTextField textFieldGD12) {
		this.textFieldGD12 = textFieldGD12;
	}

	public JTextField getTextFieldGE1() {
		return textFieldGE1;
	}

	public void setTextFieldGE1(JTextField textFieldGE1) {
		this.textFieldGE1 = textFieldGE1;
	}

	public JTextField getTextFieldGE2() {
		return textFieldGE2;
	}

	public void setTextFieldGE2(JTextField textFieldGE2) {
		this.textFieldGE2 = textFieldGE2;
	}

	public JTextField getTextFieldGE3() {
		return textFieldGE3;
	}

	public void setTextFieldGE3(JTextField textFieldGE3) {
		this.textFieldGE3 = textFieldGE3;
	}

	public JTextField getTextFieldGE4() {
		return textFieldGE4;
	}

	public void setTextFieldGE4(JTextField textFieldGE4) {
		this.textFieldGE4 = textFieldGE4;
	}

	public JTextField getTextFieldGE5() {
		return textFieldGE5;
	}

	public void setTextFieldGE5(JTextField textFieldGE5) {
		this.textFieldGE5 = textFieldGE5;
	}

	public JTextField getTextFieldGE6() {
		return textFieldGE6;
	}

	public void setTextFieldGE6(JTextField textFieldGE6) {
		this.textFieldGE6 = textFieldGE6;
	}

	public JTextField getTextFieldGE7() {
		return textFieldGE7;
	}

	public void setTextFieldGE7(JTextField textFieldGE7) {
		this.textFieldGE7 = textFieldGE7;
	}

	public JTextField getTextFieldGE8() {
		return textFieldGE8;
	}

	public void setTextFieldGE8(JTextField textFieldGE8) {
		this.textFieldGE8 = textFieldGE8;
	}

	public JTextField getTextFieldGE9() {
		return textFieldGE9;
	}

	public void setTextFieldGE9(JTextField textFieldGE9) {
		this.textFieldGE9 = textFieldGE9;
	}

	public JTextField getTextFieldGE10() {
		return textFieldGE10;
	}

	public void setTextFieldGE10(JTextField textFieldGE10) {
		this.textFieldGE10 = textFieldGE10;
	}

	public JTextField getTextFieldGE11() {
		return textFieldGE11;
	}

	public void setTextFieldGE11(JTextField textFieldGE11) {
		this.textFieldGE11 = textFieldGE11;
	}

	public JTextField getTextFieldGE12() {
		return textFieldGE12;
	}

	public void setTextFieldGE12(JTextField textFieldGE12) {
		this.textFieldGE12 = textFieldGE12;
	}

	public JTextField getTextFieldGF1() {
		return textFieldGF1;
	}

	public void setTextFieldGF1(JTextField textFieldGF1) {
		this.textFieldGF1 = textFieldGF1;
	}

	public JTextField getTextFieldGF2() {
		return textFieldGF2;
	}

	public void setTextFieldGF2(JTextField textFieldGF2) {
		this.textFieldGF2 = textFieldGF2;
	}

	public JTextField getTextFieldGF3() {
		return textFieldGF3;
	}

	public void setTextFieldGF3(JTextField textFieldGF3) {
		this.textFieldGF3 = textFieldGF3;
	}

	public JTextField getTextFieldGF4() {
		return textFieldGF4;
	}

	public void setTextFieldGF4(JTextField textFieldGF4) {
		this.textFieldGF4 = textFieldGF4;
	}

	public JTextField getTextFieldGF5() {
		return textFieldGF5;
	}

	public void setTextFieldGF5(JTextField textFieldGF5) {
		this.textFieldGF5 = textFieldGF5;
	}

	public JTextField getTextFieldGF6() {
		return textFieldGF6;
	}

	public void setTextFieldGF6(JTextField textFieldGF6) {
		this.textFieldGF6 = textFieldGF6;
	}

	public JTextField getTextFieldGF7() {
		return textFieldGF7;
	}

	public void setTextFieldGF7(JTextField textFieldGF7) {
		this.textFieldGF7 = textFieldGF7;
	}

	public JTextField getTextFieldGF8() {
		return textFieldGF8;
	}

	public void setTextFieldGF8(JTextField textFieldGF8) {
		this.textFieldGF8 = textFieldGF8;
	}

	public JTextField getTextFieldGF9() {
		return textFieldGF9;
	}

	public void setTextFieldGF9(JTextField textFieldGF9) {
		this.textFieldGF9 = textFieldGF9;
	}

	public JTextField getTextFieldGF10() {
		return textFieldGF10;
	}

	public void setTextFieldGF10(JTextField textFieldGF10) {
		this.textFieldGF10 = textFieldGF10;
	}

	public JTextField getTextFieldGF11() {
		return textFieldGF11;
	}

	public void setTextFieldGF11(JTextField textFieldGF11) {
		this.textFieldGF11 = textFieldGF11;
	}

	public JTextField getTextFieldGF12() {
		return textFieldGF12;
	}

	public void setTextFieldGF12(JTextField textFieldGF12) {
		this.textFieldGF12 = textFieldGF12;
	}

	public JTextField getTextFieldGG1() {
		return textFieldGG1;
	}

	public void setTextFieldGG1(JTextField textFieldGG1) {
		this.textFieldGG1 = textFieldGG1;
	}

	public JTextField getTextFieldGG2() {
		return textFieldGG2;
	}

	public void setTextFieldGG2(JTextField textFieldGG2) {
		this.textFieldGG2 = textFieldGG2;
	}

	public JTextField getTextFieldGG3() {
		return textFieldGG3;
	}

	public void setTextFieldGG3(JTextField textFieldGG3) {
		this.textFieldGG3 = textFieldGG3;
	}

	public JTextField getTextFieldGG4() {
		return textFieldGG4;
	}

	public void setTextFieldGG4(JTextField textFieldGG4) {
		this.textFieldGG4 = textFieldGG4;
	}

	public JTextField getTextFieldGG5() {
		return textFieldGG5;
	}

	public void setTextFieldGG5(JTextField textFieldGG5) {
		this.textFieldGG5 = textFieldGG5;
	}

	public JTextField getTextFieldGG6() {
		return textFieldGG6;
	}

	public void setTextFieldGG6(JTextField textFieldGG6) {
		this.textFieldGG6 = textFieldGG6;
	}

	public JTextField getTextFieldGG7() {
		return textFieldGG7;
	}

	public void setTextFieldGG7(JTextField textFieldGG7) {
		this.textFieldGG7 = textFieldGG7;
	}

	public JTextField getTextFieldGG8() {
		return textFieldGG8;
	}

	public void setTextFieldGG8(JTextField textFieldGG8) {
		this.textFieldGG8 = textFieldGG8;
	}

	public JTextField getTextFieldGG9() {
		return textFieldGG9;
	}

	public void setTextFieldGG9(JTextField textFieldGG9) {
		this.textFieldGG9 = textFieldGG9;
	}

	public JTextField getTextFieldGG10() {
		return textFieldGG10;
	}

	public void setTextFieldGG10(JTextField textFieldGG10) {
		this.textFieldGG10 = textFieldGG10;
	}

	public JTextField getTextFieldGG11() {
		return textFieldGG11;
	}

	public void setTextFieldGG11(JTextField textFieldGG11) {
		this.textFieldGG11 = textFieldGG11;
	}

	public JTextField getTextFieldGG12() {
		return textFieldGG12;
	}

	public void setTextFieldGG12(JTextField textFieldGG12) {
		this.textFieldGG12 = textFieldGG12;
	}

	public JTextField getTextFieldGH1() {
		return textFieldGH1;
	}

	public void setTextFieldGH1(JTextField textFieldGH1) {
		this.textFieldGH1 = textFieldGH1;
	}

	public JTextField getTextFieldGH2() {
		return textFieldGH2;
	}

	public void setTextFieldGH2(JTextField textFieldGH2) {
		this.textFieldGH2 = textFieldGH2;
	}

	public JTextField getTextFieldGH3() {
		return textFieldGH3;
	}

	public void setTextFieldGH3(JTextField textFieldGH3) {
		this.textFieldGH3 = textFieldGH3;
	}

	public JTextField getTextFieldGH4() {
		return textFieldGH4;
	}

	public void setTextFieldGH4(JTextField textFieldGH4) {
		this.textFieldGH4 = textFieldGH4;
	}

	public JTextField getTextFieldGH5() {
		return textFieldGH5;
	}

	public void setTextFieldGH5(JTextField textFieldGH5) {
		this.textFieldGH5 = textFieldGH5;
	}

	public JTextField getTextFieldGH6() {
		return textFieldGH6;
	}

	public void setTextFieldGH6(JTextField textFieldGH6) {
		this.textFieldGH6 = textFieldGH6;
	}

	public JTextField getTextFieldGH7() {
		return textFieldGH7;
	}

	public void setTextFieldGH7(JTextField textFieldGH7) {
		this.textFieldGH7 = textFieldGH7;
	}

	public JTextField getTextFieldGH8() {
		return textFieldGH8;
	}

	public void setTextFieldGH8(JTextField textFieldGH8) {
		this.textFieldGH8 = textFieldGH8;
	}

	public JTextField getTextFieldGH9() {
		return textFieldGH9;
	}

	public void setTextFieldGH9(JTextField textFieldGH9) {
		this.textFieldGH9 = textFieldGH9;
	}

	public JTextField getTextFieldGH10() {
		return textFieldGH10;
	}

	public void setTextFieldGH10(JTextField textFieldGH10) {
		this.textFieldGH10 = textFieldGH10;
	}

	public JTextField getTextFieldGH11() {
		return textFieldGH11;
	}

	public void setTextFieldGH11(JTextField textFieldGH11) {
		this.textFieldGH11 = textFieldGH11;
	}

	public JTextField getTextFieldGH12() {
		return textFieldGH12;
	}

	public void setTextFieldGH12(JTextField textFieldGH12) {
		this.textFieldGH12 = textFieldGH12;
	}

	public void setTextFieldGA1(JTextField textFieldGA1) {
		this.textFieldGA1 = textFieldGA1;
	}
}
