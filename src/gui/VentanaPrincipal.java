package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import juegos.wordle.GestorFicheros;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;



public class VentanaPrincipal {
	
	/**
	 * Declaracion de Variables de VentanaPrincipal
	 */

	private JFrame ventanaPrincipal;
	private JTextField panelTexto;
	private JTextField letra11;
	private JTextField letra12;
	private JTextField letra13;
	private JTextField letra14;
	private JTextField letra15;
	private JTextField letra21;
	private JTextField letra22;
	private JTextField letra23;
	private JTextField letra24;
	private JTextField letra25;
	private JTextField letra31;
	private JTextField letra32;
	private JTextField letra33;
	private JTextField letra34;
	private JTextField letra35;
	private JTextField letra41;
	private JTextField letra42;
	private JTextField letra43;
	private JTextField letra44;
	private JTextField letra45;
	private JTextField letra51;
	private JTextField letra52;
	private JTextField letra53;
	private JTextField letra54;
	private JTextField letra55;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private ImageIcon imagen;
	private ImageIcon icono;
	
	
	private int contador=0;
	private JTextField []ArrayFila1= new JTextField[5];
	private JTextField []ArrayFila2= new JTextField[5];
	private JTextField []ArrayFila3= new JTextField[5];
	private JTextField []ArrayFila4= new JTextField[5];
	private JTextField []ArrayFila5= new JTextField[5];
	
	private GestorFicheros gestorPalabra = new GestorFicheros();
	String palabra=gestorPalabra.getPalabra();
	private String nomJugador;
	



	/**
	 * Create the application.
	 */
	public VentanaPrincipal(String nomJugador) {
		initialize();
		this.nomJugador=nomJugador;
		this.ventanaPrincipal.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventanaPrincipal = new JFrame();
		ventanaPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\data\\imagenes\\logoW.png"));
		ventanaPrincipal.setTitle("WORDLE");
		ventanaPrincipal.getContentPane().setBackground(new Color(255, 255, 255));
		ventanaPrincipal.getContentPane().setEnabled(false);
		ventanaPrincipal.getContentPane().setForeground(Color.LIGHT_GRAY);
		ventanaPrincipal.setBounds(100, 100, 588, 379);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.getContentPane().setLayout(null);
		
		JLabel lblNewLabelError = new JLabel("Palabra NO valida");
		lblNewLabelError.setFont(new Font("Roboto Black", Font.PLAIN, 9));
		lblNewLabelError.setForeground(new Color(204, 0, 0));
		lblNewLabelError.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelError.setBounds(173, 266, 200, 26);
		ventanaPrincipal.getContentPane().add(lblNewLabelError);
		lblNewLabelError.setVisible(false);
		
		this.imagen=new ImageIcon(".\\data\\imagenes\\trofeoAzul.jfif");

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(".\\data\\imagenes\\logoW.png"));
		lblNewLabel_1.setBounds(233, 0, 140, 113);
		ventanaPrincipal.getContentPane().add(lblNewLabel_1);
		
		panelTexto = new JTextField();

		panelTexto.setFont(new Font("Roboto", Font.BOLD, 14));
		panelTexto.setBounds(38, 300, 494, 29);
		ventanaPrincipal.getContentPane().add(panelTexto);
		panelTexto.setColumns(10);
		
		letra11 = new JTextField();
		letra11.setHorizontalAlignment(SwingConstants.CENTER);
		letra11.setBackground(Color.WHITE);
		letra11.setEditable(false);
		letra11.setBounds(103, 111, 60, 20);
		ventanaPrincipal.getContentPane().add(letra11);
		letra11.setColumns(10);
		
		letra12 = new JTextField();
		letra12.setHorizontalAlignment(SwingConstants.CENTER);
		letra12.setBackground(Color.WHITE);
		letra12.setEditable(false);
		letra12.setColumns(10);
		letra12.setBounds(173, 111, 60, 20);
		ventanaPrincipal.getContentPane().add(letra12);
		
