package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.EscritorLineas;
import juegos.wordle.GestorFicheros;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Registro  {
	
	JFrame registro;
	private JPanel contentPane;
	private ImageIcon imagen;
	private ImageIcon icono;
	private JTextField usuario;
	private JPasswordField contraseña;
	GestorFicheros gestor=new GestorFicheros();
	private boolean existe;
	private EscritorLineas escritor;

	

	/**
	 * Create the frame.
	 */
	public Registro() {
		
		initialize();
		
	}
	
	public void initialize() {
		registro= new JFrame();
		registro.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\data\\imagenes\\logoW.png"));
		registro.setTitle("WORDLE");
		registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registro.setBounds(100, 100, 666, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		registro.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnlaContraseaDebe = new JTextPane();
		txtpnlaContraseaDebe.setText("*La contrase\u00F1a debe tener numero, minuscula y mayuscula, el # no es un valor valido");
		txtpnlaContraseaDebe.setFont(new Font("Roboto Black", Font.PLAIN, 9));
		txtpnlaContraseaDebe.setForeground(Color.GRAY);
		txtpnlaContraseaDebe.setBackground(SystemColor.menu);
		txtpnlaContraseaDebe.setBounds(87, 71, 221, 39);
		contentPane.add(txtpnlaContraseaDebe);
		
		JTextPane textPaneError = new JTextPane();
		textPaneError.setBackground(SystemColor.menu);
		
		textPaneError.setEditable(false);
		textPaneError.setForeground(Color.RED);
		textPaneError.setFont(new Font("Roboto Black", Font.PLAIN, 9));
		textPaneError.setBounds(10, 299, 298, 30);
		contentPane.add(textPaneError);
		
		JButton botonRegistro = new JButton("REGISTRAR");
		botonRegistro.setForeground(Color.WHITE);
		botonRegistro.setFont(new Font("Roboto", Font.PLAIN, 20));
		botonRegistro.setBorder(null);
		botonRegistro.setBackground(new Color(36, 170, 200));
		botonRegistro.setBounds(86, 340, 168, 39);
		contentPane.add(botonRegistro);
		
		JLabel jlRegistroSesion = new JLabel("REGISTRO DE SESION");
		jlRegistroSesion.setFont(new Font("Roboto", Font.BOLD, 20));
		jlRegistroSesion.setBounds(86, 40, 298, 40);
		contentPane.add(jlRegistroSesion);
		
		JLabel etiquetaUsuario = new JLabel("USUARIO");
		etiquetaUsuario.setForeground(new Color(51, 51, 51));
		etiquetaUsuario.setFont(new Font("Roboto", Font.BOLD, 14));
		etiquetaUsuario.setBounds(10, 137, 108, 14);
		contentPane.add(etiquetaUsuario);
		
		usuario = new JTextField();
		usuario.setForeground(Color.BLACK);
		usuario.setFont(new Font("Roboto", Font.PLAIN, 14));
		usuario.setColumns(10);
		usuario.setBorder(null);
		usuario.setBackground(Color.WHITE);
		usuario.setBounds(10, 172, 298, 29);
		contentPane.add(usuario);
		
		JLabel etiquetaConstraseña = new JLabel("CONTRASE\u00D1A");
		etiquetaConstraseña.setForeground(new Color(51, 51, 51));
		etiquetaConstraseña.setFont(new Font("Roboto", Font.BOLD, 14));
		etiquetaConstraseña.setBounds(10, 224, 127, 14);
		contentPane.add(etiquetaConstraseña);
		contraseña = new JPasswordField();
		contraseña.setForeground(Color.BLACK);
		contraseña.setFont(new Font("Roboto", Font.PLAIN, 14));
		contraseña.setBorder(null);
		contraseña.setBackground(Color.WHITE);
		contraseña.setBounds(10, 259, 298, 29);
		contentPane.add(contraseña);
		
		JLabel iconoUsuario = new JLabel("");
		iconoUsuario.setIcon(new ImageIcon(".\\data\\imagenes\\logoW.png"));
		iconoUsuario.setBounds(379, 127, 118, 132);
		contentPane.add(iconoUsuario);
		
		JLabel ORDLE_1 = new JLabel("ORDLE[ES]");
		ORDLE_1.setForeground(new Color(51, 51, 51));
		ORDLE_1.setFont(new Font("Roboto Medium", Font.BOLD, 30));
		ORDLE_1.setBounds(476, 194, 186, 39);
		contentPane.add(ORDLE_1);
		
		JLabel fondoAzul = new JLabel("");
		fondoAzul.setIcon(new ImageIcon(".\\data\\imagenes\\bgLogin.jpg"));
		fondoAzul.setBounds(347, -74, 304, 539);
		contentPane.add(fondoAzul);
		
		JLabel fondoBlanco = new JLabel("");
		fondoBlanco.setBackground(Color.WHITE);
		fondoBlanco.setBounds(0, 0, 348, 390);
		contentPane.add(fondoBlanco);
		this.imagen=new ImageIcon(".\\data\\imagenes\\logousu.png");
		
		this.imagen=new ImageIcon(".\\\\data\\\\imagenes\\\\bgLogin.jpg");
		
		
		//----------METODOS---------//
		
	
		botonRegistro.addActionListener(new ActionListener() {
		/**
		 * Accion que registra un usuario en el fichero jugadores al hacer click en el boton
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			/**
			 * Declaramos parametros para acumular los contadores en caso de haber los caracteres exigidos
			 */
			final int MIN_Uppercase=1;
			final int MIN_Lowercase=1;
			final int NUM_Digits=1;
			final int alm=0;
			int uppercaseCounter=0;
			int lowercaseCounter=0;
            int digitCounter=0;
            int almCount=0;
				/*
				 * El for recorre la contraseña aumentando en 1 el contador correspondiente en caso de que contenga el caracter
				 * expecifico
				 */
				for(int i=0;i<contraseña.getText().length();i++) {
					char c= contraseña.getText().charAt(i);
					
					if(Character.isUpperCase(c)) { 
                          uppercaseCounter++;
					}else if(Character.isLowerCase(c)) {
						 lowercaseCounter++;
					}else if(Character.isDigit(c)) {
                         digitCounter++;    
                    }else if(c==35) {
                    	 almCount++;
                    }
					/*
					 * En caso de que la contraseña cumpla las directrices re registra al usuario en el fichero
					 */
				}if (uppercaseCounter >= MIN_Uppercase && lowercaseCounter >= MIN_Lowercase && 
						digitCounter >= NUM_Digits && almCount<=alm ) { 
					gestor.guardarJugador2(usuario.getText(),contraseña.getText());
					Login window = new Login();
					window.login.setVisible(true);
					registro.setVisible(false);
             }else {
            	 //Control de errores de la contraseña
            	 
            	   if (lowercaseCounter < MIN_Lowercase ||uppercaseCounter < MIN_Uppercase ||digitCounter < NUM_Digits) 
            		   textPaneError.setText("La contraseña no es Valida");
            	   		
	              
             }

			
		}
	});
		
		
		contraseña.addKeyListener(new KeyAdapter() {
			
			/**
			 * Accion que registra un usuario en el fichero jugadores al presionar INTRO
			 */
			/*
			 * El metodo funciona igual que el anterior
			 */
			@Override
			public void keyPressed(KeyEvent e) {
				final int MIN_Uppercase=1;
				final int MIN_Lowercase=1;
				final int NUM_Digits=1;
				final int alm=0;
				int uppercaseCounter=0;
				int lowercaseCounter=0;
	            int digitCounter=0;
	            int almCount=0;
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					for(int i=0;i<contraseña.getText().length();i++) {
						char c= contraseña.getText().charAt(i);
						
						if(Character.isUpperCase(c)) { 
	                          uppercaseCounter++;
						}else if(Character.isLowerCase(c)) {
							 lowercaseCounter++;
						}else if(Character.isDigit(c)) {
	                         digitCounter++;    
	                    }else if(c==35) {
	                    	 almCount++;
	                    }
					}if (uppercaseCounter >= MIN_Uppercase && lowercaseCounter >= MIN_Lowercase && 
							digitCounter >= NUM_Digits && almCount<=alm ) { 
						gestor.guardarJugador2(usuario.getText(),contraseña.getText());
						Login window = new Login();
						window.login.setVisible(true);
						registro.setVisible(false);
	             }else {
	            	 if (lowercaseCounter < MIN_Lowercase ||uppercaseCounter < MIN_Uppercase ||digitCounter < NUM_Digits) 
	            		   textPaneError.setText("La contraseña no es Valida");
	             }

			  }
			}
		});
		
	}
}
