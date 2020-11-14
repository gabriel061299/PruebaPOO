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
	
	private int valor, valor1, valor2, valor3;
	private String barra, barra1, barra2, barra3;
	private String rango, rango1, rango2, rango3;
	private String titulo;
	
	public Grafica(int valor, String barra, String rango,String titulo){
		
		this.valor = valor;
		this.rango = rango;
		this.barra = barra;
		this.titulo = titulo;
		
	}
public Grafica(int valor1,  String rango1,int valor2, String rango2, int valor3, String barra, String rango3,String titulo){
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.rango1 = rango1;
		this.rango2 = rango2;
		this.rango3 = rango3;
		this.barra = barra;
		
		
		
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
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(valor1, barra, rango1);
		dataset.setValue(valor2, barra, rango2);
		dataset.setValue(valor3, barra, rango3);
		
		JFreeChart graph2 = ChartFactory.createBarChart(titulo,"Población","Numero de Personas", dataset, PlotOrientation.VERTICAL, true, true, false);
		//graph.setBackgroundPaint(Color.white);
        graph2.getTitle().setPaint(Color.black); 
        CategoryPlot p2 = graph2.getCategoryPlot(); 
        
        BarRenderer br2 = (BarRenderer) p2.getRenderer();
        br2.setMaximumBarWidth(.10); 
         
        p2.setRangeGridlinePaint(Color.black); 
        
        ChartPanel chartPanel = new ChartPanel(graph2);
		return chartPanel;
	}
	
	
	
}
