package com.gcb.cdc.EjecutaProyectoF;
import com.gcb.cdc.modelo.ConectaTabla;
import com.gcb.cdc.vista.*;
import com.gcb.cdc.controlador.Controlador;

public class EjecutaProyecto {
	
	public static void main(String[] args){
		
		Vista v = new Vista();
		ConectaTabla con = new ConectaTabla();
		Controlador cf = new Controlador(v, con);
		v.setVisible(true);
	}

}