		letra13 = new JTextField();
		letra13.setHorizontalAlignment(SwingConstants.CENTER);
		letra13.setBackground(Color.WHITE);
		letra13.setEditable(false);
		letra13.setColumns(10);
		letra13.setBounds(243, 111, 60, 20);
		ventanaPrincipal.getContentPane().add(letra13);
		
		letra14 = new JTextField();
		letra14.setHorizontalAlignment(SwingConstants.CENTER);
		letra14.setBackground(Color.WHITE);
		letra14.setEditable(false);
		letra14.setColumns(10);
		letra14.setBounds(313, 111, 60, 20);
		ventanaPrincipal.getContentPane().add(letra14);
		
		letra15 = new JTextField();
		letra15.setHorizontalAlignment(SwingConstants.CENTER);
		letra15.setBackground(Color.WHITE);
		letra15.setEditable(false);
		letra15.setColumns(10);
		letra15.setBounds(383, 111, 60, 20);
		ventanaPrincipal.getContentPane().add(letra15);
		
		letra21 = new JTextField();
		letra21.setHorizontalAlignment(SwingConstants.CENTER);
		letra21.setEditable(false);
		letra21.setColumns(10);
		letra21.setBackground(Color.WHITE);
		letra21.setBounds(103, 142, 60, 20);
		ventanaPrincipal.getContentPane().add(letra21);
		
		letra22 = new JTextField();
		letra22.setHorizontalAlignment(SwingConstants.CENTER);
		letra22.setEditable(false);
		letra22.setColumns(10);
		letra22.setBackground(Color.WHITE);
		letra22.setBounds(173, 142, 60, 20);
		ventanaPrincipal.getContentPane().add(letra22);
		
		letra23 = new JTextField();
		letra23.setHorizontalAlignment(SwingConstants.CENTER);
		letra23.setEditable(false);
		letra23.setColumns(10);
		letra23.setBackground(Color.WHITE);
		letra23.setBounds(243, 142, 60, 20);
		ventanaPrincipal.getContentPane().add(letra23);
		
		letra24 = new JTextField();
		letra24.setHorizontalAlignment(SwingConstants.CENTER);
		letra24.setEditable(false);
		letra24.setColumns(10);
		letra24.setBackground(Color.WHITE);
		letra24.setBounds(313, 142, 60, 20);
		ventanaPrincipal.getContentPane().add(letra24);
		
		letra25 = new JTextField();
		letra25.setHorizontalAlignment(SwingConstants.CENTER);
		letra25.setEditable(false);
		letra25.setColumns(10);
		letra25.setBackground(Color.WHITE);
		letra25.setBounds(383, 142, 60, 20);
		ventanaPrincipal.getContentPane().add(letra25);
		
		letra31 = new JTextField();
		letra31.setHorizontalAlignment(SwingConstants.CENTER);
		letra31.setEditable(false);
		letra31.setColumns(10);
		letra31.setBackground(Color.WHITE);
		letra31.setBounds(103, 173, 60, 20);
		ventanaPrincipal.getContentPane().add(letra31);
		
		letra32 = new JTextField();
		letra32.setHorizontalAlignment(SwingConstants.CENTER);
		letra32.setEditable(false);
		letra32.setColumns(10);
		letra32.setBackground(Color.WHITE);
		letra32.setBounds(173, 173, 60, 20);
		ventanaPrincipal.getContentPane().add(letra32);
		
		letra33 = new JTextField();
		letra33.setHorizontalAlignment(SwingConstants.CENTER);
		letra33.setEditable(false);
		letra33.setColumns(10);
		letra33.setBackground(Color.WHITE);
		letra33.setBounds(243, 173, 60, 20);
		ventanaPrincipal.getContentPane().add(letra33);
		
		letra34 = new JTextField();
		letra34.setHorizontalAlignment(SwingConstants.CENTER);
		letra34.setEditable(false);
		letra34.setColumns(10);
		letra34.setBackground(Color.WHITE);
		letra34.setBounds(313, 173, 60, 20);
		ventanaPrincipal.getContentPane().add(letra34);
		
