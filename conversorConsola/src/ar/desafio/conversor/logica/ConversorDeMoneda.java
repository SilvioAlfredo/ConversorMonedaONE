package ar.desafio.conversor.logica;

import java.util.Scanner;

public class ConversorDeMoneda {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		//Instrucciones.
		System.out.println("El siguiente programa ejecutará una orden que usted elija.");
		System.out.println("Introduzca un numero por teclado, correspondiente a una de las opciones que aparecen en pantalla");
		
		System.out.println("Seleccione una moneda para la entrada");
		System.out.println("1- Dolar. ");
		System.out.println("2- Euro. ");
		System.out.println("3- Libra Esterlina. ");
		System.out.println("4- Yen Japones. ");
		System.out.println("5- Won Seul-Coreano. ");
		System.out.println("6- Peso Argentino. ");
		
		int entrada = teclado.nextInt();
		
		switch(entrada) {
			case 1://caso terminado pendiente valores de variables
				System.out.println("usted eligió Dolar, ahora seleccione un formato de salida");
				
				System.out.println("1- Euro. ");
				System.out.println("2- Libra Esterlina. ");
				System.out.println("3- Yen Japones. ");
				System.out.println("4- Won Seul-Coreano. ");
				System.out.println("5- Peso Argentino. ");
				
				int formatoSalida1= teclado.nextInt();
				ProcesrFormatoSalida procesaDolar = new ProcesrFormatoSalida();
				procesaDolar.validarEntradaYSalida(entrada, formatoSalida1);
				
				break;
				
			case 2://caso terminado pendiente valores de variables
				System.out.println("usted eligió Euro, ahora seleccione un formato de salida");
				
				System.out.println("1- Dolar. ");
				System.out.println("2- Libra Esterlina. ");
				System.out.println("3- Yen Japones. ");
				System.out.println("4- Won Seul-Coreano. ");
				System.out.println("5- Peso Argentino. ");
				
				int formatoSalida2= teclado.nextInt();
				ProcesrFormatoSalida procesaEuro = new ProcesrFormatoSalida();
				procesaEuro.validarEntradaYSalida(entrada, formatoSalida2);
				
			break;
			case 3:
				System.out.println("usted eligió Libra Esterlina, ahora seleccione un formato de salida");
				
				System.out.println("1- Dolar. ");
				System.out.println("2- Euro. ");
				System.out.println("3- Yen Japones. ");
				System.out.println("4- Won Seul-Coreano. ");
				System.out.println("5- Peso Argentino. ");
				
				int formatoSalida3= teclado.nextInt();
				ProcesrFormatoSalida procesaLibraEsterlina = new ProcesrFormatoSalida();
				procesaLibraEsterlina.validarEntradaYSalida(entrada, formatoSalida3);
				
			break;
			case 4:
				System.out.println("usted eligió Yen Japones, ahora seleccione un formato de salida");
				
				System.out.println("1- Dolar. ");
				System.out.println("2- Euro ");
				System.out.println("3- Libra Esterlina. ");
				System.out.println("4- Won Seul-Coreano. ");
				System.out.println("5- Peso Argentino. ");
				
				int formatoSalida4= teclado.nextInt();
				ProcesrFormatoSalida procesaYenJapones = new ProcesrFormatoSalida();
				procesaYenJapones.validarEntradaYSalida(entrada, formatoSalida4);
				
				
			break;
			case 5:
				System.out.println("usted eligió Won Seul-Coreano, ahora seleccione un formato de salida");
				
				System.out.println("1- Dolar. ");
				System.out.println("2- Euro. ");
				System.out.println("3- Libra Esterlina. ");
				System.out.println("4- Yen Japones. ");
				System.out.println("5- Peso Argentino. ");
				
				int formatoSalida5= teclado.nextInt();
				ProcesrFormatoSalida procesaWonSeulCoreano = new ProcesrFormatoSalida();
				procesaWonSeulCoreano.validarEntradaYSalida(entrada, formatoSalida5);
				
			break;
				
			case 6:
				System.out.println("usted eligió Peso Argentino, ahora seleccione un formato de salida");
				
				System.out.println("1- Dolar. ");
				System.out.println("2- Euro. ");
				System.out.println("3- Libra Esterlina. ");
				System.out.println("4- Yen Japones. ");
				System.out.println("5- Won Seul-Coreano. ");
				
				int formatoSalida6= teclado.nextInt();
				ProcesrFormatoSalida procesaPesoArgentino = new ProcesrFormatoSalida();
				procesaPesoArgentino.validarEntradaYSalida(entrada, formatoSalida6);
				
			break;
			}
		
	}
}
