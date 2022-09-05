package com.conversor.logica;

import java.util.Scanner;

public class ConvertirWonSeulCoreano{
	private double wonSeulCoreano = 1.0;
	private double dolar = 0.00075;
	private double euro = 0.00074;
	private double libraEsterlina= 0.00064;
	private double yenJapones = 0.10;
	private double pesoArgentino = 0.10;
	

	public void wonSeulCoreanoADolar(double valorEntrada){
		double conversiónWonSeulCoreanoADolar= ((valorEntrada * dolar)/wonSeulCoreano);
		System.out.println(conversiónWonSeulCoreanoADolar);
	}
	
	public void wonSeulCoreanoAEuro(double valorEntrada){
		double conversiónWonSeulCoreanoAEuro = ((valorEntrada * euro)/wonSeulCoreano);
		System.out.println(conversiónWonSeulCoreanoAEuro);
	}
	public void wonSeulCoreanoALibraEsterlina(double valorEntrada){
		double conversiónWonSeulCoreanoALibraEsterlina = ((valorEntrada * libraEsterlina)/wonSeulCoreano);
		System.out.println(conversiónWonSeulCoreanoALibraEsterlina);
	}
	public void wonSeulCoreanoAYenJapones(double valorEntrada){
		double conversiónWonSeulCoreanoAYenJapones = ((valorEntrada * yenJapones)/wonSeulCoreano);
		System.out.println(conversiónWonSeulCoreanoAYenJapones);
	}

	public void wonSeulCoreanoAPesoArgentino(double valorEntrada){
		double conversiónWonSeulCoreanoAPesoArgentino = ((valorEntrada * pesoArgentino)/wonSeulCoreano);
		System.out.println(conversiónWonSeulCoreanoAPesoArgentino);
	}
}
