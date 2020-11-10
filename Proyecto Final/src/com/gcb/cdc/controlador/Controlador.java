package com.gcb.cdc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.modelo.ModeloCovid;
import com.gcb.cdc.vista.Vista;

public class Controlador implements ActionListener{

	Vista vistcod = new Vista();
	ConectaTabla contabla = new ConectaTabla();
	int datos1 = 0;
	int datos2 = 0;
	int datos3 = 0;
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
		
		//vistcod.genero.clearSelection();	
	
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
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Aguascalientes");
					for(int i=0;i<200;i++){
						if(contabla.listacovid().get(i).getEntidad()== 1){
							idEntidades.add(contabla.listacovid().get(i));
						}
					}
					
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 2){
				//vistcod.info.selectAll();
				//vistcod.info.replaceSelection("");
				vistcod.info.setText("Baja California");
				vistcod.info.updateUI();
				vistcod.info.repaint();
				}
				if(num == 3){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Baja California Sur");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 4){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Campeche");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 5){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Coahuila de Zaragoza");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 6){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Colima");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 7){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Chiapas");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 8){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Chihuahua");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 9){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Ciudad de México");
					for(int i=0;i<25;i++){
						if(contabla.listacovid().get(i).getEntidad()== 9){
							idEntidades.add(contabla.listacovid().get(i));
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
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 11){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Guanajuato");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 12){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Guerrero");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 13){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Hidalgo");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 14){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Jalisco");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 15){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Estado de México");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 16){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Michoacán");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 17){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Morelos");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 18){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Nayarit");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 19){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Nuevo León");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 20){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Oaxaca");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 21){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Puebla");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 22){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Queretaro");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 23){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Quintana Roo");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 24){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("San Luis Potosi");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 25){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Sinaloa");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 26){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Sonora");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 27){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tabasco");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 28){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tamaulipas");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 29){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Tlaxcala");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 30){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Veracruz");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 31){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Yucatán");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
				if(num == 32){
					//vistcod.info.selectAll();
					//vistcod.info.replaceSelection("");
					vistcod.info.setText("Zacatecas");
					vistcod.info.updateUI();
					vistcod.info.repaint();
				}
			}
		}
		if (e.getSource() == vistcod.hombre){
			
			vistcod.info2.setText("Población de Hombres");
			for(int i=0;i<idEntidades.size();i++){
				if(idEntidades.get(i).getSexo()== 2){
					Genero.add(idEntidades.get(i));
					datos2++;
				}
			}
			System.out.println("Hombres:"+datos2);
			vistcod.info2.updateUI();
			vistcod.info2.repaint();
		}
		if (e.getSource() == vistcod.mujer){
			
			vistcod.info2.setText("Población de Mujeres");
			for(int i=0;i<idEntidades.size();i++){
				if(idEntidades.get(i).getSexo()== 1){
					Genero.add(idEntidades.get(i));
					datos2++;
				}
			}
			System.out.println("Mujeres"+datos2);
			vistcod.info2.updateUI();
			vistcod.info2.repaint();
		}
		if (e.getSource() == vistcod.epoc){
			
			vistcod.info3.setText("Número de Casos con EPOC");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getEpoc()== 1){
					datos3++;
				}
			}
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.asma){
			
			vistcod.info3.setText("Número de Casos con Asma");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getAsma()== 1){
					datos3++;
				}
			}
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.hipertension){
			
			vistcod.info3.setText("Número de Casos con Hipertension");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getHipertension()== 1){
					datos3++;
				}
			}
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.obesidad){
		
			vistcod.info3.setText("Número de Casos con Obesidad");
			datos3=0;
			for(int i=0;i<Genero.size();i++){
				if(Genero.get(i).getObesidad()== 1){
					datos3++;
				}
			}
			System.out.println(datos3);
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}
		if (e.getSource() == vistcod.edad){
			
			vistcod.info3.setText("Rango de Edades");
			vistcod.info3.updateUI();
			vistcod.info3.repaint();
		}

			
	}

}
