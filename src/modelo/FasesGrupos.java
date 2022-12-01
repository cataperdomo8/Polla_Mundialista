package modelo;

import java.io.*;

import vista.Ventana;

public class FasesGrupos{ 
	public int total = 0;
	public Ventana vista;
	
	public FasesGrupos (Ventana v){
		this.vista = v;
	}

	public String[] split_list(String line, String c){
		String[] parts = line.split(c);
		return parts;
	}

	public int grupoA(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGA11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGA12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoB(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGB11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGB12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoC(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGC11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGC12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoD(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGD11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGD12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoE(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGE11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGE12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoF(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGF11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGF12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoG(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGG11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGG12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public int grupoH(String line) { // 2-1, 3-2, 4-5, 0-0, 1-2, 0-0

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

			switch (i){
			case 0: { // "0" PARTIDO 1°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH1().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH2().getText());

				break;
			}
			case 1: {// "1" PARTIDO 2°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH3().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH4().getText());

				break;
			}
			case 2: {// "1" PARTIDO 3°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH5().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH6().getText());
				break;
			}
			case 3: {// "1" PARTIDO 4°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH7().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH8().getText());
				break;
			}
			case 4: {// "1" PARTIDO 5°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH9().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH10().getText());
				break;
			}
			case 5: {// "1" PARTIDO 6°

				// CAPTURA DE CAJAS
				team_a = Integer.parseInt(vista.getTextFieldGH11().getText());
				team_b = Integer.parseInt(vista.getTextFieldGH12().getText());
				break;
			}
			default:{
				System.out.println("¡Valimos madres!");
			}
			}

			//Ganador
			if (team_a == team_b && result_A == result_B){
				contador += 3;
			}else if (team_a > team_b && result_A > result_B){
				contador += 3;
			}else if (team_a < team_b && result_A < result_B){
				contador += 3;
			}

			//Marcador
			if(team_a == result_A && team_b == result_B) {
				contador+=5;
			}
		}

		return contador;

	}

	public void find_group(String line, int line_count){

		switch (line_count){
		case 0: {// Grupo A
			this.total += grupoA(line);
			break;
		}
		case 1: {// Grupo B
			this.total += grupoB(line);
			break;
		}
		case 2: {// Grupo C
			this.total += grupoC(line);
			break;
		}
		case 3: {// Grupo D
			this.total += grupoD(line);
			break;
		}
		case 4: {// Grupo E
			this.total += grupoE(line);
			break;
		}
		case 5: {// Grupo F
			this.total += grupoF(line);
			break;
		}
		case 6: {// Grupo G
			this.total += grupoG(line);
			break;
		}
		case 7: {// Grupo H
			this.total += grupoH(line);
			break;
		}
		default:{
			System.out.println("¡Valimos madres!");
			break;
		}
		}
		System.out.println(this.total);

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
