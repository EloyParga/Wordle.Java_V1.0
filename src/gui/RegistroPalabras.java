package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juegos.wordle.GestorFicheros;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class RegistroPalabras  {

	private JPanel contentPane;
	JFrame registroPalabra;
	private JTextField textoPalabra;
	private ImageIcon imagen;
	private ImageIcon icono;
	GestorFicheros gestor=new GestorFicheros();
	
	

	/**
	 * Create the frame.
	 */
	public RegistroPalabras() {
		registroPalabra= new JFrame();
		registroPalabra.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\data\\imagenes\\logoW.png"));
		registroPalabra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registroPalabra.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		registroPalabra.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel valid = new JLabel("Palabra Registrada Correctamente");
		valid.setHorizontalAlignment(SwingConstants.CENTER);
		valid.setFont(new Font("Roboto Black", Font.PLAIN, 9));
		valid.setForeground(new Color(102, 204, 51));
		valid.setBounds(126, 216, 196, 34);
		contentPane.add(valid);
		valid.setVisible(false);
		
		JLabel error = new JLabel("Palabra no Valida");
		error.setFont(new Font("Roboto Black", Font.PLAIN, 9));
		error.setHorizontalAlignment(SwingConstants.CENTER);
		error.setForeground(new Color(204, 0, 0));
		error.setBounds(125, 216, 197, 34);
		contentPane.add(error);
		error.setVisible(false);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 15));
		btnNewButton.setBounds(3, 174, 138, 31);
		contentPane.add(btnNewButton);
		
		JLabel flecha = new JLabel("");
		flecha.setBounds(176, 76, 72, 69);
		contentPane.add(flecha);
		this.imagen=new ImageIcon(".\\\\data\\\\imagenes\\\\white-arrow-42.png");
		this.icono=new ImageIcon(this.imagen.getImage().getScaledInstance(flecha.getWidth(),flecha.getHeight(),Image.SCALE_DEFAULT));
		flecha.setIcon(this.icono);
		
		textoPalabra = new JTextField();
		textoPalabra.setFont(new Font("Roboto", Font.PLAIN, 20));
		textoPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		textoPalabra.setBounds(158, 172, 262, 35);
		contentPane.add(textoPalabra);
		textoPalabra.setColumns(10);
		
		JLabel enunciado = new JLabel("REGISTRA UNA NUEVA PALABRA");
		enunciado.setFont(new Font("Roboto", Font.BOLD, 25));
		enunciado.setBounds(30, 11, 394, 54);
		contentPane.add(enunciado);
		
		JLabel bgazul = new JLabel("");
		bgazul.setIcon(new ImageIcon(".\\data\\imagenes\\bgLogin.jpg"));
		bgazul.setBounds(0, 0, 434, 261);
		contentPane.add(bgazul);
		
		//-----------METODOS-------------
		
		/**
		 * Esta funcion registra la palabra en el fichero siempre y cuando sea de longitud 5
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textoPalabra.getText().length()==5) {
					error.setVisible(false);
					valid.setVisible(true);
					gestor.guardarPalabra(textoPalabra.getText());
				}else {
					valid.setVisible(false);
					error.setVisible(true);
				}
				
			}
		});
		
	}
}
