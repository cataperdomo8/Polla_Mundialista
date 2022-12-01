package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import controlador.Controller;

public class Ventana2 extends JFrame{
	private Controller c;

	private Panel panelPrincipal;
	public Panel2 panelImageLlaves;
	public Panel3 panelImageGrupos;
	private JLabel etiquetas;
	private JLabel primero;
	private JLabel segundo;
	private JLabel tercero;
	private JLabel cuarto;
	public JButton bContinuar = new JButton("Total!");
	
	public JLabel octavos1;
	public JLabel octavos2;
	public JLabel octavos3;
	public JLabel octavos4;
	public JLabel octavos5;
	public JLabel octavos6;
	public JLabel octavos7;
	public JLabel octavos8;
	public JLabel cuartos1;
	public JLabel cuartos2;
	public JLabel cuartos3;
	public JLabel cuartos4;
	public JLabel semifinales1;
	public JLabel semifinales2;
	public JLabel Finalistas;

	/*TextField Octvos de Final*/

	public JTextField textField1A=new JTextField("3");
	public JTextField textField1B=new JTextField("7");
	public JTextField textField1C=new JTextField("9");
	public JTextField textField1D=new JTextField("13");
	public JTextField textField1E=new JTextField("17");
	public JTextField textField1F=new JTextField("24");
	public JTextField textField1G=new JTextField("25");
	public JTextField textField1H =new JTextField("29");
	public JTextField textField2A=new JTextField("4");
	public JTextField textField2B=new JTextField("5");
	public JTextField textField2C=new JTextField("12");
	public JTextField textField2D=new JTextField("14");
	public JTextField textField2E=new JTextField("20");
	public JTextField textField2F=new JTextField("21");
	public JTextField textField2G=new JTextField("27");
	public JTextField textField2H =new JTextField("30");

	/*TextField Cuartos de Final*/

	public JTextField textFieldEq1 =new JTextField("5");
	public JTextField textFieldEq2 =new JTextField("9");
	public JTextField textFieldEq3 =new JTextField("17");
	public JTextField textFieldEq4 =new JTextField("25");
	public JTextField textFieldEq5 =new JTextField("4");
	public JTextField textFieldEq6 =new JTextField("13");
	public JTextField textFieldEq7 =new JTextField("24");
	public JTextField textFieldEq8 =new JTextField("29");

	/*TextField Semifinalistas*/

	public JTextField textFieldSem1 =new JTextField("5");
	public JTextField textFieldSem2 =new JTextField("25");
	public JTextField textFieldSem3 =new JTextField("4");
	public JTextField textFieldSem4 =new JTextField("29");

	/*TextField Finalistas*/

	public JTextField textFieldFinal1 =new JTextField("25");
	public JTextField textFieldFinal2 =new JTextField("4");

	/*Ganadores, perdedores, tercer, cuarto*/

	public JTextField textFieldGanador =new JTextField("25");
	public JTextField textFieldSegundo =new JTextField("4");
	public JTextField textFieldTercero =new JTextField("5");
	public JTextField textFieldCuarto =new JTextField("29");

