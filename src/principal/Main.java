package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
	
try {
			
			//se carga el driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//crear la conexion con la BBDD biblioteca
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			
			//statement para ejecutar querys
			Statement st = con.createStatement();
			
			//ejecutar query
			ResultSet rs = st.executeQuery("select * from usuarios");
			
			//imprimir en pantalla el resultado de la consulta
			while(rs.next()) {
				
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellido"));
				System.out.println(rs.getString("dni"));
				System.out.println(rs.getString("admin"));
				System.out.println(rs.getString("password"));
			}
			
			//ejecutar un insert
			st.execute("INSERT INTO usuarios(nombre, apellido, dni, admin, password) VALUES ('mauricio', 'diaz', '777777e', '0', '2131231231')");
			
		
			
				
				
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}

}
