package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import io.EscritorLineas;
import juegos.wordle.GestorFicheros;
import juegos.wordle.Jugador;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Login {
	
	/**
	 * Declaracion de Variables
	 */
	JFrame login;
	private JTextField usuario;
	private JPasswordField contraseña;
	GestorFicheros gestor=new GestorFicheros();
	private boolean existe;
	private EscritorLineas escritor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		existe=false;
		escritor=new EscritorLineas("/wordle/jugadores.dat");
		login = new JFrame();
		login.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\data\\imagenes\\logoW.png"));
		login.setTitle("WORDLE");
		login.setBounds(100, 100, 667, 429);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		JLabel lblError = new JLabel("Usuario o Contrase\u00F1a no coinciden");
		lblError.setFont(new Font("Roboto Black", Font.PLAIN, 10));
		lblError.setForeground(Color.RED);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setBounds(27, 299, 264, 30);
		login.getContentPane().add(lblError);
		lblError.setVisible(false);
		
		JButton botonRegistPalab = new JButton("REGISTRA PALABRA");
		
		botonRegistPalab.setForeground(new Color(36, 170, 200));
		botonRegistPalab.setFont(new Font("Roboto", Font.PLAIN, 20));
		botonRegistPalab.setBorder(null);
		botonRegistPalab.setBackground(Color.WHITE);
		botonRegistPalab.setBounds(400, 340, 204, 39);
		login.getContentPane().add(botonRegistPalab);
		
		JButton botonRegistro = new JButton("REGISTRARSE");
		
		
		botonRegistro.setForeground(Color.WHITE);
		botonRegistro.setFont(new Font("Roboto", Font.PLAIN, 20));
		botonRegistro.setBorder(null);
		botonRegistro.setBackground(new Color(36, 170, 200));
		botonRegistro.setBounds(10, 340, 142, 39);
		login.getContentPane().add(botonRegistro);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(102, 102, 102));
		separator_1.setBackground(new Color(153, 153, 153));
		separator_1.setBounds(10, 288, 298, 14);
		login.getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 102, 102));
		separator.setBackground(new Color(153, 153, 153));
		separator.setBounds(10, 201, 298, 14);
		login.getContentPane().add(separator);
		
		JLabel ORDLE_1 = new JLabel("ORDLE[ES]");
		ORDLE_1.setForeground(new Color(51, 51, 51));
		ORDLE_1.setFont(new Font("Roboto Medium", Font.BOLD, 30));
		ORDLE_1.setBounds(465, 150, 186, 39);
		login.getContentPane().add(ORDLE_1);
		
		JLabel BG = new JLabel("INICIO SESION");
		BG.setFont(new Font("Roboto", Font.BOLD, 20));
		BG.setBounds(86, 40, 298, 40);
		
		login.getContentPane().add(BG);
		
		JLabel etiquetaUsuario = new JLabel("USUARIO");
		etiquetaUsuario.setFont(new Font("Roboto", Font.BOLD, 14));
		etiquetaUsuario.setForeground(new Color(51, 51, 51));
		etiquetaUsuario.setBounds(10, 137, 108, 14);
		login.getContentPane().add(etiquetaUsuario);
		
		usuario = new JTextField();
		usuario.setFont(new Font("Roboto", Font.PLAIN, 14));
		usuario.setBackground(Color.WHITE);
		usuario.setForeground(new Color(0, 0, 0));
		usuario.setBorder(null);
		usuario.setBounds(10, 172, 298, 29);
		login.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JLabel etiquetaConstraseña = new JLabel("CONTRASE\u00D1A");
		etiquetaConstraseña.setFont(new Font("Roboto", Font.BOLD, 14));
		etiquetaConstraseña.setForeground(new Color(51, 51, 51));
		etiquetaConstraseña.setBounds(10, 224, 127, 14);
		login.getContentPane().add(etiquetaConstraseña);
		
		JButton botonInicio = new JButton("INICIAR");
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setFont(new Font("Roboto", Font.PLAIN, 20));
		botonInicio.setIcon(null);
		botonInicio.setBorder(null);
		botonInicio.setBackground(new Color(36, 170, 200));
		botonInicio.setBounds(166, 340, 142, 39);
		
		
		login.getContentPane().add(botonInicio);
		
		contraseña = new JPasswordField();
		contraseña.setFont(new Font("Roboto", Font.PLAIN, 14));
		contraseña.setBackground(Color.WHITE);
		contraseña.setForeground(new Color(0, 0, 0));
		contraseña.setBounds(10, 259, 298, 29);
		contraseña.setBorder(null);
		
		
		login.getContentPane().add(contraseña);
		
		JLabel iconoUsuario = new JLabel("");
		iconoUsuario.setIcon(new ImageIcon(".\\data\\imagenes\\logoW.png"));
		iconoUsuario.setBounds(368, 83, 118, 132);
		login.getContentPane().add(iconoUsuario);
		
		JLabel fondoAzul = new JLabel("");
		fondoAzul.setIcon(new ImageIcon(".\\data\\imagenes\\bgLogin.jpg"));
		fondoAzul.setBounds(347, -74, 304, 539);
		login.getContentPane().add(fondoAzul);
		
		JLabel fondoBlanco = new JLabel("");
		fondoBlanco.setBackground(Color.WHITE);
		fondoBlanco.setBounds(0, 0, 348, 390);
		login.getContentPane().add(fondoBlanco);
		
		
		//-------------FUNCIONES------------------
		
		
		/**
		 * Funcion para abrir la ventana de registrar palabra
		 */
		botonRegistPalab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistroPalabras frameRP = new RegistroPalabras();
				frameRP.registroPalabra.setVisible(true);
				login.setVisible(false);
			}
		});
		

		/**
		 * Funcionaminto del Boton INICIAR
		 * Si los datos existen lanza la ventana de juego ,
		 * Si los datos no coinciden sale un mensaje de error
		 */
		botonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ArrayList<Jugador> registroJugadores= gestor.leerJugadores();
					for(int i=0; i<registroJugadores.size();i++) {
						Jugador jugador=registroJugadores.get(i);
						String[] datosJugador= gestor.separarCadena(jugador.toString(),'#');
						if(datosJugador[0].equals(usuario.getText())) {
							existe=true;
						}
							
					}
					if(existe) {
						VentanaPrincipal juego=new VentanaPrincipal(usuario.getText());
						login.setVisible(false);
		
					}else {
						lblError.setVisible(true);

					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		/**
		 * Funcionaminto del inicio al presionar INTRO
		 * Si los datos existen lanza la ventana de juego ,
		 * Si los datos no coinciden sale un mensaje de error
		 */
		
		contraseña.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					try {
						ArrayList<Jugador> registroJugadores= gestor.leerJugadores();
						for(int i=0; i<registroJugadores.size();i++) {
							Jugador jugador=registroJugadores.get(i);
							String[] datosJugador= gestor.separarCadena(jugador.toString(),'#');
							if(datosJugador[0].equals(usuario.getText())) {
								existe=true;
							}
								
							}
					} catch (Exception e1) {
						
						e1.printStackTrace();
					} 
					
				
					
					if(existe) {
						VentanaPrincipal juego=new VentanaPrincipal(usuario.getText());
						login.setVisible(false);
						
						
					}else {
						lblError.setVisible(true);
					}
					
					
				}
			}
		});
		
		/**
		 * Funcionamiento del boton Registrar
		 */
		
		botonRegistro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Registro registro=new Registro();
				registro.registro.setVisible(true);
				login.setVisible(false);
			
			}
		});
	}
}
