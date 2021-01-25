package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class LibroModelo extends Conector {
	
	public ArrayList<Libro>selectallLibros() {
	
		ArrayList <Libro> ListaLibros = new ArrayList <Libro>();
			
		try {
		//ejecutar query
				
				Statement st=super.conexion.createStatement();
				ResultSet rs = st.executeQuery("select * from libros");
							
				//imprimir en pantalla el resultado de la consulta
				while(rs.next()) {
					
					Libro l1 = new Libro();
					l1.setId(rs.getInt("id"));
					l1.setTitulo(rs.getString("titulo"));
					l1.setAutor(rs.getString("autor"));
					l1.setNum_pag(rs.getInt("num_pag"));
					
					// añadir libro al arrayList
					
					ListaLibros.add(l1);
				
			
					
			}// cerrar while
				
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
				return ListaLibros;
		
	}
	
	public void selectTitulo (String titulo) {
		Libro libro = new Libro();
		try {
			
			Statement st = super.conexion.createStatement();
			
			ResultSet rs = st.executeQuery(" select " * from libro where titulo) 
		}
	}

	public void updateLibroPag(String titulo, int numpaginas) {
		
		PreparedStatement pst;
		try {
			
			pst = super.conexion.prepareStatement("update libros set num_pag=? where titulo=?");
			pst.setInt(1, numpaginas);
			pst.setString(2, titulo);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
		
		
	}



