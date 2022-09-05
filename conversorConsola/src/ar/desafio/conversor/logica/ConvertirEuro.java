package ar.desafio.conversor.logica;


public class ConvertirEuro {
	private double euro = 1.0;
	private double dolar = 1.0;
	private double libraEsterlina= 0.86;
	private double yenJapones = 139.35;
	private double wonSeulCoreano = 1345.58;
	private double pesoArgentino = 139.32;

	public void euroADolar(double valorEntrada){
		double conversiónEuroADolar = ((valorEntrada * dolar)/euro);
		System.out.println("Su valor convertido es: "+conversiónEuroADolar);
	}
	public void euroALibraEsterlina(double valorEntrada){
		double conversiónEuroALibraEsterlina = ((valorEntrada * libraEsterlina)/euro);
		System.out.println("Su valor convertido es: "+conversiónEuroALibraEsterlina);
	}
	public void euroAYenJapones(double valorEntrada){
		double conversiónEuroAYenJapones = ((valorEntrada * yenJapones)/euro);
		System.out.println("Su valor convertido es: "+conversiónEuroAYenJapones);
	}
	public void euroAWonSeulCoreano(double valorEntrada){
		double conversiónEuroAWonSeulCoreano= ((valorEntrada * wonSeulCoreano)/euro);
		System.out.println("Su valor convertido es: "+conversiónEuroAWonSeulCoreano);
	}
	public void euroAPesoArgentino(double valorEntrada){
		double conversiónEuroAPesoArgentino = ((valorEntrada * pesoArgentino)/euro);
		System.out.println("Su valor convertido es: "+conversiónEuroAPesoArgentino);
	}
}
