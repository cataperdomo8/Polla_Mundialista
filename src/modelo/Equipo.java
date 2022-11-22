package modelo;

import java.util.Vector;

public class Equipo {
	Vector<Integer> goles=new Vector<Integer>();
	String nombre="";
	int golesAFavor=0;
	int golesEnContra=0;
	int puntos=0;

	public Equipo(String nombre){
		this.nombre=nombre;
		for(int i=0;i<3;i++){
			goles.add(0);
		}
	}

	/**
	 * Volver todo en 0
	 */
	public void reiniciar(){
		for(int i=0;i<3;i++){
			goles.add(0);
		}
		golesAFavor=0;
		golesEnContra=0;
		puntos=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Integer> getGoles() {
		return goles;
	}

	public void setGoles(Vector<Integer> goles) {
		this.goles = goles;
	}

	public int getGolesAFavor() {
		return golesAFavor;
	}

	public void setGolesAFavor(int golesAFavor) {
		this.golesAFavor = this.golesAFavor+golesAFavor;
	}

	public int getGolesEnContra() {
		return golesEnContra;
	}

	public void setGolesEnContra(int golesEnContra) {
		this.golesEnContra = this.golesEnContra+golesEnContra;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = this.puntos+puntos;
	}
}
