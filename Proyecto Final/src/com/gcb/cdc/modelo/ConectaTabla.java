package com.gcb.cdc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;





public class ConectaTabla {
	
	ConectarBase conectarBase;
	
	public ConectaTabla() {
		
		conectarBase = new ConectarBase();
	}
	public ArrayList <ModeloCovid> listacovid (int estado){
		ArrayList<ModeloCovid> listacovid = new ArrayList<ModeloCovid>();
		ModeloCovid covid;
		
		try{
			// recupera la conexion
			Connection conn = conectarBase.getConnection();
			// depende del nombre de su tabla. 
			PreparedStatement prest = conn.prepareStatement("select * from covid where Entidad = "+ estado);
            ResultSet rs = prest.executeQuery();
            
            
            while(rs.next()){
            	// Lee cada uno de las columnas de la tabla
            	covid = new ModeloCovid();
            	covid.setId(rs.getString(1));
            	covid.setSexo(rs.getInt(2));
            	covid.setEntidad(rs.getInt(3));
            	covid.setEdad(rs.getInt(4));
            	covid.setEpoc(rs.getInt(5));
            	covid.setAsma(rs.getInt(6));
            	covid.setHipertension(rs.getInt(7));
            	covid.setObesidad(rs.getInt(8));
            	System.out.println(rs.getInt(3));
            	listacovid.add(covid);
            		
            }
            
		
		}catch(Exception ex){
			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
		return listacovid;
		
		
	}

}