	public Ventana2() {
		super("_ P O L L A _ M U N D I A L I S T A _ F A S E 2 _");
		setLayout(null);
		setBounds(10, 10, 1450, 680);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(88, 24, 69));
		componentes();
	}



	public void componentes() {
		inicializarPaneles();
		inicializarEtiquetas();
		inicializarOctavos();
		inicializarCuartos();
		inicializarSemifinal();
		inicializarFinal();
		inicializarPosiciones();
		inicializarLabels();
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

		panelImageGrupos = new Panel3("/imagen/Grupos.JPG");
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
		
		this.bContinuar.setBounds(700,605, 100, 30);
		this.bContinuar.setBackground(new Color(253, 251, 251));
		this.add(bContinuar);
	}
	
	public void inicializarLabels(){

		octavos1 = new JLabel("1A                                                                                                        1B");
		octavos2 = new JLabel("2B                                                                                                        2A");
		octavos3 = new JLabel("1C                                                                                                        1D");
		octavos4 = new JLabel("2D                                                                                                        2C");
		octavos5 = new JLabel("1E                                                                                                        1F");
		octavos6 = new JLabel("2F                                                                                                        2E");
		octavos7 = new JLabel("1G                                                                                                        1H");
		octavos8 = new JLabel("2H                                                                                                        2G");
		cuartos1 = new JLabel("1A o 2B                                                                            1B o 2A");
		cuartos2 = new JLabel("1C o 2D                                                                            1D o 2C");
		cuartos3 = new JLabel("1E o 2F                                                                            1F o 2E");
		cuartos4 = new JLabel("1G o 2H                                                                            1H o 2G");
		semifinales1 = new JLabel(" Semifinalista1                               Semifinalista3");
		semifinales2 = new JLabel(" Semifinalista2                               Semifinalista4");
		Finalistas = new JLabel("Finalista1      Finalista2");

		octavos1.setBounds(50, 2, 1600, 60);
		octavos1.setFont(new Font("Arial", 0, 20));
		octavos1.setForeground(Color.white);
		panelImageLlaves.add(octavos1);

		octavos2.setBounds(50, 60, 1100, 60);
		octavos2.setFont(new Font("Arial", 0, 20));
		octavos2.setForeground(Color.white);
		panelImageLlaves.add(octavos2);

		octavos3.setBounds(50, 120, 1100, 60);
		octavos3.setFont(new Font("Arial", 0, 20));
		octavos3.setForeground(Color.white);
		panelImageLlaves.add(octavos3);

		octavos4.setBounds(50, 180, 1100, 60);
		octavos4.setFont(new Font("Arial", 0, 20));
		octavos4.setForeground(Color.white);
		panelImageLlaves.add(octavos4);

		octavos5.setBounds(50, 235, 1100, 60);
		octavos5.setFont(new Font("Arial", 0, 20));
		octavos5.setForeground(Color.white);
		panelImageLlaves.add(octavos5);

		octavos6.setBounds(50, 300, 1100, 60);
		octavos6.setFont(new Font("Arial", 0, 20));
		octavos6.setForeground(Color.white);
		panelImageLlaves.add(octavos6);

		octavos7.setBounds(50, 360, 1100, 60);
		octavos7.setFont(new Font("Arial", 0, 20));
		octavos7.setForeground(Color.white);
		panelImageLlaves.add(octavos7);

		octavos8.setBounds(50, 420, 1100, 60);
		octavos8.setFont(new Font("Arial", 0, 20));
		octavos8.setForeground(Color.white);
		panelImageLlaves.add(octavos8);

		//////////////////////////////////////////////

		cuartos1.setBounds(100, 30, 1100, 60);
		cuartos1.setFont(new Font("Calibri", 0, 20));
		cuartos1.setForeground(Color.white);
		panelImageLlaves.add(cuartos1);

		cuartos2.setBounds(100, 150, 1100, 60);
		cuartos2.setFont(new Font("Calibri", 0, 20));
		cuartos2.setForeground(Color.white);
		panelImageLlaves.add(cuartos2);

		cuartos3.setBounds(100, 270, 1100, 60);
		cuartos3.setFont(new Font("Calibri", 0, 20));
		cuartos3.setForeground(Color.white);
		panelImageLlaves.add(cuartos3);

		cuartos4.setBounds(100, 390, 1100, 60);
		cuartos4.setFont(new Font("Calibri", 0, 20));
		cuartos4.setForeground(Color.white);
		panelImageLlaves.add(cuartos4);

		///////////////////////////////////////////////////////

		semifinales1.setBounds(150, 85, 1100, 60);
		semifinales1.setFont(new Font("Arial", 0, 20));
		semifinales1.setForeground(Color.white);
		panelImageLlaves.add(semifinales1);
		
		semifinales2.setBounds(150,325, 1100, 60);
		semifinales2.setFont(new Font("Arial", 0, 20));
		semifinales2.setForeground(Color.white);
		panelImageLlaves.add(semifinales2);
		
		///////////////////////////////////////////////////////
		
	    Finalistas.setBounds(275, 200, 1100, 60);
		Finalistas.setFont(new Font("Arial", 0, 20));
		Finalistas.setForeground(Color.white);
		panelImageLlaves.add(Finalistas);

	}

	public void inicializarOctavos(){

		textField1A.setBounds(35, 40,45,20);
		panelImageLlaves.add(textField1A);
		textField2B.setBounds(35, 98,45,20);
		panelImageLlaves.add(textField2B);

		textField1C.setBounds(35, 158,45,20);
		panelImageLlaves.add(textField1C);
		textField2D.setBounds(35, 217,45,20);
		panelImageLlaves.add(textField2D);

		textField1E.setBounds(35, 277,45,20);
		panelImageLlaves.add(textField1E);
		textField2F.setBounds(35, 337,45,20);
		panelImageLlaves.add(textField2F);

		textField1G.setBounds(35, 397,45,20);
		panelImageLlaves.add(textField1G);
		textField2H.setBounds(35, 457,45,20);
		panelImageLlaves.add(textField2H);

		/***********************************/

		textField1B.setBounds(659, 40,45,20);
		panelImageLlaves.add(textField1B);
		textField2A.setBounds(659, 98,45,20);
		panelImageLlaves.add(textField2A);

		textField1D.setBounds(659, 158,45,20);
		panelImageLlaves.add(textField1D);
		textField2C.setBounds(659, 217,45,20);
		panelImageLlaves.add(textField2C);

		textField1F.setBounds(659, 277,45,20);
		panelImageLlaves.add(textField1F);
		textField2E.setBounds(659, 337,45,20);
		panelImageLlaves.add(textField2E);

		textField1H.setBounds(659, 397,45,20);
		panelImageLlaves.add(textField1H);
		textField2G.setBounds(659, 457,45,20);
		panelImageLlaves.add(textField2G);

	}


	public void inicializarCuartos(){

		textFieldEq1.setBounds(96, 69,45,20);
		panelImageLlaves.add(textFieldEq1);

		textFieldEq2.setBounds(96, 189,45,20);
		panelImageLlaves.add(textFieldEq2);

		textFieldEq3.setBounds(96, 309,45,20);
		panelImageLlaves.add(textFieldEq3);

		textFieldEq4.setBounds(96, 425,45,20);
		panelImageLlaves.add(textFieldEq4);

		/**********************************/

		textFieldEq5.setBounds(600, 69,45,20);
		panelImageLlaves.add(textFieldEq5);

		textFieldEq6.setBounds(600, 189,45,20);
		panelImageLlaves.add(textFieldEq6);

		textFieldEq7.setBounds(600, 309,45,20);
		panelImageLlaves.add(textFieldEq7);

		textFieldEq8.setBounds(600, 425,45,20);
		panelImageLlaves.add(textFieldEq8);
	}

	public void inicializarSemifinal(){
		textFieldSem1.setBounds(160, 129,60,20);
		panelImageLlaves.add(textFieldSem1);

		textFieldSem2.setBounds(161, 367,60,20);
		panelImageLlaves.add(textFieldSem2);

		textFieldSem3.setBounds(521, 129,57,20);
		panelImageLlaves.add(textFieldSem3);

		textFieldSem4.setBounds(521, 367,57,20);
		panelImageLlaves.add(textFieldSem4);


	}

	public void inicializarFinal(){
		textFieldFinal1.setBounds(280, 248,60,20);//Izquierda
		panelImageLlaves.add(textFieldFinal1);

		textFieldFinal2.setBounds(400, 248,60,20);//Derecha
		panelImageLlaves.add(textFieldFinal2);


	}

	public void inicializarPosiciones() {
		primero = new JLabel("Campeón");
		segundo = new JLabel("Sub-Campeón");
		tercero = new JLabel("Tercero");
		cuarto = new JLabel("Cuarto");

		primero.setBounds(330, 280, 1100, 60);
		primero.setFont(new Font("arial", 0, 20));
		primero.setForeground(Color.white);
		panelImageLlaves.add(primero);

		segundo.setBounds(320, 360, 1100, 60);
		segundo.setFont(new Font("arial", 0, 20));
		segundo.setForeground(Color.white);
		panelImageLlaves.add(segundo);

		tercero.setBounds(200, 420, 1100, 60);
		tercero.setFont(new Font("arial", 0, 20));
		tercero.setForeground(Color.white);
		panelImageLlaves.add(tercero);

		cuarto.setBounds(400, 420, 1100, 60);
		cuarto.setFont(new Font("arial", 0, 20));
		cuarto.setForeground(Color.white);
		panelImageLlaves.add(cuarto);

		textFieldGanador.setBounds(340, 325,60,20);
		panelImageLlaves.add(textFieldGanador);
		textFieldSegundo.setBounds(340, 400,60,20);
		panelImageLlaves.add(textFieldSegundo);

		textFieldTercero.setBounds(270, 445,60,20);
		panelImageLlaves.add(textFieldTercero);
		textFieldCuarto.setBounds(460, 445,60,20);
		panelImageLlaves.add(textFieldCuarto);

	}

	//Recibe el controlador y se lo entrega al boton.
	public void setController(Controller cont){
		this.c = cont;
		this.bContinuar.addActionListener(this.c);
	}

	public JButton getbContinuar() {
		return bContinuar;
	}
	
	public void setbContinuar(JButton bContinuar) {
		this.bContinuar = bContinuar;
	}

	public JTextField getTextField1A() {
		return textField1A;
	}



	public void setTextField1A(JTextField textField1A) {
		this.textField1A = textField1A;
	}



	public JTextField getTextField1B() {
		return textField1B;
	}



	public void setTextField1B(JTextField textField1B) {
		this.textField1B = textField1B;
	}



	public JTextField getTextField1C() {
		return textField1C;
	}



	public void setTextField1C(JTextField textField1C) {
		this.textField1C = textField1C;
	}



	public JTextField getTextField1D() {
		return textField1D;
	}



	public void setTextField1D(JTextField textField1D) {
		this.textField1D = textField1D;
	}



	public JTextField getTextField1E() {
		return textField1E;
	}



	public void setTextField1E(JTextField textField1E) {
		this.textField1E = textField1E;
	}



	public JTextField getTextField1F() {
		return textField1F;
	}



	public void setTextField1F(JTextField textField1F) {
		this.textField1F = textField1F;
	}



	public JTextField getTextField1G() {
		return textField1G;
	}



	public void setTextField1G(JTextField textField1G) {
		this.textField1G = textField1G;
	}



	public JTextField getTextField1H() {
		return textField1H;
	}



	public void setTextField1H(JTextField textField1H) {
		this.textField1H = textField1H;
	}



	public JTextField getTextField2A() {
		return textField2A;
	}



	public void setTextField2A(JTextField textField2A) {
		this.textField2A = textField2A;
	}



	public JTextField getTextField2B() {
		return textField2B;
	}



	public void setTextField2B(JTextField textField2B) {
		this.textField2B = textField2B;
	}



	public JTextField getTextField2C() {
		return textField2C;
	}



	public void setTextField2C(JTextField textField2C) {
		this.textField2C = textField2C;
	}



	public JTextField getTextField2D() {
		return textField2D;
	}



	public void setTextField2D(JTextField textField2D) {
		this.textField2D = textField2D;
	}



	public JTextField getTextField2E() {
		return textField2E;
	}



	public void setTextField2E(JTextField textField2E) {
		this.textField2E = textField2E;
	}



	public JTextField getTextField2F() {
		return textField2F;
	}



	public void setTextField2F(JTextField textField2F) {
		this.textField2F = textField2F;
	}



	public JTextField getTextField2G() {
		return textField2G;
	}



	public void setTextField2G(JTextField textField2G) {
		this.textField2G = textField2G;
	}



	public JTextField getTextField2H() {
		return textField2H;
	}



	public void setTextField2H(JTextField textField2H) {
		this.textField2H = textField2H;
	}



	public JTextField getTextFieldEq1() {
		return textFieldEq1;
	}



	public void setTextFieldEq1(JTextField textFieldEq1) {
		this.textFieldEq1 = textFieldEq1;
	}



	public JTextField getTextFieldEq2() {
		return textFieldEq2;
	}



	public void setTextFieldEq2(JTextField textFieldEq2) {
		this.textFieldEq2 = textFieldEq2;
	}



	public JTextField getTextFieldEq3() {
		return textFieldEq3;
	}



	public void setTextFieldEq3(JTextField textFieldEq3) {
		this.textFieldEq3 = textFieldEq3;
	}



	public JTextField getTextFieldEq4() {
		return textFieldEq4;
	}



	public void setTextFieldEq4(JTextField textFieldEq4) {
		this.textFieldEq4 = textFieldEq4;
	}



	public JTextField getTextFieldEq5() {
		return textFieldEq5;
	}



	public void setTextFieldEq5(JTextField textFieldEq5) {
		this.textFieldEq5 = textFieldEq5;
	}



	public JTextField getTextFieldEq6() {
		return textFieldEq6;
	}



	public void setTextFieldEq6(JTextField textFieldEq6) {
		this.textFieldEq6 = textFieldEq6;
	}



	public JTextField getTextFieldEq7() {
		return textFieldEq7;
	}



	public void setTextFieldEq7(JTextField textFieldEq7) {
		this.textFieldEq7 = textFieldEq7;
	}



	public JTextField getTextFieldEq8() {
		return textFieldEq8;
	}



	public void setTextFieldEq8(JTextField textFieldEq8) {
		this.textFieldEq8 = textFieldEq8;
	}



	public JTextField getTextFieldSem1() {
		return textFieldSem1;
	}



	public void setTextFieldSem1(JTextField textFieldSem1) {
		this.textFieldSem1 = textFieldSem1;
	}



	public JTextField getTextFieldSem2() {
		return textFieldSem2;
	}



	public void setTextFieldSem2(JTextField textFieldSem2) {
		this.textFieldSem2 = textFieldSem2;
	}



	public JTextField getTextFieldSem3() {
		return textFieldSem3;
	}



	public void setTextFieldSem3(JTextField textFieldSem3) {
		this.textFieldSem3 = textFieldSem3;
	}



	public JTextField getTextFieldSem4() {
		return textFieldSem4;
	}



	public void setTextFieldSem4(JTextField textFieldSem4) {
		this.textFieldSem4 = textFieldSem4;
	}



	public JTextField getTextFieldFinal1() {
		return textFieldFinal1;
	}



	public void setTextFieldFinal1(JTextField textFieldFinal1) {
		this.textFieldFinal1 = textFieldFinal1;
	}



	public JTextField getTextFieldFinal2() {
		return textFieldFinal2;
	}



	public void setTextFieldFinal2(JTextField textFieldFinal2) {
		this.textFieldFinal2 = textFieldFinal2;
	}



	public JTextField getTextFieldGanador() {
		return textFieldGanador;
	}



	public void setTextFieldGanador(JTextField textFieldGanador) {
		this.textFieldGanador = textFieldGanador;
	}



	public JTextField getTextFieldSegundo() {
		return textFieldSegundo;
	}



	public void setTextFieldSegundo(JTextField textFieldSegundo) {
		this.textFieldSegundo = textFieldSegundo;
	}



	public JTextField getTextFieldTercero() {
		return textFieldTercero;
	}



	public void setTextFieldTercero(JTextField textFieldTercero) {
		this.textFieldTercero = textFieldTercero;
	}



	public JTextField getTextFieldCuarto() {
		return textFieldCuarto;
	}



	public void setTextFieldCuarto(JTextField textFieldCuarto) {
		this.textFieldCuarto = textFieldCuarto;
	}



}
