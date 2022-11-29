package Launcher;

import controlador.Controller;
import modelo.FasesGrupos;
import vista.Ventana;
import vista.Ventana2;
import java.awt.EventQueue;

public class Launcher {
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		Ventana2 ventana2 = new Ventana2();
		FasesGrupos grupos = new FasesGrupos(ventana);
		Controller c = new Controller(grupos,ventana,ventana2);	
	}

}
