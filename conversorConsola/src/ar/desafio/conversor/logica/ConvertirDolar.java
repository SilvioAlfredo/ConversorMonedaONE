package ar.desafio.conversor.logica;


public class ConvertirDolar {
	
	private double dolar = 1.0;
	private double euro = 1.0;
	private double libraEsterlina= 0.86;
	private double yenJapones = 138.79;
	private double wonSeulCoreano = 1342.86;
	private double pesoArgentino = 138.72;
	
	
	public void dolarAEuro(double valor){
		double conversiónDolaraEuro = ((valor * euro)/dolar);
		System.out.println("Su valor convertido es: "+conversiónDolaraEuro);
	}
	public void dolaraLibraEsterlina(double valor){
		double conversiónDolarALibraEsterlina = ((valor * libraEsterlina)/dolar);
		System.out.println("Su valor convertido es: "+conversiónDolarALibraEsterlina);
	}
	public void dolarAYenJapones(double valor){
		double conversiónDolarAYenJapones = ((valor * yenJapones)/dolar);
		System.out.println("Su valor convertido es: "+conversiónDolarAYenJapones);
	}
	public void dolarAWonSeulCoreano(double valor){
		double conversiónDolarAWonSeulCoreano= ((valor * wonSeulCoreano)/dolar);
		System.out.println("Su valor convertido es: "+conversiónDolarAWonSeulCoreano);
	}
	public void dolarAPesoArgentino(double valor){
		double conversiónDolarAPesoArgentino = ((valor * pesoArgentino)/dolar);
		System.out.println("Su valor convertido es: "+conversiónDolarAPesoArgentino);
	}
	
	

}
