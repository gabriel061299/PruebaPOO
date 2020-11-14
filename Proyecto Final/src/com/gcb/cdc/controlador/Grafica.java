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
	
	private int valor;
	private String barra;
	private String rango;
	private String titulo;
	
	public Grafica(int valor, String barra, String rango,String titulo){
		
		this.valor = valor;
		this.rango = rango;
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

	
	
	
}
