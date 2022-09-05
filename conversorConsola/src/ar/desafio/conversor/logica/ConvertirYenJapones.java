package ar.desafio.conversor.logica;

public class ConvertirYenJapones {
	private double yenJapones = 1.0;
	private double dolar = 0.0072;
	private double euro = 0.0072;
	private double libraEsterlina= 0.0062;
	private double wonSeulCoreano = 9.66;
	private double pesoArgentino = 1.0;
	
	
	public void yenJaponesADolar(double valorEntrada){
		double conversiónYenJaponesDolar = ((valorEntrada * dolar)/yenJapones);
		System.out.println("Su valor convertido es: "+conversiónYenJaponesDolar);
	}
	public void yenJaponesAEuro(double valorEntrada){
		double conversiónYenJaponesEuro = ((valorEntrada * euro)/yenJapones);
		System.out.println("Su valor convertido es: "+conversiónYenJaponesEuro);
	}
	public void yenJaponesALibraEsterlina(double valorEntrada){
		double conversiónYenJaponesALibraEsterlina = ((valorEntrada * libraEsterlina)/yenJapones);
		System.out.println("Su valor convertido es: "+conversiónYenJaponesALibraEsterlina);
	}
	public void yenJaponesAWonSeulCoreano(double valorEntrada){
		double conversiónYenJaponesAWonSeulCoreano= ((valorEntrada * wonSeulCoreano)/yenJapones);
		System.out.println("Su valor convertido es: "+conversiónYenJaponesAWonSeulCoreano);
	}
	public void yenJaponesAPesoArgentino(double valorEntrada){
		double conversiónYenJaponesAPesoArgentino = ((valorEntrada * pesoArgentino)/yenJapones);
		System.out.println("Su valor convertido es: "+conversiónYenJaponesAPesoArgentino);
	}
}
