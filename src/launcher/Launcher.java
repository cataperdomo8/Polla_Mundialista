package launcher;

import controlador.Controller;
import modelo.FasesGrupos;
import vista.Ventana;

public class Launcher {
	public static void main(String[] args) {
        Ventana ventana = new Ventana();
        FasesGrupos grupos = new FasesGrupos(ventana);
        Controller c = new Controller(grupos,ventana);
    }

}