		letra35 = new JTextField();
		letra35.setHorizontalAlignment(SwingConstants.CENTER);
		letra35.setEditable(false);
		letra35.setColumns(10);
		letra35.setBackground(Color.WHITE);
		letra35.setBounds(383, 173, 60, 20);
		ventanaPrincipal.getContentPane().add(letra35);
		
		letra41 = new JTextField();
		letra41.setHorizontalAlignment(SwingConstants.CENTER);
		letra41.setEditable(false);
		letra41.setColumns(10);
		letra41.setBackground(Color.WHITE);
		letra41.setBounds(103, 204, 60, 20);
		ventanaPrincipal.getContentPane().add(letra41);
		
		letra42 = new JTextField();
		letra42.setHorizontalAlignment(SwingConstants.CENTER);
		letra42.setEditable(false);
		letra42.setColumns(10);
		letra42.setBackground(Color.WHITE);
		letra42.setBounds(173, 204, 60, 20);
		ventanaPrincipal.getContentPane().add(letra42);
		
		letra43 = new JTextField();
		letra43.setHorizontalAlignment(SwingConstants.CENTER);
		letra43.setEditable(false);
		letra43.setColumns(10);
		letra43.setBackground(Color.WHITE);
		letra43.setBounds(243, 204, 60, 20);
		ventanaPrincipal.getContentPane().add(letra43);
		
		letra44 = new JTextField();
		letra44.setHorizontalAlignment(SwingConstants.CENTER);
		letra44.setEditable(false);
		letra44.setColumns(10);
		letra44.setBackground(Color.WHITE);
		letra44.setBounds(313, 204, 60, 20);
		ventanaPrincipal.getContentPane().add(letra44);
		
		letra45 = new JTextField();
		letra45.setHorizontalAlignment(SwingConstants.CENTER);
		letra45.setEditable(false);
		letra45.setColumns(10);
		letra45.setBackground(Color.WHITE);
		letra45.setBounds(383, 204, 60, 20);
		ventanaPrincipal.getContentPane().add(letra45);
		
		letra51 = new JTextField();
		letra51.setHorizontalAlignment(SwingConstants.CENTER);
		letra51.setEditable(false);
		letra51.setColumns(10);
		letra51.setBackground(Color.WHITE);
		letra51.setBounds(103, 235, 60, 20);
		ventanaPrincipal.getContentPane().add(letra51);
		
		letra52 = new JTextField();
		letra52.setHorizontalAlignment(SwingConstants.CENTER);
		letra52.setEditable(false);
		letra52.setColumns(10);
		letra52.setBackground(Color.WHITE);
		letra52.setBounds(173, 235, 60, 20);
		ventanaPrincipal.getContentPane().add(letra52);
		
		letra53 = new JTextField();
		letra53.setHorizontalAlignment(SwingConstants.CENTER);
		letra53.setEditable(false);
		letra53.setColumns(10);
		letra53.setBackground(Color.WHITE);
		letra53.setBounds(243, 235, 60, 20);
		ventanaPrincipal.getContentPane().add(letra53);
		
		letra54 = new JTextField();
		letra54.setHorizontalAlignment(SwingConstants.CENTER);
		letra54.setEditable(false);
		letra54.setColumns(10);
		letra54.setBackground(Color.WHITE);
		letra54.setBounds(313, 235, 60, 20);
		ventanaPrincipal.getContentPane().add(letra54);
		
