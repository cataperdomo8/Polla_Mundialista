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
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(88, 24, 69));
		componentes();
	}
	
	private JLabel primero;
	private JLabel segundo;
	private JLabel tercero;
	private JLabel cuarto;
	private JLabel titulo;

	/*TextField Octvos de Final*/

	public JTextField textField1A=new JTextField();
	public JTextField textField1B=new JTextField();
	public JTextField textField1C=new JTextField();
	public JTextField textField1D=new JTextField();
	public JTextField textField1E=new JTextField();
	public JTextField textField1F=new JTextField();
	public JTextField textField1G=new JTextField();
	public JTextField textField1H =new JTextField();
	public JTextField textField2A=new JTextField();
	public JTextField textField2B=new JTextField();
	public JTextField textField2C=new JTextField();
	public JTextField textField2D=new JTextField();
	public JTextField textField2E=new JTextField();
	public JTextField textField2F=new JTextField();
	public JTextField textField2G=new JTextField();
	public JTextField textField2H =new JTextField();

	/*TextField Cuartos de Final*/

	public JTextField textFieldEq1 =new JTextField();
	public JTextField textFieldEq2 =new JTextField();
	public JTextField textFieldEq3 =new JTextField();
	public JTextField textFieldEq4 =new JTextField();
	public JTextField textFieldEq5 =new JTextField();
	public JTextField textFieldEq6 =new JTextField();
	public JTextField textFieldEq7 =new JTextField();
	public JTextField textFieldEq8 =new JTextField();

	/*TextField Semifinalistas*/

	public JTextField textFieldSem1 =new JTextField();
	public JTextField textFieldSem2 =new JTextField();
	public JTextField textFieldSem3 =new JTextField();
	public JTextField textFieldSem4 =new JTextField();

	/*TextField Finalistas*/

	public JTextField textFieldFinal1 =new JTextField();
	public JTextField textFieldFinal2 =new JTextField();
	
	/*Ganadores, perdedores, tercer, cuarto*/
	
	public JTextField textFieldGanador =new JTextField();
	public JTextField textFieldSegundo =new JTextField();
	public JTextField textFieldTercero =new JTextField();
	public JTextField textFieldCuarto =new JTextField();

	public void componentes() {
		inicializarPaneles();
		inicializarEtiquetas();
		inicializarOctavos();
		inicializarCuartos();
		inicializarSemifinal();
		inicializarFinal();
		Posiciones();
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

		panelImageGrupos = new Panel3("/imagen/grupos.jpeg");
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
	
	public void Posiciones() {
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

}