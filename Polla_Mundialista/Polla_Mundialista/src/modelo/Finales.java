package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import vista.Ventana2;

public class Finales {
	public int total = 0;
	public Ventana2 vista;

	public Finales (Ventana2 v){
		this.vista = v;
	}

	public String[] split_list(String line, String c){
		String[] parts = line.split(c);
		return parts;
	}

	public int octavos(String line) {
		String[] matches = split_list(line, ","); // ["2-1","3-2","4-5","0-0","1-2","0-0"]
		int contador = 0; // acumulador de puntos

		for (int i = 0; i< matches.length; i++){

			String[] orden = split_list(matches[i], "-"); //["2", "1"]... -- GUARDA EL RESULTADO DE UN PARTIDO

			// CAPTURA DE MARCADOR REAL
			int result_A =  Integer.parseInt(orden[0]); // 2
			int result_B =  Integer.parseInt(orden[1]); // 1

			// CAPTURA DE MARCADOR REGISTRADO POR EL USUARIO
			int team_a = 0;
			int team_b = 0;

			switch (i) {
			case 0: { // "0" PARTIDO 1° 1A vs 2B

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1A().getText());
				team_b = Integer.parseInt(vista.getTextField2B().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2° 1C vs 2D

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1C().getText());
				team_b = Integer.parseInt(vista.getTextField2D().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3° 1E vs 2F

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1E().getText());
				team_b = Integer.parseInt(vista.getTextField2F().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4° 1G vs 2H

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1G().getText());
				team_b = Integer.parseInt(vista.getTextField2H().getText());
				break;
			}
			case 4: { // "0" PARTIDO 5° 1B vs 2A

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1B().getText());
				team_b = Integer.parseInt(vista.getTextField2A().getText());

				break;
			}
			case 5: {// "1" PARTIDO 6° 1D vs 2C

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1D().getText());
				team_b = Integer.parseInt(vista.getTextField2C().getText());

				break;
			}
			case 6: {// "1" PARTIDO 7° 1F vs 2E

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1F().getText());
				team_b = Integer.parseInt(vista.getTextField2E().getText());
				break;
			}
			case 7: {// "1" PARTIDO 8° 1H vs 2G

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextField1H().getText());
				team_b = Integer.parseInt(vista.getTextField2G().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Llaves Octavos Puntos 5
			if (team_a==result_A && team_b==result_B){
				contador += 5;
			}

		}
		return contador;

	}

	public int cuartos(String line) {
		String[] matches = split_list(line, ","); // ["2-1","3-2","4-5","0-0","1-2","0-0"]
		int contador = 0; // acumulador de puntos

		for (int i = 0; i< matches.length; i++){

			String[] orden = split_list(matches[i], "-"); //["2", "1"]... -- GUARDA EL RESULTADO DE UN PARTIDO

			// CAPTURA DE MARCADOR REAL
			int result_A =  Integer.parseInt(orden[0]); // 2
			int result_B =  Integer.parseInt(orden[1]); // 1

			// CAPTURA DE MARCADOR REGISTRADO POR EL USUARIO
			int team_a = 0;
			int team_b = 0;
			switch (i) {
			case 0: { // "0" PARTIDO 1° 1A o 2B - 1C o 2D

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldEq1().getText());
				team_b = Integer.parseInt(vista.getTextFieldEq2().getText());

				break;
			}
			case 1: { // "1" PARTIDO 2° 1E o 2F - 1G o 2H

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldEq3().getText());
				team_b = Integer.parseInt(vista.getTextFieldEq4().getText());

				break;
			}
			case 2: { // "2" PARTIDO 3° 1B o 2A - 1D o 2C

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldEq5().getText());
				team_b = Integer.parseInt(vista.getTextFieldEq6().getText());

				break;
			}
			case 3: { // "3" PARTIDO 4° 1F o 2E - 1H o 2G

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldEq7().getText());
				team_b = Integer.parseInt(vista.getTextFieldEq8().getText());

				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador de Octavos
			if (team_a==result_A){
				contador += 3;
			}
			if(team_b==result_B) {
				contador += 3;
			}

		}
		return contador;

	}

	public int semifinal(String line) {
		String[] matches = split_list(line, ","); // ["2-1","3-2","4-5","0-0","1-2","0-0"]
		int contador = 0; // acumulador de puntos

		for (int i = 0; i< matches.length; i++){

			String[] orden = split_list(matches[i], "-"); //["2", "1"]... -- GUARDA EL RESULTADO DE UN PARTIDO

			// CAPTURA DE MARCADOR REAL
			int result_A =  Integer.parseInt(orden[0]); // 2
			int result_B =  Integer.parseInt(orden[1]); // 1

			// CAPTURA DE MARCADOR REGISTRADO POR EL USUARIO
			int team_a = 0;
			int team_b = 0;
			switch (i) {
			case 0: { // "0" PARTIDO 1° semi1-semi2

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldSem1().getText());
				team_b = Integer.parseInt(vista.getTextFieldSem2().getText());

				break;
			}
			case 1: { // "1" PARTIDO 2° semi3-semi4

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldSem3().getText());
				team_b = Integer.parseInt(vista.getTextFieldSem4().getText());

				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador de Cuartos
			if (team_a==result_A){
				contador += 5;
			}
			if(team_b==result_B) {
				contador += 5;
			}

		}
		return contador;

	}

	public int finalista(String line) {
		String[] matches = split_list(line, ","); // ["2-1","3-2","4-5","0-0","1-2","0-0"]
		int contador = 0; // acumulador de puntos

		for (int i = 0; i< matches.length; i++){

			String[] orden = split_list(matches[i], "-"); //["2", "1"]... -- GUARDA EL RESULTADO DE UN PARTIDO

			// CAPTURA DE MARCADOR REAL
			int result_A =  Integer.parseInt(orden[0]); // 2
			int result_B =  Integer.parseInt(orden[1]); // 1

			// CAPTURA DE MARCADOR REGISTRADO POR EL USUARIO
			int team_a = 0;
			int team_b = 0;
			switch (i) {
			case 0: { // "0" PARTIDO 1° final1-final2

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldFinal1().getText());
				team_b = Integer.parseInt(vista.getTextFieldFinal2().getText());

				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador de Semifinales
			if (team_a==result_A){
				contador += 5;
			}
			if(team_b==result_B) {
				contador += 5;
			}

		}
		return contador;

	}

	public int ganadores(String line) {
		String[] matches = split_list(line, ","); // ["2-1","3-2","4-5","0-0","1-2","0-0"]
		int contador = 0; // acumulador de puntos

		// CAPTURA DE MARCADOR REAL
		int result_A =  Integer.parseInt(matches[0]); // 2
		int result_B =  Integer.parseInt(matches[1]); // 1
		int result_C =  Integer.parseInt(matches[2]); // 2
		int result_D =  Integer.parseInt(matches[3]); // 1

		// CAPTURA DE MARCADOR REGISTRADO POR EL USUARIO
		
		int team_a = Integer.parseInt(vista.getTextFieldGanador().getText());
		int team_b = Integer.parseInt(vista.getTextFieldSegundo().getText());
		int team_c = Integer.parseInt(vista.getTextFieldTercero().getText());
		int team_d = Integer.parseInt(vista.getTextFieldCuarto().getText());

		//Podio
		if (team_a==result_A){
			contador += 5;
		}
		if(team_b==result_B) {
			contador += 5;
		}
		if (team_c==result_C){
			contador += 5;
		}
		if(team_d==result_D) {
			contador += 5;
		}
		return contador;


	}

	public void find_group(String line, int line_count) {
		switch (line_count){
		case 0: {// octavos
			this.total += octavos(line);
			break;
		}
		case 1: {// cuartos
			this.total += cuartos(line);
			break;
		}
		case 2: {// semifinal
			this.total += semifinal(line);
			break;
		}
		case 3: {// finalista
			this.total += finalista(line);
			break;
		}
		case 4: {// ganadores
			this.total += ganadores(line);
			break;
		}
		default:{
			System.out.println("¡Valimos madres!");
			break;
		}
		}

	}

	public void lectura(String path) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File (path);
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			int total = 0;
			int countLinea=0;
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
				find_group(linea, countLinea);
				countLinea += 1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try{
				if( null != fr ){
					fr.close();
				}
			}catch (Exception e2){
				e2.printStackTrace();
			}
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
