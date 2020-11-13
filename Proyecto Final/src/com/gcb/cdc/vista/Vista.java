package com.gcb.cdc.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
	public JPanel panel1,panel2, panelbotons,pandatos, pangraph;
	public JLabel info,info2,info3,nulo;
	public ButtonGroup genero, padecimiento;
	
	
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
		
		genero = new ButtonGroup();
		genero.add(hombre);
		genero.add(mujer);
		
		padecimiento = new ButtonGroup();
		padecimiento.add(epoc);
		padecimiento.add(asma);
		padecimiento.add(hipertension);
		padecimiento.add(obesidad);
		padecimiento.add(edad);
		
		panel1.add(panelbotons,BorderLayout.CENTER);
		
		estados = new JButton("Mostrar Estados");
		panel1.add(estados,BorderLayout.SOUTH);
		
		this.add(panel1);
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		pandatos = new JPanel();
		pandatos.setLayout(new GridLayout(4,1));
		
		nulo = new JLabel("");
		pandatos.add(nulo);
		
		info = new JLabel("");
		info.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info);
		
		info2 = new JLabel("");
		info2.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info2);
		
		info3 = new JLabel("");
		info3.setHorizontalAlignment(SwingConstants.CENTER);
		pandatos.add(info3);
		
		pangraph = new JPanel();
		pangraph.setLayout(new BorderLayout());
		panel2.add(pangraph,BorderLayout.CENTER);
		panel2.add(pandatos,BorderLayout.NORTH);
		
		this.add(panel2);
		
		
	}

}
