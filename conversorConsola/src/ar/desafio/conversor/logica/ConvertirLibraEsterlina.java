package ar.desafio.conversor.logica;


public class ConvertirLibraEsterlina {
	private double libraEsterlina= 1.0;
	private double dolar = 1.16;
	private double euro = 1.16;
	private double yenJapones = 161.19;
	private double wonSeulCoreano = 1558.39;
	private double pesoArgentino = 161.12;
	
	public void libraEsterlinaADolar(double valorEntrada){
		double conversiónLibraEsterlinaADolar = ((valorEntrada * dolar)/libraEsterlina);
		System.out.println("Su valor convertido es: "+conversiónLibraEsterlinaADolar);
	}
	
	public void libraEsterlinaAEuro(double valorEntrada){
		double conversiónLibraEsterlinaAEuro = ((valorEntrada * euro)/libraEsterlina);
		System.out.println("Su valor convertido es: "+conversiónLibraEsterlinaAEuro);
	}
	
	public void libraEsterlinaAYenJapones(double valorEntrada){
		double conversiónLibraEsterlinaAYenJapones = ((valorEntrada * yenJapones)/libraEsterlina);
		System.out.println("Su valor convertido es: "+conversiónLibraEsterlinaAYenJapones);
	}
	public void libraEsterlinaAWonSeulCoreano(double valorEntrada){
		double conversiónLibraEsterlinaAWonSeulCoreano= ((valorEntrada * wonSeulCoreano)/libraEsterlina);
		System.out.println("Su valor convertido es: "+conversiónLibraEsterlinaAWonSeulCoreano);
	}
	public void libraEsterlinaAPesoArgentino(double valorEntrada){
		double conversiónLibraEsterlinaAPesoArgentino = ((valorEntrada * pesoArgentino)/libraEsterlina);
		System.out.println("Su valor convertido es: "+conversiónLibraEsterlinaAPesoArgentino);
	}
}
