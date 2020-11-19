package com.gcb.cdc.controlador;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica {
	
	private int valor,val1,val2,val3,val4,val5,val6;
	private String barra;
	private String rango;
	private String titulo;
	
	
	public Grafica(int valor, String barra, String rango,String titulo){
		
		this.valor = valor;
		this.rango = rango;
		this.barra = barra;
		this.titulo = titulo;
		
	}
	public Grafica(int val1,int val2, int val3,int val4,int val5,int val6, String barra,String titulo){
		
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
		this.val5 = val5;
		this.val6 = val6;
		this.barra = barra;
		this.titulo = titulo;
		
	}
		
	public JPanel createDemoPanel(){
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(valor, barra, rango);
		
		JFreeChart graph = ChartFactory.createBarChart(titulo,"Población","Numero de Personas", dataset, PlotOrientation.VERTICAL, true, true, false);
		//graph.setBackgroundPaint(Color.white);
        graph.getTitle().setPaint(Color.black); 
        CategoryPlot p = graph.getCategoryPlot(); 
        
        BarRenderer br = (BarRenderer) p.getRenderer();
        br.setMaximumBarWidth(.10); 
         
        p.setRangeGridlinePaint(Color.black); 
        
        ChartPanel chartPanel = new ChartPanel(graph);
		return chartPanel;
	}
	
	public JPanel createDemoPanel2(){
		
		DefaultCategoryDataset datoset = new DefaultCategoryDataset();
		datoset.setValue(val1, barra, "20-30");
		datoset.setValue(val2, barra, "30-40");
		datoset.setValue(val3, barra, "40-50");
		datoset.setValue(val4, barra, "50-60");
		datoset.setValue(val5, barra, "60-70");
		datoset.setValue(val6, barra, "70-100");
		
		JFreeChart graf = ChartFactory.createBarChart(titulo,"Población","Numero de Personas", datoset, PlotOrientation.VERTICAL, true, true, false);
		graf.getTitle().setPaint(Color.black); 
		
		CategoryPlot plot = graf.getCategoryPlot(); 
		plot.setRangeGridlinePaint(Color.black);
		
		BarRenderer b = (BarRenderer) plot.getRenderer();
	    b.setMaximumBarWidth(.10); 
	    
	    ChartPanel graphPanel = new ChartPanel(graf);
		return graphPanel;
		
	}
	
	
	
}