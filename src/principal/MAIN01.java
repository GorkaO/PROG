

package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MAIN01 {
	
	public static void main(String[] args) {
	
try {
			
			//se carga el driver
			Class.forName("com.mysql.jdbc.Driver");
						
			//crear la conexion con la BBDD biblioteca
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
			
			//statement para ejecutar querys
			Statement st = con.createStatement();
			
			//ejecutar query
			ResultSet rs = st.executeQuery("select * from libros");
						
			//imprimir en pantalla el resultado de la consulta
			while(rs.next()) {
				
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("num_pag")); 
			}
			
}catch(SQLException e) {
	e.printStackTrace();
}catch(ClassNotFoundException e) {
	e.printStackTrace();
}

		public static void updateNumPag() {
			
			Scanner scan=new Scanner(System.in);
			String titulo;
			int numpaginas;
			System.out.println("Introduce el titulo del libro a modificar");
			titulo=scan.nextLine();
			System.out.println("Introduce el nuevo valor para numero de paginas");
			numpaginas=Integer.parseInt(scan.nextLine());
		}
		
		public static void verlibro() {
			
			LibroModelo lm=new LibroModelo();
			
		}

	}
}
			

			