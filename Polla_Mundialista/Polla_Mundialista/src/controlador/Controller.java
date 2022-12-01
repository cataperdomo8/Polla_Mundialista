package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.FasesGrupos;
import modelo.Finales;
import vista.Panel;
import vista.Ventana;
import vista.Ventana2;

public class Controller implements ActionListener{
	
	private Ventana vista;
	private FasesGrupos grupos;
	private Finales finales;
	private Ventana2 vista2;
	
	public Controller (FasesGrupos g, Finales f, Ventana v, Ventana2 v2){
		this.vista = v;
		this.vista2 = v2;
		this.grupos = g;
		this.finales = f;
		this.vista.setController(this);
		this.vista2.setController(this);
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
		}else if(e.getSource()==vista.getbSiguienteFase()) {
			vista2.setVisible(true);
			vista.setVisible(false);
		}
		if(e.getSource()==vista2.getbContinuar()) {
			grupos.lectura("Resultados.txt");
			finales.lectura("ResultadosFase2.txt");
			JOptionPane.showMessageDialog(null, "Total Puntos "+(grupos.getTotal()+finales.getTotal()));
			System.out.println("total"+(grupos.getTotal()+finales.getTotal()));
			grupos.setTotal(0);
			finales.setTotal(0);
		}
	}

}
