package launcher;

import controlador.Controller;
import vista.Ventana;

public class Launcher {
	public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Controller c = new Controller(ventana);
    }

}
