package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juegos.wordle.GestorFicheros;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;

public class Ranking  {
	JFrame ranking;
	private JPanel contentPane;
	private JLabel []ArrayRank1= new JLabel[2];
	private JLabel []ArrayRank2= new JLabel[2];
	private JLabel []ArrayRank3= new JLabel[2];
	private JLabel []ArrayRank4= new JLabel[2];
	private JLabel []ArrayRank5= new JLabel[2];
	private GestorFicheros gestor=new GestorFicheros();
	private Ranking2 r2= new Ranking2();

	/**
	 * Create the frame.
	 */
	public Ranking() {
		
		ranking= new JFrame();
		
		ranking.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\data\\imagenes\\logoW.png"));
		ranking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ranking.setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ranking.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.MAGENTA);
		separator_1.setForeground(Color.MAGENTA);
		separator_1.setBounds(428, 56, 97, 2);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setToolTipText("--------");
		separator.setBackground(Color.MAGENTA);
		separator.setForeground(Color.MAGENTA);
		separator.setBounds(58, 56, 97, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Score");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arcade Interlaced", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(441, 32, 97, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arcade Interlaced", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(75, 32, 97, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel ganadasRanking4 = new JLabel("");
		ganadasRanking4.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		ganadasRanking4.setForeground(Color.WHITE);
		ganadasRanking4.setBounds(454, 253, 65, 37);
		contentPane.add(ganadasRanking4);
		
		JLabel ganadasRanking3 = new JLabel("");
		ganadasRanking3.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		ganadasRanking3.setForeground(Color.WHITE);
		ganadasRanking3.setBounds(454, 195, 65, 37);
		contentPane.add(ganadasRanking3);
		
		JLabel ganadasRanking5 = new JLabel("");
		ganadasRanking5.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		ganadasRanking5.setForeground(Color.WHITE);
		ganadasRanking5.setBounds(454, 313, 65, 37);
		contentPane.add(ganadasRanking5);
		
		JLabel ganadasRanking2 = new JLabel("");
		ganadasRanking2.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		ganadasRanking2.setForeground(Color.WHITE);
		ganadasRanking2.setBounds(454, 137, 65, 37);
		contentPane.add(ganadasRanking2);
		
		JLabel ganadasRanking1 = new JLabel("");
		ganadasRanking1.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		ganadasRanking1.setForeground(Color.WHITE);
		ganadasRanking1.setBounds(454, 79, 65, 37);
		contentPane.add(ganadasRanking1);
		
		JLabel nombreRanking3 = new JLabel("");
		nombreRanking3.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		nombreRanking3.setForeground(Color.WHITE);
		nombreRanking3.setBounds(38, 195, 158, 37);
		contentPane.add(nombreRanking3);
		
		JLabel nombreRanking5 = new JLabel("");
		nombreRanking5.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		nombreRanking5.setForeground(Color.WHITE);
		nombreRanking5.setBounds(38, 313, 158, 37);
		contentPane.add(nombreRanking5);
		
		JLabel nombreRanking2 = new JLabel("");
		nombreRanking2.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		nombreRanking2.setForeground(Color.WHITE);
		nombreRanking2.setBounds(38, 137, 158, 37);
		contentPane.add(nombreRanking2);
		
		JLabel nombreRanking4 = new JLabel("");
		nombreRanking4.setFont(new Font("Arcade Normal", Font.PLAIN, 20));
		nombreRanking4.setForeground(Color.WHITE);
		nombreRanking4.setBounds(38, 253, 158, 37);
		contentPane.add(nombreRanking4);
		
		JLabel nombreRanking1 = new JLabel("");
		nombreRanking1.setFont(new Font("Arcade Normal", Font.BOLD, 20));
		nombreRanking1.setForeground(Color.WHITE);
		nombreRanking1.setBounds(38, 79, 158, 37);
		contentPane.add(nombreRanking1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\data\\imagenes\\arcade.jpg"));
		lblNewLabel.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel);
		
		ArrayRank1[0]=nombreRanking1;
		ArrayRank1[1]=ganadasRanking1;
		
		ArrayRank2[0]=nombreRanking2;
		ArrayRank2[1]=ganadasRanking2;
		
		ArrayRank3[0]=nombreRanking3;
		ArrayRank3[1]=ganadasRanking3;
		
		ArrayRank4[0]=nombreRanking4;
		ArrayRank4[1]=ganadasRanking4;
		
		ArrayRank5[0]=nombreRanking5;
		ArrayRank5[1]=ganadasRanking5;
	}
	
	/**
	 * Funcion que muestra el contenido del ranking
	 */
	
	public void mostrarRanking() {
		
		for(int i=0;i<5;i++) {
			String[] trozosRanking=gestor.getRankingPos(i);
			if(i==0) {
				ArrayRank1[0].setText(trozosRanking[0]);
				ArrayRank1[1].setText(trozosRanking[1]);
			}else if(i==1) {
				ArrayRank2[0].setText(trozosRanking[0]);
				ArrayRank2[1].setText(trozosRanking[1]);
			}else if(i==2) {
				ArrayRank3[0].setText(trozosRanking[0]);
				ArrayRank3[1].setText(trozosRanking[1]);
			}else if(i==3) {
				ArrayRank4[0].setText(trozosRanking[0]);
				ArrayRank4[1].setText(trozosRanking[1]);
			}else if(i==4) {
				ArrayRank5[0].setText(trozosRanking[0]);
				ArrayRank5[1].setText(trozosRanking[1]);
			}
		}
	}
	
	
}
