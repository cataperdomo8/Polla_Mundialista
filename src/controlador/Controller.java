package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Panel;
import vista.Ventana;

public class Controller implements ActionListener{
	
	private Ventana vista;
	
	public Controller (Ventana v){
        this.vista = v;
        this.vista.setController(this);
       
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==vista.getBoton0()) {
			vista.getPanelGA().setVisible(true);
			vista.getPanelGB().setVisible(false);
			/*vista.getPanelGA().setVisible(false);
			vista.getPanelGA().setVisible(false);
			vista.getPanelGA().setVisible(false);
			vista.getPanelGA().setVisible(false);
			vista.getPanelGA().setVisible(false);
			vista.getPanelGA().setVisible(false);*/
		}else if (e.getSource()==vista.getBoton1()) {
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(true);
		}
		
	}

}
