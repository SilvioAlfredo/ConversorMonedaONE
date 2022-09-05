package ar.desafio.conversor.logica;

import java.util.Scanner;

public class ConvertirPesoArgentino {
	private double pesoArgentino = 1.0;
	private double dolar = 0.0072;
	private double euro = 0.0072;
	private double libraEsterlina= 0.0062;
	private double yenJapones = 1.0;
	private double wonSeulCoreano = 9.67;
	

	public void pesoArgentinoADolar(double valorEntrada){
		double conversiónPesoArgentinoADolar = ((valorEntrada * dolar)/pesoArgentino);
		System.out.println("Su valor convertido es: "+conversiónPesoArgentinoADolar);
	}
	public void pesoArgentinoAEuro(double valorEntrada){
		double conversiónPesoArgentinoAEuro = ((valorEntrada * euro)/pesoArgentino);
		System.out.println("Su valor convertido es: "+conversiónPesoArgentinoAEuro);
	}
	public void pesoArgentinoALibraEsterlina(double valorEntrada){
		double conversiónPesoArgentinoALibraEsterlina = ((valorEntrada * libraEsterlina)/pesoArgentino);
		System.out.println("Su valor convertido es: "+conversiónPesoArgentinoALibraEsterlina);
	}
	public void pesoArgentinoAYenJapones(double valorEntrada){
		double conversiónPesoArgentinoAYenJapones = ((valorEntrada * yenJapones)/pesoArgentino);
		System.out.println("Su valor convertido es: "+conversiónPesoArgentinoAYenJapones);
	}
	public void pesoArgentinoAWonSeulCoreano(double valorEntrada){
		double conversiónPesoArgentinoAWonSeulCoreano= ((valorEntrada * wonSeulCoreano)/pesoArgentino);
		System.out.println("Su valor convertido es: "+conversiónPesoArgentinoAWonSeulCoreano);
	}
	
}
