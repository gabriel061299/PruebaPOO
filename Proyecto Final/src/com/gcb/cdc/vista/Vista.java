package com.gcb.cdc.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Vista extends JFrame {
	
	public JComboBox ventestados;
	public JRadioButton hombre;
	public JRadioButton mujer;
	public JRadioButton epoc;
	public JRadioButton asma;
	public JRadioButton hipertension;
	public JRadioButton obesidad;
	public JRadioButton edad;
	public JButton estados;
	public JPanel panel1,panel2, panelinfo, panelbotons;
	public JLabel info;
	public JLabel info2;
	
	public Vista(){
		
		super("Proyecto Final");
		setSize(900,600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,100);
		setResizable(true);
		
		setLayout(new GridLayout(1,2));
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		
		ventestados = new JComboBox();
		panel1.add(ventestados,BorderLayout.NORTH);
		
		panelbotons = new JPanel();
		panelbotons.setLayout(new GridLayout(4,2));
		
		hombre = new JRadioButton("Hombre");
		hombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(hombre);
		
		mujer = new JRadioButton("Mujer");
		mujer.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(mujer);
		
		epoc = new JRadioButton("EPOC");
		epoc.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(epoc);
		
		asma = new JRadioButton("Asma");
		asma.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(asma);
		
		hipertension = new JRadioButton("Hipertensión");
		hipertension.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(hipertension);
		
		obesidad = new JRadioButton("Obesidad");
		obesidad.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(obesidad);
		
		edad = new JRadioButton("Edad");
		edad.setHorizontalAlignment(SwingConstants.CENTER);
		panelbotons.add(edad);
		
		panel1.add(panelbotons,BorderLayout.CENTER);
		
		estados = new JButton("Mostrar Grafica");
		panel1.add(estados,BorderLayout.SOUTH);
		
		this.add(panel1);
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		this.add(panel2);
		panel2.setLayout(new GridLayout(2,1));
		panelinfo = new JPanel();
		info = new JLabel("");
		panel2.add(info,BorderLayout.NORTH);
		info2 = new JLabel("");
		panel2.add(info2,BorderLayout.NORTH);
		
		
		
	}

}
