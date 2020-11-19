package com.gcb.cdc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.modelo.ModeloCovid;
import com.gcb.cdc.vista.Vista;

public class Controlador implements ActionListener{

	Vista vistcod;
	ConectaTabla contabla; 
	int datos1 = 0;
	int datos2 = 0;
	int datos3 = 0;
	int edad1 = 0;
	int edad2 = 0;
	int edad3 = 0;
	int edad4 = 0;
	int edad5 = 0;
	int edad6 = 0;
	String genre = "";
	ArrayList<ModeloCovid> idEntidades = new ArrayList<ModeloCovid>();
	ArrayList<ModeloCovid> Genero = new ArrayList<ModeloCovid>();
	
	public Controlador(Vista vistcod, ConectaTabla contabla){
		
		this.vistcod = vistcod;
		this.contabla = contabla;
		this.vistcod.ventestados.addActionListener(this);
		this.vistcod.estados.addActionListener(this);
		this.vistcod.hombre.addActionListener(this);
		this.vistcod.mujer.addActionListener(this);
		this.vistcod.asma.addActionListener(this);
		this.vistcod.edad.addActionListener(this);
		this.vistcod.epoc.addActionListener(this);
		this.vistcod.hipertension.addActionListener(this);
		this.vistcod.obesidad.addActionListener(this);	
	}
	
public void actionPerformed(ActionEvent e) {
		
	
		if(e.getSource() == vistcod.estados){
			
			vistcod.ventestados.removeAllItems();
			vistcod.ventestados.addItem("");
			vistcod.ventestados.addItem("Aguascalientes");
			vistcod.ventestados.addItem("Baja California");
			vistcod.ventestados.addItem("Baja California Sur");
			vistcod.ventestados.addItem("Campeche");
			vistcod.ventestados.addItem("Coahuila de Zaragoza");
			vistcod.ventestados.addItem("Colima");
			vistcod.ventestados.addItem("Chiapas");
			vistcod.ventestados.addItem("Chihuahua");
			vistcod.ventestados.addItem("Ciudad de México");
			vistcod.ventestados.addItem("Durango");
			vistcod.ventestados.addItem("Guanajuato");
			vistcod.ventestados.addItem("Guerrero");
			vistcod.ventestados.addItem("Hidalgo");
			vistcod.ventestados.addItem("Jalisco");
			vistcod.ventestados.addItem("Estado de México");
			vistcod.ventestados.addItem("Michoacán");
			vistcod.ventestados.addItem("Morelos");
			vistcod.ventestados.addItem("Nayarit");
			vistcod.ventestados.addItem("Nuevo León");
			vistcod.ventestados.addItem("Oaxaca");
			vistcod.ventestados.addItem("Puebla");
			vistcod.ventestados.addItem("Queretaro");
			vistcod.ventestados.addItem("Quintana Roo");
			vistcod.ventestados.addItem("San Luis Potosi");
			vistcod.ventestados.addItem("Sinaloa");
			vistcod.ventestados.addItem("Sonora");
			vistcod.ventestados.addItem("Tabasco");
			vistcod.ventestados.addItem("Tamaulipas");
			vistcod.ventestados.addItem("Tlaxcala");
			vistcod.ventestados.addItem("Veracruz");
			vistcod.ventestados.addItem("Yucatán");
			vistcod.ventestados.addItem("Zacatecas");
			
			
			vistcod.ventestados.updateUI();
			vistcod.ventestados.repaint();
			
		}
		else if (e.getSource() == vistcod.ventestados){
			
			int num = vistcod.ventestados.getSelectedIndex();
			if(num>=0){
				if(num == 1){
					
					vistcod.info.setText("Aguascalientes");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(1)){
						if(datoss.getEntidad()== 1){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 2){
				//vistcod.info.selectAll();
				//vistcod.info.replaceSelection("");
				vistcod.info.setText("Baja California");
				idEntidades.clear();
				datos1 = 0;
				for(ModeloCovid datoss : contabla.listacovid(2)){
					if(datoss.getEntidad()== 2){
						idEntidades.add(datoss);
						datos1++;
					}
				}
				System.out.println("Datos ent:"+ datos1);
				vistcod.info.updateUI();
				vistcod.info.repaint();
				}
				if(num == 3){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Baja California Sur");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(3)){
						if(datoss.getEntidad()== 3){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 4){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Campeche");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(4)){
						if(datoss.getEntidad()== 4){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 5){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Coahuila de Zaragoza");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(5)){
						if(datoss.getEntidad()== 5){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 6){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Colima");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(6)){
						if(datoss.getEntidad()== 6){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 7){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Chiapas");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(7)){
						if(datoss.getEntidad()== 7){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 8){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Chihuahua");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(8)){
						if(datoss.getEntidad()== 8){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 9){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Ciudad de México");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(9)){
						if(datoss.getEntidad()== 9){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 10){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Durango");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(10)){
						if(datoss.getEntidad()== 10){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 11){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Guanajuato");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(11)){
						if(datoss.getEntidad()== 11){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 12){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Guerrero");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(12)){
						if(datoss.getEntidad()== 12){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 13){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Hidalgo");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(13)){
						if(datoss.getEntidad()== 13){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 14){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Jalisco");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(14)){
						if(datoss.getEntidad()== 14){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 15){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Estado de México");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(15)){
						if(datoss.getEntidad()== 15){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 16){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Michoacán");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(16)){
						if(datoss.getEntidad()== 16){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 17){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Morelos");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(17)){
						if(datoss.getEntidad()== 17){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 18){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Nayarit");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(18)){
						if(datoss.getEntidad()== 18){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 19){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Nuevo León");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(19)){
						if(datoss.getEntidad()== 19){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 20){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Oaxaca");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(20)){
						if(datoss.getEntidad()== 20){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 21){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Puebla");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(21)){
						if(datoss.getEntidad()== 21){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 22){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Queretaro");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(22)){
						if(datoss.getEntidad()== 22){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 23){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Quintana Roo");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(23)){
						if(datoss.getEntidad()== 23){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 24){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("San Luis Potosi");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(24)){
						if(datoss.getEntidad()== 24){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 25){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Sinaloa");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(25)){
						if(datoss.getEntidad()== 25){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 26){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Sonora");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(26)){
						if(datoss.getEntidad()== 26){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 27){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tabasco");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(27)){
						if(datoss.getEntidad()== 27){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 28){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tamaulipas");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(28)){
						if(datoss.getEntidad()== 28){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 29){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tlaxcala");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(29)){
						if(datoss.getEntidad()== 29){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 30){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Veracruz");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(30)){
						if(datoss.getEntidad()== 30){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 31){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Yucatán");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(31)){
						if(datoss.getEntidad()== 31){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 32){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Zacatecas");
					idEntidades.clear();
					datos1 = 0;
					for(ModeloCovid datoss : contabla.listacovid(32)){
						if(datoss.getEntidad()== 32){
							idEntidades.add(datoss);
							datos1++;
						}
					}
					System.out.println("Datos ent:"+ datos1);
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
			}
		}
		if (e.getSource() == vistcod.hombre){
			genre = "";
			vistcod.info2.setText("Población de Hombres");
			Genero.clear();
			datos2 = 0;
			//System.out.println("Genero limpio");
			for(int i=0;i<idEntidades.size();i++){
				if(idEntidades.get(i).getSexo()== 2){
					Genero.add(idEntidades.get(i));
					datos2++;
				}
			}
			
			genre = "Hombres";
			System.out.println("Hombres: "+datos2);
			vistcod.info2.updateUI();
			vistcod.info2.repaint();
		}
		if (e.getSource() == vistcod.mujer){
			genre = "";
			vistcod.info2.setText("Población de Mujeres");
			Genero.clear();
			datos2 = 0;
			for(int i=0;i<idEntidades.size();i++){
				if(idEntidades.get(i).getSexo()== 1){
					Genero.add(idEntidades.get(i));
					datos2++;
				}
			}
			genre = "Mujeres";
			System.out.println("Mujeres: "+datos2);
			vistcod.info2.updateUI();
			vistcod.info2.repaint();
		}
		if (e.getSource() == vistcod.epoc){
			
			vistcod.pangraph.updateUI();
			vistcod.pangraph.repaint();
			vistcod.pangraph.removeAll();
			
			vistcod.info3.setText("Número de Casos con EPOC");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getEpoc()== 1){
					datos3++;
				}
			}
			Grafica grafica = new Grafica(datos3,genre,"","EPOC");
			vistcod.pangraph.add(grafica.createDemoPanel());
			
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.asma){
			
			vistcod.pangraph.updateUI();
			vistcod.pangraph.repaint();
			vistcod.pangraph.removeAll();
			
			vistcod.info3.setText("Número de Casos con Asma");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getAsma()== 1){
					datos3++;
				}
			}
			Grafica grafica = new Grafica(datos3,genre,"","ASMA");
			vistcod.pangraph.add(grafica.createDemoPanel());
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.hipertension){
			
			vistcod.pangraph.updateUI();
			vistcod.pangraph.repaint();
			vistcod.pangraph.removeAll();
			
			vistcod.info3.setText("Número de Casos con Hipertension");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getHipertension()== 1){
					datos3++;
				}
			}
			Grafica grafica = new Grafica(datos3,genre,"","HIPERTENSION");
			vistcod.pangraph.add(grafica.createDemoPanel());
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.obesidad){
		
			vistcod.pangraph.updateUI();
			vistcod.pangraph.repaint();
			vistcod.pangraph.removeAll();
			
			vistcod.info3.setText("Número de Casos con Obesidad");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getObesidad()== 1){
					datos3++;
				}
			}
			Grafica grafica = new Grafica(datos3,genre,"","OBESIDAD");
			vistcod.pangraph.add(grafica.createDemoPanel());
			
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.edad){
			
			vistcod.pangraph.updateUI();
			vistcod.pangraph.repaint();
			vistcod.pangraph.removeAll();
			vistcod.info3.setText("Rango de Edades");
			edad1 = 0;
			edad2 = 0;
			edad3 = 0;
			edad4 = 0;
			edad5 = 0;
			edad6 = 0;
			
			for(int i=0; i<Genero.size();i++){
				if(Genero.get(i).getEdad()>=20 && Genero.get(i).getEdad()<=30){
					edad1++;
				}
				if(Genero.get(i).getEdad()>30 && Genero.get(i).getEdad()<=40){
					edad2++;
				}
				if(Genero.get(i).getEdad()>40 && Genero.get(i).getEdad()<=50){
					edad3++;
				}
				if(Genero.get(i).getEdad()>50 && Genero.get(i).getEdad()<=60){
					edad4++;
				}
				if(Genero.get(i).getEdad()>60 && Genero.get(i).getEdad()<=70){
					edad5++;
				}
				if(Genero.get(i).getEdad()>70 && Genero.get(i).getEdad()<=100){
					edad6++;
				}
			}
			
			Grafica graph = new Grafica(edad1,edad2,edad3,edad4,edad5,edad6,genre,"RANGO DE EDADES");
			vistcod.pangraph.add(graph.createDemoPanel2());
			
			System.out.println("1: "+ edad1);
			System.out.println("2: "+ edad2);
			System.out.println("3: "+ edad3);
			System.out.println("4: "+ edad4);
			System.out.println("5: "+ edad5);
			System.out.println("6: "+ edad6);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}

			
	}
	

}

