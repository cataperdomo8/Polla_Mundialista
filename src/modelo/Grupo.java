package modelo;

public class Grupo {
	String nombre="";
	Equipo e1;
	Equipo e2;
	Equipo e3;
	Equipo e4;

	public Grupo(String nom,Equipo eq1,Equipo eq2,Equipo eq3,Equipo eq4){
		this.nombre=nom;
		this.e1=eq1;
		this.e2=eq2;
		this.e3=eq3;
		this.e4=eq4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo getE1() {
		return e1;
	}

	public void setE1(Equipo e1) {
		this.e1 = e1;
	}

	public Equipo getE2() {
		return e2;
	}

	public void setE2(Equipo e2) {
		this.e2 = e2;
	}

	public Equipo getE3() {
		return e3;
	}

	public void setE3(Equipo e3) {
		this.e3 = e3;
	}

	public Equipo getE4() {
		return e4;
	}

	public void setE4(Equipo e4) {
		this.e4 = e4;
	}
}
