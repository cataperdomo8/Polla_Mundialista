package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.FasesGrupos;
import vista.Panel;
import vista.Ventana;

public class Controller implements ActionListener{
	
	private Ventana vista;
	private FasesGrupos grupos;
	
	public Controller (FasesGrupos g, Ventana v){
        this.vista = v;
        this.grupos = g;
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
		}else if(e.getSource()==vista.getbContinuar()) {
			grupos.lectura("Resultados.txt");
			JOptionPane.showMessageDialog(null, "Total Puntos "+grupos.getTotal());
			System.out.println(grupos.getTotal());
		}
	}

}