		letra55 = new JTextField();
		letra55.setHorizontalAlignment(SwingConstants.CENTER);
		letra55.setEditable(false);
		letra55.setColumns(10);
		letra55.setBackground(Color.WHITE);
		letra55.setBounds(383, 235, 60, 20);
		ventanaPrincipal.getContentPane().add(letra55);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(".\\data\\imagenes\\bgLogin.jpg"));
		lblNewLabel.setBounds(0, 0, 572, 346);
		ventanaPrincipal.getContentPane().add(lblNewLabel);
		
		/*
		 * Rellenamos los Arrays de forma manual correspondiente a los JLabels de 
		 * cada fila
		 */
		
		ArrayFila1[0]=letra11;
		ArrayFila1[1]=letra12;
		ArrayFila1[2]=letra13;
		ArrayFila1[3]=letra14;
		ArrayFila1[4]=letra15;

		ArrayFila2[0]=letra21;
		ArrayFila2[1]=letra22;
		ArrayFila2[2]=letra23;
		ArrayFila2[3]=letra24;
		ArrayFila2[4]=letra25;
		
		
		ArrayFila3[0]=letra31;
		ArrayFila3[1]=letra32;
		ArrayFila3[2]=letra33;
		ArrayFila3[3]=letra34;
		ArrayFila3[4]=letra35;
		
		
		ArrayFila4[0]=letra41;
		ArrayFila4[1]=letra42;
		ArrayFila4[2]=letra43;
		ArrayFila4[3]=letra44;
		ArrayFila4[4]=letra45;
		

		ArrayFila5[0]=letra51;
		ArrayFila5[1]=letra52;
		ArrayFila5[2]=letra53;
		ArrayFila5[3]=letra54;
		ArrayFila5[4]=letra55;
		
		/**
		 * Esta funcion rellena cada Array correspondiente a cada fila al presionar intro 
		 * haciendo que cada vez que se presione intro @param  contador aumente en 1
		 */
		
		panelTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				Pattern pat=Pattern.compile("[a-z]{5}");
				String pattern=panelTexto.getText();
				Matcher mat= pat.matcher(panelTexto.getText());
				
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					//En caso de meter una palabra correcta rellena la fila correspondiente
					
					if(mat.matches()) {
						if(contador==0) {
							lblNewLabelError.setVisible(false);
							comprobar(ArrayFila1);
							ganar();
							panelTexto.setText(null);
						}else if(contador==1) {
							lblNewLabelError.setVisible(false);
							comprobar(ArrayFila2);
							ganar();
							panelTexto.setText(null);
						}else if(contador==2) {
							lblNewLabelError.setVisible(false);
							comprobar(ArrayFila3);
							ganar();
							panelTexto.setText(null);
						}else if(contador==3) {
							lblNewLabelError.setVisible(false);
							comprobar(ArrayFila4);
							ganar();
							panelTexto.setText(null);
						}else if(contador==4) {
							lblNewLabelError.setVisible(false);
							comprobar(ArrayFila5);
							ganar();
							panelTexto.setText(null);
						}else {
							
						} contador++;
					}else {
					//En caso de meter una palabra incorrecta salta un mensaje de error.
						lblNewLabelError.setVisible(true);
					}
					
				}
					
			}
		});
		
		
	}
	

	/**
	 * La funcion comprobar() revisa letra a letra que el array introducido es igual al del fichero
	 * -poniendo en amarillo si la letra esta pero en posicion erronea
	 * -poniendo en Verde si esta en posicion correcta
	 * -dejandola de su color original si la letra no esta presente
	 * @param array
	 */
	
	public void comprobar(JTextField [] array) {
		String palabra=this.palabra;
		String texto=panelTexto.getText();
		
		
		for(int i=0;i<5;i++) {
		
			if(texto.charAt(i)==palabra.charAt(i)) {
				array[i].setBackground(Color.GREEN);
			
			}else {
				for(int j=0;j<5;j++) {
					
					 if(texto.charAt(i)==palabra.charAt(j)) {
						array[i].setBackground(Color.yellow);
						
					}else {
						array[i].setBackground(Color.GRAY);
					}
				}
			}
		
			array[i].setText((texto.charAt(i)+"").toUpperCase());
		}
	}
	

	
	/**
	 * la funcion ganar() ejecuta las acciones que suceden cuando la palabra escrita coincide con la del fichero.
	 */
	
	public void ganar() {
		
		
		String palabra=gestorPalabra.getPalabra();
		
		String texto=panelTexto.getText();
		
		if(palabra.compareTo(texto)==0) {
			
				Ranking r= new Ranking();
				Ranking2 r2=new Ranking2();
				
				r2.ganaPartida(nomJugador);
				r.mostrarRanking();
				r.ranking.setVisible(true);
				ventanaPrincipal.setVisible(false);
				
			
		}
	
	}
}
