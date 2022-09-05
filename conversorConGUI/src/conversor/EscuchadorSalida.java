package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.conversor.logica.ProcesrFormatoSalida;

public class EscuchadorSalida extends EscuchadorEntrada  implements ActionListener{


	
	int valorSalida;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String salida = (String)e.getActionCommand();
		System.out.println(salida +" Salida");
		
		if(salida.equals("Dolar")) {
			
			int dolarSalida = 1;
			salida(dolarSalida);
			
		}else if(salida.equals("Euro")) {
			int salidaEuro = 2;
			salida(salidaEuro);
			
		}else if(salida.equals("Libra Esterlina")) {
			int salidaLibraEsterlina = 3;
			salida(salidaLibraEsterlina);
			
		}else if(salida.equals("Yen Japones")) {
			int salidaYenJapones = 4;
			salida(salidaYenJapones);
			
		}
		else if(salida.equals("Won Seul-Coreano")) {
			int salidaWonSurCoreano = 5;
			salida(salidaWonSurCoreano);
			
		}
		else if(salida.equals("Peso Argentino")) {
			int salidaPesoArgentino = 6;
			salida(salidaPesoArgentino);
			
		}
		
		
	}
	public void salida(int valorOuput) {
		valorSalida = valorOuput;
		System.out.println("El valor de entrada es: "+valorEntrada+ " " +"El valor de salida es: " +valorSalida);
		if(valorEntrada != valorSalida) {
			procesarElementos(valorEntrada, valorSalida);
		}else {
			JOptionPane.showMessageDialog(null, "No se puede seleccionar la misma moneda!.", "Advertencia!",
					JOptionPane.WARNING_MESSAGE);
		}
		
	}
	public void procesarElementos(int valorEntrada, int valorSalida){
		System.out.println("acá estoy!");
		ProcesrFormatoSalida procesarFormato = new ProcesrFormatoSalida();
		procesarFormato.validarEntradaYSalida(valorEntrada, valorSalida);
	}

}
