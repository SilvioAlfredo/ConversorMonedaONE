package ar.desafio.conversor.logica;

import java.util.Scanner;

public class ProcesrFormatoSalida {
	ConvertirDolar convertirDolar = new ConvertirDolar();
	ConvertirEuro convertirEuro = new ConvertirEuro();
	ConvertirLibraEsterlina convertirLibraEsterlina = new ConvertirLibraEsterlina();
	ConvertirYenJapones convertirYenJapones = new ConvertirYenJapones();
	ConvertirWonSeulCoreano convertirWonSeulCoreano = new ConvertirWonSeulCoreano();
	ConvertirPesoArgentino convertirPesoArgentino= new ConvertirPesoArgentino();
	
	ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
	
	
		
	
	public void validarEntradaYSalida( int entrada, int salida) {
		System.out.println("Introduzca un valor para convertir!");
		
		Scanner teclado = new Scanner (System.in);
		double entradaMonto = teclado.nextDouble();
		if (entrada == 1 && salida == 1 || entrada == 1 && salida == 2 || entrada == 1 && salida == 3 
				|| entrada == 1 && salida == 4 || entrada == 1 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				//Esta parte está terminada
				if(entrada == 1 && salida == 1) {
					convertirDolar.dolarAEuro(valorEntrada);
				}else if(entrada == 1 && salida == 2) {
					convertirDolar.dolaraLibraEsterlina(valorEntrada);
				}else if(entrada == 1 && salida == 3) {
					convertirDolar.dolarAYenJapones(valorEntrada);
				}else if(entrada == 1 && salida == 4) {
					convertirDolar.dolarAWonSeulCoreano(valorEntrada);
				}else if(entrada == 1 && salida == 5) {
					convertirDolar.dolarAPesoArgentino(valorEntrada);
				}
			}
		}else if(entrada == 2 && salida == 1 || entrada == 2 && salida == 2 || entrada == 2 && salida == 3 
				|| entrada == 2 && salida == 4 || entrada == 2 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				//Esta parte está terminada
				if(entrada == 2 && salida == 1) {
					convertirEuro.euroADolar(valorEntrada);
				}else if(entrada == 2 && salida == 2) {
					convertirEuro.euroALibraEsterlina(valorEntrada);
				}else if(entrada == 2 && salida == 3) {
					convertirEuro.euroAYenJapones(valorEntrada);
				}else if(entrada == 2 && salida == 4) {
					convertirEuro.euroAWonSeulCoreano(valorEntrada);
				}else if(entrada == 2 && salida == 5) {
					convertirEuro.euroAPesoArgentino(valorEntrada);
				}
			}
		}else if(entrada == 3 && salida == 1 || entrada == 3 && salida == 2 || entrada == 3 && salida == 3 
				|| entrada == 3 && salida == 4 || entrada == 3 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				//Esta parte está terminada
				if(entrada == 1 && salida == 1) {
					convertirLibraEsterlina.libraEsterlinaADolar(valorEntrada);
				}else if(entrada == 3 && salida == 2) {
					convertirLibraEsterlina.libraEsterlinaAEuro(valorEntrada);
				}else if(entrada == 3 && salida == 3) {
					convertirLibraEsterlina.libraEsterlinaAYenJapones(valorEntrada);
				}else if(entrada == 3 && salida == 4) {
					convertirLibraEsterlina.libraEsterlinaAWonSeulCoreano(valorEntrada);
				}else if(entrada == 3 && salida == 5) {
					convertirLibraEsterlina.libraEsterlinaAPesoArgentino(valorEntrada);
				}
			}
		}else if(entrada == 4 && salida == 1 || entrada == 4 && salida == 2 || entrada == 4 && salida == 3 
				|| entrada == 4 && salida == 4 || entrada == 4 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				//Esta parte está terminada
				if(entrada == 4 && salida == 1) {
					convertirYenJapones.yenJaponesADolar(valorEntrada);
				}else if(entrada == 4 && salida == 2) {
					convertirYenJapones.yenJaponesAEuro(valorEntrada);
				}else if(entrada == 4 && salida == 3) {
					convertirYenJapones.yenJaponesALibraEsterlina(valorEntrada);
				}else if(entrada == 4 && salida == 4) {
					convertirYenJapones.yenJaponesAWonSeulCoreano(valorEntrada);
				}else if(entrada == 4 && salida == 5) {
					convertirYenJapones.yenJaponesAPesoArgentino(valorEntrada);
				}
			}
		}else if(entrada == 5 && salida == 1 || entrada == 5 && salida == 2 || entrada == 5 && salida == 3 
				|| entrada == 5 && salida == 4 || entrada == 5 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				if(entrada == 5 && salida == 1) {
					convertirWonSeulCoreano.wonSeulCoreanoADolar(valorEntrada);
				}else if(entrada == 5 && salida == 2) {
					convertirWonSeulCoreano.wonSeulCoreanoAEuro(valorEntrada);
				}else if(entrada == 5 && salida == 3) {
					convertirWonSeulCoreano.wonSeulCoreanoALibraEsterlina(valorEntrada);
				}else if(entrada == 5 && salida == 4) {
					convertirWonSeulCoreano.wonSeulCoreanoAYenJapones(valorEntrada);
				}else if(entrada == 5 && salida == 5) {
					convertirWonSeulCoreano.wonSeulCoreanoAPesoArgentino(valorEntrada);
				}
			}
		}else if(entrada == 6 && salida == 1 || entrada == 6 && salida == 2 || entrada == 6 && salida == 3 
				|| entrada == 6 && salida == 4 || entrada == 6 && salida == 5 ) {
			double valorEntrada = entradaMonto;
			if(valorEntrada > 0.0) {
				if(entrada == 6 && salida == 1) {
					convertirPesoArgentino.pesoArgentinoADolar(valorEntrada);
				}else if(entrada == 6 && salida == 2) {
					convertirPesoArgentino.pesoArgentinoAEuro(valorEntrada);
				}else if(entrada == 6 && salida == 3) {
					convertirPesoArgentino.pesoArgentinoALibraEsterlina(valorEntrada);
				}else if(entrada == 6 && salida == 4) {
					convertirPesoArgentino.pesoArgentinoAYenJapones(valorEntrada);
				}else if(entrada == 6 && salida == 5) {
					convertirPesoArgentino.pesoArgentinoAWonSeulCoreano(valorEntrada);
				}
			}
		}
	}
}
