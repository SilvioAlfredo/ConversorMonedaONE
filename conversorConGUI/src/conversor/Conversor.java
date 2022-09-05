package conversor;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.EventListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Conversor implements EventListener{

	private JFrame frame;
	private JTextField txtValorDeEntrada;
	private JTextField txtValorDeSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 940, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblConversorDeMonedas = new JLabel("Conversor de monedas.");
		lblConversorDeMonedas.setBackground(Color.BLACK);
		lblConversorDeMonedas.setFont( new Font("Serif", Font.BOLD, 24));

		//Labels y checkbox de entrada
		JLabel lblSelecioneSuFormato = new JLabel("Formato de entrada");
		
		JCheckBox chckbxDolarentrada = new JCheckBox("Dolar");
		JCheckBox chckbxEuroentrada = new JCheckBox("Euro");
		JCheckBox chckbxLibraesterlinaentrada = new JCheckBox("Libra Esterlina");
		JCheckBox chckbxYenjaponesentrada = new JCheckBox("Yen Japones");
		JCheckBox chckbxWonseulcoreanoentrada = new JCheckBox("Won Seul-Coreano");
		JCheckBox checkBoxPesoArgentinoEntrada = new JCheckBox("Peso Argentino");
		
		ButtonGroup botonesEntrada = new ButtonGroup();
		botonesEntrada.add(chckbxDolarentrada);
		botonesEntrada.add(chckbxEuroentrada);
		botonesEntrada.add(chckbxLibraesterlinaentrada);
		botonesEntrada.add(chckbxYenjaponesentrada);
		botonesEntrada.add(chckbxWonseulcoreanoentrada);
		botonesEntrada.add(checkBoxPesoArgentinoEntrada);
		
		//labels y checkbox de salida
		JLabel lblFormatoDeSalida = new JLabel("Formato de salida");
		
		JCheckBox chckbxDolarsalida = new JCheckBox("Dolar");
		JCheckBox chckbxEurosalida = new JCheckBox("Euro");
		JCheckBox chckbxLibrasterlinasalida = new JCheckBox("Libra Esterlina");
		JCheckBox chckbxYenjaponessalida = new JCheckBox("Yen Japones");
		JCheckBox chckbxWonseulcoreanosalida = new JCheckBox("Won Seul-Coreano");
		JCheckBox checkBoxPesoArgentinosalida = new JCheckBox("Peso Argentino");
		
		ButtonGroup botonesSalida = new ButtonGroup();
		botonesSalida.add(chckbxDolarsalida);
		botonesSalida.add(chckbxEurosalida);
		botonesSalida.add(chckbxLibrasterlinasalida);
		botonesSalida.add(chckbxYenjaponessalida);
		botonesSalida.add(chckbxWonseulcoreanosalida);
		botonesSalida.add(checkBoxPesoArgentinosalida);
		
		//Sección de input del usuario, boton de conversión y ouputs.
		JLabel lblIngreseUnValor = new JLabel("Ingrese un valor:");
		
		txtValorDeEntrada = new JTextField();
		txtValorDeEntrada.setText("Valor de Entrada");
		txtValorDeEntrada.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		
		JLabel lblValorConvertido = new JLabel("Valor convertido:");
		
		txtValorDeSalida = new JTextField();
		txtValorDeSalida.setText("Valor de salida");
		txtValorDeSalida.setColumns(10);
		
		//A partir de acá implemento los actionListeners.
		
		chckbxDolarentrada.addActionListener(new EscuchadorEntrada());
		chckbxEuroentrada.addActionListener(new EscuchadorEntrada());
		chckbxLibraesterlinaentrada.addActionListener(new EscuchadorEntrada());
		chckbxYenjaponesentrada.addActionListener(new EscuchadorEntrada());
		chckbxWonseulcoreanoentrada.addActionListener(new EscuchadorEntrada());
		checkBoxPesoArgentinoEntrada.addActionListener(new EscuchadorEntrada());
		
		chckbxDolarsalida.addActionListener(new EscuchadorSalida());
		chckbxEurosalida.addActionListener(new EscuchadorSalida());
		chckbxLibrasterlinasalida.addActionListener(new EscuchadorSalida());
		chckbxYenjaponessalida.addActionListener(new EscuchadorSalida());
		chckbxWonseulcoreanosalida.addActionListener(new EscuchadorSalida());
		checkBoxPesoArgentinosalida.addActionListener(new EscuchadorSalida());
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConversorDeMonedas, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSelecioneSuFormato)
								.addComponent(chckbxDolarentrada)
								.addComponent(chckbxEuroentrada)
								.addComponent(chckbxLibraesterlinaentrada)
								.addComponent(chckbxYenjaponesentrada, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxWonseulcoreanoentrada)
								.addComponent(checkBoxPesoArgentinoEntrada))
							.addGap(139)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBoxPesoArgentinosalida)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFormatoDeSalida)
										.addComponent(chckbxDolarsalida)
										.addComponent(chckbxEurosalida)
										.addComponent(chckbxLibrasterlinasalida)
										.addComponent(chckbxYenjaponessalida)
										.addComponent(chckbxWonseulcoreanosalida))
									.addGap(142)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtValorDeEntrada)
										.addComponent(lblValorConvertido)
										.addComponent(btnConvertir, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
										.addComponent(lblIngreseUnValor)
										.addComponent(txtValorDeSalida))))))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblConversorDeMonedas, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSelecioneSuFormato)
						.addComponent(lblFormatoDeSalida)
						.addComponent(lblIngreseUnValor))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxDolarentrada, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(chckbxDolarsalida)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(txtValorDeEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxEuroentrada, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxEurosalida))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxLibraesterlinaentrada, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(chckbxLibrasterlinasalida))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxYenjaponesentrada, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
								.addComponent(chckbxYenjaponessalida))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxWonseulcoreanoentrada)
								.addComponent(chckbxWonseulcoreanosalida))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(checkBoxPesoArgentinoEntrada, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(checkBoxPesoArgentinosalida))
							.addGap(153))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(btnConvertir, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblValorConvertido)
							.addGap(18)
							.addComponent(txtValorDeSalida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
