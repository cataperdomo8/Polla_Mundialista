package launcher;

import controlador.Controller;
import modelo.FasesGrupos;
import modelo.Finales;
import vista.Ventana;
import vista.Ventana2;

public class Launcher {
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		Ventana2 ventana2 = new Ventana2();
        FasesGrupos grupos = new FasesGrupos(ventana);
        Finales finales = new Finales(ventana2);
        Controller c = new Controller(grupos,finales,ventana,ventana2);
    }

}
