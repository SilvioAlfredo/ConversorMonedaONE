package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.conversor.logica.*;

public class EscuchadorEntrada implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String entrada = (String)e.getActionCommand();
		System.out.println(entrada +" Entrada");
		
		if(entrada.equals("Dolar")) {
			
			int dolarEntrada = 1;
			entrada(dolarEntrada);
			
		}else if(entrada.equals("Euro")) {
			int entradaEuro = 2;
			entrada(entradaEuro);
		}else if(entrada.equals("Libras Esterlina")) {
			int entradaLibraEsterlina = 3;
			entrada(entradaLibraEsterlina);	
		}else if(entrada.equals("Yen Japones")) {
			int entradaYenJapones = 4;
			entrada(entradaYenJapones);
		}
		else if(entrada.equals("Won Seul-Coreano")) {
			int entradaWonSurCoreano = 5;
			entrada(entradaWonSurCoreano);
		}
		else if(entrada.equals("Peso Argentino")) {
			int entradaPesoArgentino = 6;
			entrada(entradaPesoArgentino);
		}
		
	}
	protected int valorEntrada;
	public void entrada(int valorEnter) {
		System.out.println("El valor de entrada es: "+valorEnter);
		valorEntrada= valorEnter;
	}
	
}

	
