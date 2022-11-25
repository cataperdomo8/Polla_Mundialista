package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if (e.getSource()==vista.getBoton1()) {
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(true);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton2()) {
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(true);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton3()) {
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(true);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton4()){
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(true);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton5()){
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(true);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton6()){
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(true);
			vista.getPanelGH().setVisible(false);
		}else if(e.getSource()==vista.getBoton7()){
			vista.getPanelGA().setVisible(false);
			vista.getPanelGB().setVisible(false);
			vista.getPanelGC().setVisible(false);
			vista.getPanelGD().setVisible(false);
			vista.getPanelGE().setVisible(false);
			vista.getPanelGF().setVisible(false);
			vista.getPanelGG().setVisible(false);
			vista.getPanelGH().setVisible(true);
		}
	}

}