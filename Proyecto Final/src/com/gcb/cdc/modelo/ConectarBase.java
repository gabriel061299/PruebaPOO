package com.gcb.cdc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectarBase {
	
	private static Connection conn; //Objeto de tipo Connection 
	private static final String driver = "com.mysql.jdbc.Driver";
	//private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	private static final String user = "root";
	private static final String password = "";
	// En el panel de control de Xampp hay una columna de Ports,
	// Identificar el de MySQL
	                                                  // puerto nombre BD
	//url ="jdbc:mysql://" + host + ":" + port + "/" + database;
	//private static final String url = "jdbc:mysql://localhost:3309/clinica";
	private static final String url = "jdbc:mysql://localhost:3306/pruebapoo";
	
	public ConectarBase(){
		conn = null;
		try{
		
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		
			JOptionPane.showMessageDialog(null, "Se conecto","Conexión Base de Datos",JOptionPane.INFORMATION_MESSAGE);
			
			if (conn != null){
				System.out.println("Se conectó MP");
			}
			
		}catch (Exception e){
			
			System.out.println("NO Se conectó");
		}	
	}
	// Recupera el objeto de tipo Connection
	public Connection getConnection(){
		
		return conn;
	}

	// Método para cerrar la conexión. 
	public void DesConnecton(){

		conn = null;
		if(conn == null){
			System.out.println("Terminó conexión");
		}
   }

}

